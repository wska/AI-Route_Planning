from simanneal import Annealer
import networkx as nx
import matplotlib.pyplot as plt
import os
from random import randint

import numpy as np

import constants as ct
import utils
import math


# This is the problem we are solving
class PathsProblem(Annealer):
    def move(self):
        # we may have to try multiple times if an edge can or cannot be removed
        # we give it a maximum number of tries and if it can't change the graph then it just won't
        for i in range(20):
            agent_idx = randint(0, len(self.state) - 1)
            agent = self.state[agent_idx]

            idx = randint(0, len(agent) - 1)
            edge = agent[idx]

            # starting, ending nodes
            a = agent[0][0]
            b = edge[1]

            for path in nx.all_simple_paths(self.graph, source=a, target=b):
                edge_path = utils.vertex_path_to_edge_path(path)
                if edge not in edge_path:
                    self.state[agent_idx] = edge_path + agent[idx + 1:]
                    return

    def energy(self):

        self.temperatures.append(self.Tmax * math.exp(
            self.Tfactor * len(self.energies) / self.steps))

        ener = utils.collective_cost(self.graph, self.state)

        self.energies.append(ener)

        return ener

    def __init__(self, state, graph):
        """
        :param state: Is a list of lists, each list represents a path for a single agent, it changes
        [
            [(a, b), (b, c), (c, f) ... (.., z)]
        ]
        :param graph: Is the graph/map it is a NetworkX graph object instance it doesn't change.
        """
        self.graph = graph
        self.temperatures = list()
        self.energies = list()
        super(PathsProblem, self).__init__(state)


def main():
    graph, init_states = utils.read_graph(os.getcwd() + ct.EDGE_LIST_PATH,
                                          os.getcwd() + ct.INITIAL_STATE_PATH)

    init_paths = utils.initial_guess(init_states, graph)
    prob = PathsProblem(init_paths, graph)
    prob.steps = 20000
    prob.Tfactor = -math.log(prob.Tmax / prob.Tmin)

    state, e = prob.anneal()

    print('Original ')
    for path in init_paths:
        print(path)
    print(utils.collective_cost(graph, init_paths))

    print('Annealed')
    for path in state:
        print(path)
    print(e)

    utils.plot_graph_paths_max(graph, paths=init_paths)
    utils.plot_graph_paths_max(graph, paths=state)
    plt.show()

    x = np.array(range(len(prob.energies)))
    y = np.array(prob.energies)

    plt.plot(x, y)
    plt.xlabel("Step")
    plt.ylabel("Cost function")

    plt.show()


if __name__ == '__main__':
    main()
