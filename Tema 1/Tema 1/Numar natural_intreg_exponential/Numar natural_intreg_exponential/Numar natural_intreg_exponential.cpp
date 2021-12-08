#include <iostream>
#include <regex>
#include <string>
void read(std::string& number)
{
    std::cout << "Citeste numar: ";
    std::cin >> number;
}
void type(const std::string number)
{
    if (std::regex_match(number, std::regex("([+]?([1-9]+[0-9]*)|([0]))")))
    {
        std::cout << "Numar natural";
    }
    else
        if (std::regex_match(number, std::regex("([+-]?([1-9]+[0-9]*)|([0]))")))
        {
            std::cout << "Numar intreg";
        }
        else
            if (std::regex_match(number, std::regex("([+-]?([1-9]+[0-9]*)|([0])[.]?[0-9]+[eE]?[+-]?[1-9][0-9]*)")))
            {
                std::cout << "Numar real";
            }
            else
                std::cout << "Nu este valid";
}
int main()
{
    std::string number;
    read(number);
    type(number);
    return 0;
}

