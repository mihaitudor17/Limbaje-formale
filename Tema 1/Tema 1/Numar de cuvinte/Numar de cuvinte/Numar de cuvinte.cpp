#include <string>
#include <iostream>
#include <sstream>
#include <regex>
void read(std::string& fraza)
{
    std::cout << "Introduceti fraza: ";
    std::getline(std::cin, fraza);
}
void nrCuv(const std::string fraza)
{
    std::istringstream iss(fraza);
    std::string token;
    int i = 1;
    while (std::getline(iss, token, ' '))
    {
        if (std::regex_match(token, std::regex("[a-zA-Z]+")))
        {
            std::cout << i << "." << token << std::endl;
            i++;
        }
    }
}
int main()
{
    std::string fraza;
    read(fraza);
    nrCuv(fraza);
}

