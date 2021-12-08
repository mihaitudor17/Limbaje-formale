#include "AFN.h"
#include <fstream>
#include <iostream>
#include <sstream>
#include <Windows.h>
AFN citire()
{
	std::vector<std::string>q;
	std::string sigma;
	std::vector<std::tuple<std::string, char, std::string>> delta;
	std::string q0;
	std::vector<std::string> f;
	std::ifstream g("input.txt");
	std::string word, word1, word2, temp;

	std::getline(g, temp);
	std::stringstream tss(temp);
	while (tss >> word)
		q.push_back(word);
	std::getline(g, temp);
	tss.str("");
	tss.clear();
	tss << temp;
	while (tss >> word)
		sigma += word;
	tss.str("");
	tss.clear();
	bool ok;
	std::getline(g, temp);
	do
	{
		ok = 0;
		tss.str("");
		tss.clear();
		tss << temp;
		size_t found = temp.find(" ");
		if (found != std::string::npos)
		{
			if (temp.size() > 2)
			{
				ok = 1;
				tss >> word >> word1 >> word2;
				std::tuple <std::string, char, std::string> p(word, word1[0], word2);
				delta.push_back(p);
			}
		}
	} while (ok && std::getline(g, temp));
	q0 = temp;
	std::getline(g, temp);
	tss.str("");
	tss.clear();
	tss << temp;
	while (tss >> word)
		f.push_back(word);
	AFN automata(q, sigma, delta, q0, f);
	return automata;

}
int main()
{
	AFN automata = citire();
	if (automata.verificare(automata))
	{
		std::cout << "Automat acceptat!" << std::endl;
		std::cout << "Apasati esc pentru a iesi" << std::endl;
		automata.afisare(automata);
		do {
			std::cout << "Introduceti cuvant: ";
			std::string temp;
			std::cin >> temp;
			switch (automata.accepta(automata, temp))
			{
			case -1:
				std::cout << "Cuvant neacceptat\n";
				break;
			case 0:
				std::cout << "Automat blocat\n";
				break;
			case 1:
				std::cout << "Cuvant acceptat\n";
				break;
			}
		} while (!GetAsyncKeyState(VK_ESCAPE));
	}
	else
	{
		std::cout << "Automat neacceptat!";
	}
}
