#include <vector>
#include <string>
#include <iostream>
void read(std::string& word)
{
    std::cout << "Introduceti cuvant: ";
    std::cin >> word;
}
void prefix(const std::string word, std::vector<std::string>& prefixes)
{
    
    prefixes.resize(word.size() - 1);
    prefixes[0] = word[0];
    std::cout << prefixes[0];
    std::cout << std::endl;
    for (int i = 1; i < word.size() - 1; i++)
    {
        prefixes[i] = prefixes[i - 1] + word[i];
        std::cout << prefixes[i] << std::endl;
    }
}
int main()
{
    std::string word;
    std::vector<std::string> prefixes;
    read(word);
    prefix(word,prefixes);
    return 0;

}

