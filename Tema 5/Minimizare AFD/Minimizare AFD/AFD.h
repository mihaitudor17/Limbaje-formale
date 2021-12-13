#pragma once
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
class AFD
{
	std::vector<std::string> q;
	std::string sigma;
	std::unordered_map<std::pair<std::string, char>, std::string, hash_pair> delta;
	std::string stare_init;
	std::vector<std::string> stare_fin;
public:
	void output(std::string);
	void read(std::string);
	bool verificaton();
	int accepted(std::string);
	std::string transition(std::string, char);
	void inaccessible();
	void minimization();
	void rename(std::vector<std::string>);
	AFD();

};

