#include "Gramatica.h"
#include <fstream>
void citire(std::string& VN,std::string& VT, std::string& S,std::vector<std::pair<std::string, std::string>>& P)
{
	std::ifstream f("input.txt");
	getline(f, VN);
	getline(f, VT);
	getline(f, S);
	std::string temp;
	while (std::getline(f, temp))
	{ 
		std::string temp1, temp2;
		std::size_t found = temp.find("->");
		temp1 = temp.substr(0, found );
		temp2 = temp.substr(found+2);
		P.push_back(std::make_pair(temp1, temp2));
	}
	Gramatica gramatica(VN, VT, S, P);
	
}
void generator(Gramatica gramatica)
{
	std::vector<std::string> explored;
	if (gramatica.verificare())
	{
		std::cout << "Inserati numarul de cuvinte dorit: ";
		int n;
		std::cin >> n;
		for (int i = 0; i < n; i++)
		{
			 gramatica.generare(0,explored);
			 if (explored.size() <= i)
			 {
				 i--;
			 }
		}
	}
	else
	{
		std::cout << "Gramatica invalida" << std::endl;
	}
	gramatica.afisare();
}
int main()
{
	std::string VN, VT, S;
	std::vector<std::pair<std::string, std::string>> P;
	citire(VN, VT, S, P);
	Gramatica gramatica(VN, VT, S, P);
	generator(gramatica);

}

