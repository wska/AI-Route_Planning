from simanneal import Annealer
import networkx as nx
import matplotlib.pyplot as plt
import os
from random import randint

import constants as ct
import utils


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
        return utils.collective_cost(self.graph, self.state)

    def __init__(self, state, graph):
        """
        :param state: Is a list of lists, each list represents a path for a single agent, it changes
        [
            [(a, b), (b, c), (c, f) ... (.., z)]
        ]
        :param graph: Is the graph/map it is a NetworkX graph object instance it doesn't change.
        """
        self.graph = graph
        super(PathsProblem, self).__init__(state)



def main():
    graph, init_states = utils.read_graph(os.getcwd() + ct.EDGE_LIST_PATH, os.getcwd() + ct.INITIAL_STATE_PATH)

    init_paths = utils.initial_guess(init_states, graph)
    prob = PathsProblem(init_paths, graph)
    prob.steps = 10000

    state, e = prob.anneal()

    print('Original ')
    for path in init_paths:
        print(path)
    print(collective_cost(graph, init_paths))

    print('Annealed')
    for path in state:
        print(path)
    print(e)

    utils.plot_graph_paths(graph, paths=init_paths)
    utils.plot_graph_paths(graph, paths=state)

    plt.show()

if __name__ == '__main__':
    main()
