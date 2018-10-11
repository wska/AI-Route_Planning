


def read_graph(path_graph, path_init):
    """

    :param path_graph: None
    :param path_init:
    :return:
    """

    graph = None
    init_states = None



    return graph, init_states


def vertex_path_to_edge_path(vertex_path):

    edge_path = [(vertex_path[i],vertex_path[i+1]) for i in range(len(vertex_path)-1)]

    return edge_path