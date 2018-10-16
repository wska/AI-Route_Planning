import networkx as nx
import os
import constants as ct
import csv
import pylab as plt
from math import sqrt


def read_graph(path_graph, path_init):
    """

    :param path_graph: None
    :param path_init:
    :return:
    """

    graph = nx.read_edgelist(path_graph)

    with open(path_init, 'r') as f:  # opens PW file
        reader = csv.reader(f)
        init_states = list(tuple(rec) for rec in csv.reader(f, delimiter=' '))

    # transform the nodes from string to unicode, the format that use networkx

    # init_states = [(agent[0].decode('unicode-escape'), agent[1].decode('unicode-escape')) for agent in init_states]

    return graph, init_states


def vertex_path_to_edge_path(vertex_path):
    edge_path = [(vertex_path[i], vertex_path[i + 1]) for i in
                 range(len(vertex_path) - 1)]

    return edge_path


def unique(elements):
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
    node_pos_map = {}
    nodes = range(low, up + 1)
    dim = int(sqrt(up))
    for node in nodes:
        node_pos_map[str(node)] = [(node - 1) % dim, dim - ((node-1) // dim)]
    return node_pos_map


def plot_graph_paths(graph, paths=[]):
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
