#include "AFN.h"
#include <queue>
#include "TextTable.h"
void AFN::afisare(AFN automata)
{
	std::vector<char> alfabet;
	for (int i = 0; i < automata.sigma.size(); i++)
	{
		if (sigma[i] != ' ')
			alfabet.push_back(sigma[i]);
	}
	std::vector<std::vector<std::string>> tabel;
	tabel.resize(automata.q.size());
	for (auto [X, Y, Z] : automata.delta)
	{
		auto it = std::find(automata.q.begin(), automata.q.end(), X);
		int index = it - automata.q.begin();
		tabel[index].resize(alfabet.size());
		auto it1 = std::find(alfabet.begin(), alfabet.end(), Y);
		int index1 = it1 - alfabet.begin();
		if (tabel[index][index1] != "")
			tabel[index][index1] += " " + Z;
		else
			tabel[index][index1] += Z;
	}
	TextTable t;
	t.add("");
	for (int i = 0; i < automata.sigma.size(); i++)
	{
		std::string temp(1, automata.sigma[i]);
		if (temp != " ")
			t.add(temp);
	}
	t.endOfRow();
	for (int i = 0; i < tabel.size(); i++)
	{
		t.add(automata.q[i]);
		for (int j = 0; j < tabel[i].size(); j++)
			t.add(tabel[i][j]);
		t.endOfRow();
	}
	t.setAlignment(2, TextTable::Alignment::LEFT);
	std::cout << t;
}
bool AFN::verificare(AFN automata)
{
	auto it = std::find(automata.q.begin(), automata.q.end(), automata.q0);
	if (it == automata.q.end())
		return 0;
	for (int i = 0; i < automata.f.size(); i++)
	{
		it = std::find(automata.q.begin(), automata.q.end(), automata.f[i]);
		if (it == automata.q.end())
			return 0;
	}
	for (auto [X, Y, Z] : automata.delta)
	{
		it = std::find(automata.q.begin(), automata.q.end(), X);
		if (it == automata.q.end())
			return 0;
		std::string temp(1, Y);
		std::size_t found = automata.sigma.find(temp);
		if (found == std::string::npos)
			return 0;
		it = std::find(automata.q.begin(), automata.q.end(), Z);
		if (it == automata.q.end())
			return 0;
	}
	return 1;
}
int AFN::accepta(AFN automata, std::string cuvant)
{
	std::queue<std::string> stari;
	std::queue<std::string> temp;
	stari.push(automata.q0);
	int poz = 0;
	while (poz < cuvant.size())
	{
		if (!stari.empty())
		{
			std::string stareAct = stari.front();
			stari.pop();
			for (auto [X, Y, Z] : automata.delta)
			{
				if (stareAct == X && cuvant[poz] == Y)
					temp.push(Z);

			}
		}
		else
		{

			if (!temp.empty())
			{
				stari = temp;
				while (!temp.empty())
					temp.pop();
			}
			poz++;
		}
	}
	if (stari.empty())
		return 0;
	else
	{
		while (!stari.empty())
		{
			std::string stareAct = stari.front();
			stari.pop();
			auto it = std::find(automata.f.begin(), automata.f.end(), stareAct);
			if (it != automata.f.end())
				return 1;
		}
		return -1;
	}

}
