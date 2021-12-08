#pragma once
#include <vector>
#include <string>
class AFN
{
private:
	std::vector<std::string>q;
	std::string sigma;
	std::vector<std::tuple<std::string, char, std::string>> delta;
	std::string q0;
	std::vector<std::string> f;
public:
	AFN(std::vector<std::string>Q, std::string Sigma, std::vector<std::tuple<std::string, char, std::string>> Delta, std::string Q0, std::vector<std::string> F)
	{
		q = Q;
		sigma = Sigma;
		delta = Delta;
		q0 = Q0;
		f = F;
	}
	void afisare(AFN);
	bool verificare(AFN);
	int accepta(AFN, std::string);
};