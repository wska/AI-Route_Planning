import networkx as nx
import os
import constants as ct
import csv
import pylab as plt
from math import log10
from math import sqrt


def read_graph(path_graph, path_init):
    """
    :param path_graph:
    :param path_init:
    :return:
    """

    graph = nx.read_edgelist(path_graph)

    with open(path_init, 'r') as f:  # opens PW file
        reader = csv.reader(f)
        init_states = list(tuple(rec) for rec in csv.reader(f, delimiter=' '))

    # transform the nodes from string to unicode, the format that use networkx
    # init_states = [(agent[0].decode('unicode-escape'),
    #                 agent[1].decode('unicode-escape')) for agent in init_states]

    return graph, init_states


def vertex_path_to_edge_path(vertex_path):
    """
    :param vertex_path:
    :return:
    """
    edge_path = [(vertex_path[i], vertex_path[i + 1]) for i in
                 range(len(vertex_path) - 1)]

    return edge_path


def unique(elements):
    """
    :param unique:
    :return:
    """
    uniq = {}
    for el in elements:
        if el in uniq:
            uniq[el] += 1
        else:
            uniq[el] = 1
    keys = []
    counts = []
    for k in uniq.keys():
        keys.append(k)
        counts.append(uniq[k])
    return keys, counts


def absolute_node_positions(low, up):
    """
    :param low:
    :param up:
    :return:
    """
    node_pos_map = {}
    nodes = range(low, up + 1)
    dim = int(sqrt(up))
    for node in nodes:
        node_pos_map[str(node)] = [(node - 1) % dim, dim - ((node - 1) // dim)]
    return node_pos_map


def plot_graph_paths(graph, paths=[]):
    """
    :param graph:
    :return:
    """
    # nx.draw_spring(graph, with_labels=True)
    # ploting graph
    # pos = nx.spring_layout(graph)
    plt.figure()
    pos = absolute_node_positions(1, 25)
    nx.draw_networkx_nodes(graph, pos=pos)

    # Adding goal-start
    labeldict = {node: node for node in graph.nodes()}

    # for i in range(len(paths)):
    #     labeldict[paths[i][0][0]] += ", start"
    #
    #     labeldict[paths[i][-1][1]] += ", goal"

    nx.draw_networkx_labels(graph, pos=pos, labels=labeldict)
    nx.draw_networkx_edges(graph, pos=pos)

    all_edges = [i for j in paths for i in j]
    unique_edges, counts = unique(all_edges)
    # adding paths

    nx.draw_networkx_edges(graph, pos=pos, edgelist=unique_edges, width=counts)


def plot_graph_paths_max(graph, paths=None, title=''):
    """
    :param graph:
    :return:
    """
    plt.figure()
    pos = absolute_node_positions(1, 25)
    nx.draw_networkx_nodes(graph, pos=pos)

    labeldict = {node: node for node in graph.nodes()}
    nx.draw_networkx_labels(graph, pos=pos, labels=labeldict)
    nx.draw_networkx_edges(graph, pos=pos)

    if paths is None:
        return

    all_edges = [i for j in paths for i in j]

    unique_edges, _ = unique(all_edges)

    T = max(map(len, paths))
    E = unique_edges
    edge_weights = {e: 0 for e in E}

    for t in range(T):
        for e in E:
            n = 0
            for p in paths:
                if t < len(p) and p[t] == e:
                    n += 1
            edge_weights[e] = max(edge_weights[e], n)

    max_counts = [edge_weights[e] for e in E]
    nx.draw_networkx_edges(graph, pos=pos, edgelist=E, width=max_counts)
    plt.title(title)


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
    """
    :param graph:
    :param agents_paths:
    :return:
    """
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


# give an initial set of paths for each agent
def initial_guess(init_states, graph):
    """
    :param init_states: [(init_node, goal_node), ..., (init_node, goal_node)]
    :param graph: networkX graph
    :return: list of paths
    """
    init_paths = []

    for start, goal in init_states:
        shortest = nx.shortest_path(graph, source=start, target=goal)

        shortest = vertex_path_to_edge_path(shortest)

        init_paths.append(shortest)

    return init_paths
