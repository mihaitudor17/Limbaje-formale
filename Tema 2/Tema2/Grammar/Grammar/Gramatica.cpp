#include "Gramatica.h"
#include <random>
bool Gramatica::verificare()
{
	for (int i = 0; i < VT.size(); i++)
	{
		std::string temp(1, VT[i]);
		size_t found = VN.find(temp);
		if (found != std::string::npos)
			return false;
	}
	for (int i = 0; i < S.size(); i++)
	{
		std::string temp(1, S[i]);
		size_t found = VN.find(temp);
		if (found == std::string::npos)
			return false;
	
	}
	bool ok = 0, ok1 = 0;
	for (int i = 0; i < P.size(); i++)
	{
		ok1 = 0;
		for (int j = 0; j < VN.size(); j++)
		{
			std::string temp(1, VN[j]);
			size_t found = P[i].first.find(temp);
			if (found != std::string::npos)
				 ok1 = 1;
		}
		if (!ok1)
			 return false;
		if (!ok)
		{
			if (P[i].first == S)
			{
				ok = true;
				
			}

		}
		for (int j = 0; j < P[i].first.size(); j++)
		{
			int ok2=1, ok3=1;
			std::string temp(1, P[i].first[j]);
			size_t found = VN.find(temp);
			size_t found1 = VT.find(temp);
			if (found == std::string::npos)  
			{
				ok2 = 0;
			}
			if(found1 == std::string::npos)
			{
				ok3 = 0;
			}
			if (!ok3 && !ok2)
				return false;
		}
		for (int j = 0; j < P[i].second.size(); j++)
		{
			int ok2 = 1, ok3 = 1;
			std::string temp(1, P[i].second[j]);
			size_t found = VN.find(temp);
			size_t found1 = VT.find(temp);
			if (found == std::string::npos)
			{
				ok2 = 0;
			}
			if (found1 == std::string::npos)
			{
				ok3 = 0;
			}
			if (!ok3 && !ok2)
				return false;
		}
	}
	if (!ok)
		return false;
	return true;
}

void Gramatica::generare(bool optiune, std::vector<std::string>& explored)
{
	std::string output;
	std::string word = S;
	std::vector<int>productieAplicab;
	if (optiune)
		output += word;
	do{
		productieAplicab.resize(0);
		for (int i = 0; i < P.size(); i++)
		{
			size_t found = word.find(P[i].first);
			if (found != std::string::npos)
				productieAplicab.push_back(i);
		}
		if (!productieAplicab.empty())
		{
			std::random_device rd;
			std::mt19937 gen(rd());
			std::uniform_int_distribution<> dis(0, productieAplicab.size() - 1);
			int rand = dis(gen);
			size_t found = word.find(P[productieAplicab[rand]].first);
			word.replace(found, P[productieAplicab[rand]].first.size(), P[productieAplicab[rand]].second);
			if (optiune)
			{output+= "(" + std::to_string(productieAplicab[rand] + 1) + ")" + " -> " + word; }
		}
	} while (productieAplicab.size() > 0);
	if(optiune)std::cout << std::endl;
	if (std::find(explored.begin(), explored.end(), word) == explored.end() || explored.empty())
	{
		int ok = 1;
		for (int i = 0; i < word.size(); i++)
		{
			size_t found = VT.find(word[i]);
			if (found == std::string::npos)
				ok = 0;
		}
		if (ok)
		{
			explored.push_back(word);
			if (optiune == 0)
				std::cout << word << std::endl;
			else
				std::cout << output << std::endl;
		}

	}
}

void Gramatica::afisare()
{
	std::cout << "VN: " << VN << std::endl;
	std::cout << "VT: " << VT << std::endl;
	std::cout << "S: " << S << std::endl;
	for (int i = 0; i < P.size(); i++)
		std::cout << P[i].first << " -> " << P[i].second << std::endl;
}

Gramatica::Gramatica(std::string vn, std::string vt, std::string s, std::vector<std::pair<std::string, std::string>> p)
{
	VN = vn;
	VT = vt;
	S = s;
	P = p;
}
