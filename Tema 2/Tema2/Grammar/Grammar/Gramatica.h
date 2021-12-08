#pragma once
#include <vector>
#include <string>
#include <iostream>
class Gramatica
{
private:
	std::string VN,VT,S;
	std::vector < std::pair< std::string, std::string>> P;
public:
	void setVN(std::string input){VN = input;}
	void setVT(std::string input){VT = input;}
	void setS(std::string input){S = input;}
	void setP(std::vector < std::pair< std::string, std::string>> input){P = input;}
	std::string getVN(){return VN;}
	std::string getVT(){return VT;}
	std::string getS(){return S;}
	std::vector < std::pair< std::string, std::string>> getP(){return P;}
	bool verificare();
	void generare(bool optiune, std::vector<std::string>& explored);
	void afisare();
	Gramatica(std::string vn, std::string vt, std::string s, std::vector < std::pair< std::string, std::string>> p);
};

