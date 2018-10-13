import networkx as nx
import os
import constants as ct
import csv

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


    #transform the nodes from string to unicode, the format that use networkx

    # init_states = [(agent[0].decode('unicode-escape'), agent[1].decode('unicode-escape')) for agent in init_states]

    return graph, init_states


def vertex_path_to_edge_path(vertex_path):

    edge_path = [(vertex_path[i], vertex_path[i+1]) for i in range(len(vertex_path)-1)]

    return edge_path