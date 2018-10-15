from simanneal import Annealer
from math import log10
import networkx as nx
import matplotlib.pyplot as plt
import os
from random import randint

import constants as ct
import utils


def congestion_cost(n):
    """
    Piecewise function which is linear until n=2, then quadratic, then
    logarithmic. I figure that up to a certain point, some more traffic is fine,
    then it gets a lot worse, but after some point the road cannot handle any
    more traffic at all
    :param n:
    :return:
    """
    if n < 2:
        return n
    elif n < 10:
        return 1.0 / 2.0 * n ** 2
    else:
        return log10(n) * 50


def collective_cost(graph, agents_paths):
    total_cost = 0

    edge_pool = set([link for agent in agents_paths for link in agent])

    # this way we assume each agent is travelling for T time steps
    for t in range(nx.number_of_nodes(graph)):
        for edge in edge_pool:
            num_agents_on_edge = 0
            for agent in agents_paths:
                if t < len(agent) and agent[t] == edge:
                    num_agents_on_edge += 1
            total_cost += congestion_cost(num_agents_on_edge)
    return total_cost


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
        return collective_cost(self.graph, self.state)

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

        shortest = utils.vertex_path_to_edge_path(shortest)

        init_paths.append(shortest)

    return init_paths


def main():
    graph, init_states = utils.read_graph(os.getcwd() + ct.EDGE_LIST_PATH, os.getcwd() + ct.INITIAL_STATE_PATH)

    init_paths = initial_guess(init_states, graph)
    prob = PathsProblem(init_paths, graph)
    prob.steps = 3000

    state, e = prob.anneal()

    print('Original ')
    for path in init_paths:
        print(path)
    print(collective_cost(graph, init_paths))

    print('Annealed')
    for path in state:
        print(path)
    print(e)

    utils.plot_graph_paths(graph, paths=state, colors=['b', 'g', 'r', 'c', 'm', 'y', 'k', 'w'])


if __name__ == '__main__':
    main()
