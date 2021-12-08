#include <string>
#include <iostream>
#include <fstream>
void read(char& c,std::string& str)
{
    std::cout << "Introduceti caracter: ";
    std::cin >> c;
	std::cout << "Introduceti sir: ";
	std::cin.ignore();
	std::getline(std::cin,str);
	std::cout << "Numarul de aparitii este: ";
}
void occurence(char c, const std::string str)
{
	auto char_to_find = c;
	int number = 0;
	auto location = str.find(char_to_find);
	if (location != std::string::npos)
		while (location != std::string::npos)
		{
			number++;
			location = str.find(c, location + 1);
		}
	std::cout << number;
}
int main()
{
	char c;
	std::string str;
	read(c, str);
	occurence(c, str);
	return 0;
}
