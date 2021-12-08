#include <iostream>
#include <fstream>
#include <vector>
#include <tuple>
#include <string>
#include <sstream>
#include <unordered_map>

struct hash_pair {
	template <class T1, class T2>
	size_t operator()(const std::pair<T1, T2>& p) const
	{
		auto hash1 = std::hash<T1>{}(p.first);
		auto hash2 = std::hash<T2>{}(p.second);
		return hash1 ^ hash2;
	}
};
void read(std::vector<std::string>&q,std::string&sigma, std::unordered_map<std::pair<std::string, char>, std::string, hash_pair>& delta,std::string&stare_init,std::vector<std::string>&stare_fin)
{
	std::ifstream f("input.txt");
	std::string temp,word,word1,word2;
	std::getline(f, temp);
	std::stringstream tss(temp);
	while (tss >> word)
		q.push_back(word);
	std::getline(f, temp);
	tss.str("");
	tss.clear();
	tss << temp;
	while (tss >> word)
		sigma += word;
	tss.str("");
	tss.clear();
	tss << temp;
	bool ok;
	std::getline(f, temp);
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
				std::pair <std::string, char> p(word, word1[0]);
				delta[p] = word2;
			}
		}
	} while (ok&&std::getline(f,temp));
	stare_init = temp;
	std::getline(f, temp);
	tss.str("");
	tss.clear();
	tss << temp;
	while (tss >> word)
		stare_fin.push_back(word);
}
void output(std::vector<std::string> q, std::string sigma, std::unordered_map<std::pair<std::string, char>, std::string, hash_pair> delta, std::string stare_init, std::vector<std::string> stare_fin)
{
	std::cout << "Q: ";
	for (int i = 0; i < q.size(); i++)
	{
		std::cout << q[i]<<" ";
	}
	std::cout << std::endl;
	std::cout << "Sigma: ";
	for (int i = 0; i < sigma.size(); i++)
	{
		std::cout << sigma[i] << " ";
	}
	std::cout << std::endl;
	std::cout << "Delta: " << std::endl;
	for (auto p : delta)
		std::cout << (p.first).first << " "
		<< (p.first).second << " "
		<< p.second << std::endl;
	std::cout << "S: ";
	std::cout << stare_init << std::endl;
	std::cout << "F: ";
	for (int i = 0; i < stare_fin.size(); i++)
	{
		std::cout << stare_fin[i] << " ";
	}
	std::cout << std::endl;
}
std::string transition(std::string state, char character, std::unordered_map<std::pair<std::string, char>, std::string, hash_pair> delta)
{
	std::pair<std::string, char> p(state, character);
	if (delta.find(p) != delta.end())
	{
		return delta[p];
	}
	return "NULL";
}
bool verificaton(std::vector<std::string> q, std::string sigma, std::unordered_map<std::pair<std::string, char>, std::string, hash_pair> delta , std::string stare_init, std::vector<std::string> stare_fin)
{
	if (std::find(q.begin(), q.end(), stare_init) == q.end())
		return 0;
	for(int i=0;i<stare_fin.size();i++)
		if (std::find(q.begin(), q.end(), stare_fin[i]) == q.end())
			return 0;
	for (auto p : delta)
	{
		if (std::find(q.begin(), q.end(), (p.first).first) == q.end())
			return 0;
		if (std::find(q.begin(), q.end(), p.second) == q.end())
			return 0;
		std::string temp(1,(p.first).second);
		std::size_t found = sigma.find(temp);
		if (found == std::string::npos)
			return 0;
	}
	return 1;
}
int accepted(std::string word, std::unordered_map<std::pair<std::string, char>, std::string, hash_pair> delta, std::string stare_init, std::vector<std::string> stare_fin)
{
	std::string state = transition(stare_init, word[0], delta);
	for (int i = 1; i < word.size(); i++)
	{
		if (state == "NULL")
			return -1;
		else
		{
			state = transition(state, word[i], delta);
		} 
	}
	if (state == "NULL")
		return -1;
	else
	if (std::find(stare_fin.begin(), stare_fin.end(), state) != stare_fin.end())
		return 1;
	else
		return 0;
}
int main()
{
	std::vector<std::string>q;
	std::string sigma;
	std::unordered_map<std::pair<std::string, char>,std::string,hash_pair> delta;
	std::string stare_init;
	std::vector<std::string> stare_fin;
	read(q, sigma, delta, stare_init, stare_fin);
	output(q, sigma, delta, stare_init, stare_fin);
	if (verificaton(q, sigma, delta, stare_init, stare_fin))
		std::cout << "Automatul este valid";
	else
		std::cout << "Automatul este invalid";
	std::cout << std::endl;
	std::string input;
	do {
		std::cout << "Introduceti cuvant (/e pentru escape):";
		std::cin >> input;
		if (input != "/e")
		{
			switch (accepted(input, delta, stare_init, stare_fin))
			{
			case -1:
				std::cout << "Automat blocat";
				break;
			case 0:
				std::cout << "Cuvant neacceptat";
				break;
			case 1:
				std::cout << "Cuvant acceptat";
				break;
			}
			std::cout << std::endl;
		}
	} while (input != "/e");
}