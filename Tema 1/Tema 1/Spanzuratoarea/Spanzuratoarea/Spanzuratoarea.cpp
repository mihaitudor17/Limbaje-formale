#include <stdio.h>      
#include <stdlib.h>     
#include <time.h>       
#include <iostream>
#include <fstream>
#include <string>
int random(int number)
{
	srand(time(NULL));
	return rand() % number;
}
void game(const std::string word)
{
	std::string underline;
	underline.resize(word.size());
	for (int i = 0; i < underline.size(); i++)
		underline[i] = '_';
	int fails = 6, letters = underline.size();
	while (fails && letters)
	{
		for (int i = 0; i < underline.size(); i++)
			std::cout << underline[i] << " ";
		std::cout << std::endl << "Mai aveti " << fails << " incercari:";
		char c;
		std::cin >> c;
		auto char_to_find = c;
		auto location= word.find(char_to_find);
		if (location != std::string::npos&&underline[location]=='_')
		{
			while (location != std::string::npos)
			{
				underline[location] = c;
				letters--;
				location = word.find(c, location + 1);
			}
		}
		else
		{
			fails--;
		}
	}
	if (letters == 0)
	{
		std::cout << word << std::endl;
		std::cout << "Ai castigat!";
	}
	else
	{
		std::cout << word << std::endl;
		std::cout << "Ai pierdut!";
	}
}
void read(std::string& word)
{
	std::ifstream f("cuvinte.txt");
	int i = 0;
	while (f)
	{
		f >> word;
		i++;
	}
	i--;
	i = random(i);
	f.clear();               
	f.seekg(0, std::ios::beg);
	for (int j = 0; j < i; j++)
		f >> word;

}
int main()
{
	std::string word;
	read(word);
	game(word);
	return 0;
}