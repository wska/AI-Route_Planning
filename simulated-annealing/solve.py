from simanneal import Annealer
from numpy import tanh
import networkx as nx
import matplotlib.pyplot as plt
import constants as ct
import os

import Utils

# This is the problem we are solving
class PathsProblem(Annealer):
    def move(self):

        return None


    def energy(self):
        total_cost = 0
        # this way we assume each agent is travelling for T time steps
        for t in range(len(self.state[0])):
            for edge in self.graph.edges:
                num_agents_on_edge = 0
                for agent in self.state:
                    if agent[t] == edge:
                        num_agents_on_edge += 1
                total_cost += 5 * tanh(num_agents_on_edge / 3)
        return total_cost

    def __init__(self, state, graph):
        """
        :param state: Is a list of lists, each list represents a path for a single agent
        [
            [(a, b), (b, c), (c, f) ... (.., z)]
        ]
        :param graph: Is the graph/map it is a NetworkX graph object instance
        """
        self.graph = graph
        super(PathsProblem, self).__init__(state)




# give an initial set of paths for each agent
def initial_guess(init_states, graph):
    """

    :param init_states: [(init_node, goal_node), ..., (init_node, goal_node)]
    :param graph:
    :return:
    """
    init_paths = []

    for start, goal in init_states:

        shortest = nx.shortest_path(graph, source=start, target=goal)

        shortest = Utils.vertex_path_to_edge_path(shortest)

        init_paths.append(shortest)


    return init_paths


def main():
    # read graph
    #
    #
    # graph = nx.read_edgelist(os.getcwd() + ct.EDGE_LIST_PATH)
    #
    # nx.draw(graph)
    #
    # plt.show()


    graph, init_states = Utils.read_graph(os.getcwd() + ct.EDGE_LIST_PATH, os.getcwd() + ct.INITIAL_STATE_PATH)

    prob = PathsProblem(initial_guess(init_states, graph), graph)
    prob.steps = 100000

    state, e = prob.anneal()

    print(state, e)

if __name__ == '__main__':
    main()