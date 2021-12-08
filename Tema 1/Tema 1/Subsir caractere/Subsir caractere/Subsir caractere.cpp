// Subsir caractere.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <vector>
#include <string>
#include <fstream>
void read(std::vector<std::string>& v, std::string& s1)
{
    std::string temp;
    std::ifstream f("input.txt");
    while (getline(f, temp))
    {
        v.push_back(temp);
    }
    std::cout << "Introduceti subsir: ";
    std::cin >> s1;
}
void verify(const std::vector<std::string> v, std::vector<std::string>& v1, const std::string s1)
{
    for (int i = 0; i < v.size(); i++)
    {
        size_t found = v[i].find(s1);
        if (found != std::string::npos)
            v1.push_back(v[i]);
    }
}
void output(const std::vector<std::string> v1)
{
    std::cout << "Cuvintele sunt: " << std::endl;
    for (int i = 0; i < v1.size(); i++)
    {
        std::cout << v1[i] << std::endl;
    }
}
int main()
{
    std::vector<std::string> v, v1;
    std::string s1;
    read(v, s1);
    verify(v, v1, s1);
    output(v1);
    return 0;
}


