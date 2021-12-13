#include "AFD.h"
#include <Windows.h>
int main()
{
    AFD automata;
    automata.read("input.txt");
	if (automata.verificaton())
	{
		std::cout << "Automatul este valid" << std::endl;
		automata.minimization();
		automata.output("output.txt");

		do {
			std::cout << "Introduceti cuvant (apasati esc pt a iesi):";
				std::string input;
				std::cin >> input;
				switch (automata.accepted(input))
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
			
		} while (!GetAsyncKeyState(VK_ESCAPE));
	}
	else
		std::cout << "Automatul este invalid" << std::endl;
	return 0;
}

