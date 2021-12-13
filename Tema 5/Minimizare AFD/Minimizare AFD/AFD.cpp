#include "AFD.h"
#include <queue>
void AFD::output(std::string path)
{
	std::ofstream g(path);
	g << "Q: ";
	for (int i = 0; i < q.size(); i++)
	{
		g << q[i] << " ";
	}
	g << std::endl;
	g << "Sigma: ";
	for (int i = 0; i < sigma.size(); i++)
	{
		g << sigma[i] << " ";
	}
	g << std::endl;
	g << "Delta: " << std::endl;
	for (auto p : delta)
		g << (p.first).first << " "
		<< (p.first).second << " "
		<< p.second << std::endl;
	g << "S: ";
	g << stare_init << std::endl;
	g << "F: ";
	for (int i = 0; i < stare_fin.size(); i++)
	{
		g << stare_fin[i] << " ";
	}
	g << std::endl;
}

void AFD::read(std::string path)
{
	std::ifstream f(path);
	std::string temp, word, word1, word2;
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
	} while (ok && std::getline(f, temp));
	stare_init = temp;
	std::getline(f, temp);
	tss.str("");
	tss.clear();
	tss << temp;
	while (tss >> word)
		stare_fin.push_back(word);
}

bool AFD::verificaton()
{
	if (std::find(q.begin(), q.end(), stare_init) == q.end())
		return 0;
	for (int i = 0; i < stare_fin.size(); i++)
		if (std::find(q.begin(), q.end(), stare_fin[i]) == q.end())
			return 0;
	for (auto p : delta)
	{
		if (std::find(q.begin(), q.end(), (p.first).first) == q.end())
			return 0;
		if (std::find(q.begin(), q.end(), p.second) == q.end())
			return 0;
		std::string temp(1, (p.first).second);
		std::size_t found = sigma.find(temp);
		if (found == std::string::npos)
			return 0;
	}
	return 1;
}

int AFD::accepted(std::string word)
{
	std::string state = transition(stare_init, word[0]);
	for (int i = 1; i < word.size(); i++)
	{
		if (state == "NULL")
			return -1;
		else
		{
			state = transition(state, word[i]);
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

std::string AFD::transition(std::string state, char character)
{
	std::pair<std::string, char> p(state, character);
	if (delta.find(p) != delta.end())
	{
		return delta[p];
	}
	return "NULL";
}

void AFD::inaccessible()
{
	std::queue<std::string> bfs;
	std::vector<int> visited;
	auto it= find(q.begin(), q.end(), stare_init);
	int index = std::distance(q.begin(), it);
	visited.resize(q.size(),0);
	visited[index] = 1;
	bfs.push(stare_init);
	while (!bfs.empty())
	{
		std::string temp = bfs.front();
		bfs.pop();
		for (int i = 0; i < sigma.size(); i++)
		{
			auto p = std::make_pair(temp, sigma[i]);
			auto ind = delta.find(p);
			if (ind != delta.end())
			{
				it = find(q.begin(), q.end(), ind->second);
				index = std::distance(q.begin(), it);
				if (visited[index] == 0)
				{
					visited[index]++;
					bfs.push(ind->second);
				}
			}
		}
	}
	for (int i = 0; i < visited.size(); i++)
	{
		if (visited[i] == 0)
		{
			std::string temp = q[i];
			for (int j = 0; j < sigma.size(); j++)
			{
				auto p = std::make_pair(temp, sigma[j]);
				auto ind = delta.find(p);
				if (ind != delta.end())
				{
					delta.erase(p);
					auto it = std::find(stare_fin.begin(), stare_fin.end(), temp);
					if (it != stare_fin.end())
						stare_fin.erase(it);
					it = std::find(q.begin(), q.end(), temp);
					if (it != q.end())
						q.erase(it);
				}
			}
		}
	}
}

void AFD::minimization()
{
	inaccessible();
	std::vector<std::vector<int>> matrix;
	matrix.resize(q.size());
	for (int i = 0; i < matrix.size(); i++)
	{
		matrix[i].resize(i,0);
	}
	bool ok = true;
	while (ok)
	{
		ok = false;
		for (int i = 0; i < matrix.size(); i++)
		{
			for (int j = 0; j < matrix[i].size(); j++)
			{
				for (int k = 0; k < sigma.size(); k++)
				{
					std::string state1="", state2="";
					auto p = std::make_pair(q[i], sigma[k]);
					auto ind = delta.find(p);
					if (ind != delta.end())
					{
						state1 = ind->second;
					}
					p = std::make_pair(q[j], sigma[k]);
					ind = delta.find(p);
					if (ind != delta.end())
					{
						state2 = ind->second;
					}
					if (!state1.empty() && !state2.empty())
					{
						auto it1 = std::find(stare_fin.begin(), stare_fin.end(), state1);
						auto it2 = std::find(stare_fin.begin(), stare_fin.end(), state2);
						auto it3 = std::find(q.begin(), q.end(), state1);
						auto it4 = std::find(q.begin(), q.end(), state2);
						int index1 = std::distance(q.begin(), it3);
						int index2 = std::distance(q.begin(), it4);
						if (index1 != index2)
						{
							if ((it1 != stare_fin.end() ^ it2 != stare_fin.end()&&(it1!=it2)) || (matrix[index1 > index2 ? index1 : index2][index1 < index2 ? index1 : index2] == 1))
							{
								if (matrix[i][j] != 1)
									ok = true;
								matrix[i][j] = 1;
								k = sigma.size();
							}
						}
					}
				}
			}
		}
	}
	std::vector<std::string> deleted;
	for (int i = 0; i < matrix.size(); i++)
	{
		for (int j = 0; j < matrix[i].size(); j++)
		{
			if (matrix[i][j] == 0)
			{
				std::string temp = q[j];
				deleted.push_back(temp);
				for (int k = 0; k < sigma.size(); k++)
				{
					auto p = std::make_pair(temp, sigma[k]);
					auto ind = delta.find(p);
					if (ind != delta.end())
					{
						std::string state = ind->second;
						delta.erase(p);
						p.first = q[i];
						if (state == temp)
							state = q[i];
						delta.insert(std::make_pair(p, state));
					}
				}
				auto it = std::find(stare_fin.begin(), stare_fin.end(), temp);
				if (it != stare_fin.end())
				{
					stare_fin.erase(it);
				}
				if (stare_init == temp)
					stare_init = q[i];
				for (auto ind=delta.begin() ;ind!=delta.end();ind++)
				{
					if (ind->second == temp)
					{
						ind->second = q[i];
					}
				}
			}
		}
	}
	std::vector<std::string>name = q;
	for (int i = 0; i < deleted.size(); i++)
	{
		auto it = std::find(q.begin(), q.end(), deleted[i]);
		q.erase(it);
	}
	rename(name);
}
void AFD::rename(std::vector<std::string>name)
{
	for (int i = 0; i < q.size(); i++)
	{
		std::string temp = q[i];
		if (q[i] != name[i])
		{
			for (int k = 0; k < sigma.size(); k++)
			{
				auto p = std::make_pair(q[i], sigma[k]);
				auto ind = delta.find(p);
				std::string state = ind->second;
				if (ind != delta.end())
				{
					delta.erase(p);
					if (state == q[i])
						state = name[i];
					p.first = name[i];
					delta.insert(std::make_pair(p, state));
				}
			}
			for (auto ind = delta.begin(); ind != delta.end(); ind++)
			{
				if (ind->second == temp)
				{
					ind->second = name[i];
				}
			}
		}

	}
	for (int i = 0; i < stare_fin.size();i++)
	{
		auto it = std::find(q.begin(), q.end(), stare_fin[i]);
		int index = std::distance(q.begin(), it);
		stare_fin[i] = name[index];
	}
	for (int i = 0; i < q.size(); i++)
	{
		q[i] = name[i];
	}
	stare_init = name[0];

}


AFD::AFD()
{
}
