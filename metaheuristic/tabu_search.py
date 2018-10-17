from copy import deepcopy
import numpy as np
import networkx as nx
import utils
import os
import constants as ct
import utils
from matplotlib import pyplot as plt

MAX_CONT = 60
MAX_LEN_TABU = 20


def tabu_search(graph, init_state):
    hist = list()

    state = init_state
    tabu_list = [init_state]

    best_ever_candidate_cost = np.inf
    best_ever_candidate = None
    cont = 0
    while True and cont < MAX_CONT:

        if cont % 10 == 0:
            print("step = " + str(cont))
        nbs = neighbors(graph, state)
        nb_min = None
        nb_min_cost = np.inf

        for nb in nbs:

            nb_cost = utils.collective_cost(graph, nb)

            # aspiration
            # if (nb not in tabu_list or nb_cost < best_ever_candidate_cost) and nb_cost < nb_min_cost:
            if nb not in tabu_list and nb_cost < nb_min_cost:
                nb_min = nb
                nb_min_cost = nb_cost

        if nb_min_cost < best_ever_candidate_cost:
            best_ever_candidate_cost = nb_min_cost
            best_ever_candidate = nb_min

        tabu_list.append(nb_min)
        state = nb_min

        if len(tabu_list) > MAX_LEN_TABU:
            del tabu_list[0]

        cont += 1

        hist.append(best_ever_candidate_cost)

    return best_ever_candidate, best_ever_candidate_cost, hist


def get_perturbations(graph, path):
    candidate_paths = list()

    for idx in range(len(path)):

        edge = path[idx]

        # starting, ending nodes
        a = path[0][0]
        b = edge[1]

        for simple_path in nx.all_simple_paths(graph, source=a, target=b):
            edge_path = utils.vertex_path_to_edge_path(simple_path)
            if edge not in edge_path:
                candidate_paths.append(edge_path + path[idx + 1:])

    candidate_paths = sorted(candidate_paths, key=len)

    return [p for p in candidate_paths if len(p) == len(candidate_paths[0])]


def neighbors(graph, state):
    all_neighbors = list()

    for i in range(len(state)):
        agent = state[i]

        all_perturbations = get_perturbations(graph, agent)

        for path in all_perturbations:
            old_state = deepcopy(state)
            old_state[i] = path

            all_neighbors.append(old_state)

    return all_neighbors


def main():
    graph, init_states = utils.read_graph(os.getcwd() + ct.EDGE_LIST_PATH,
                                          os.getcwd() + ct.INITIAL_STATE_PATH)

    init_paths = utils.initial_guess(init_states, graph)

    print('Original ')
    for path in init_paths:
        print(path)
    print(utils.collective_cost(graph, init_paths))

    state, cost, hist = tabu_search(graph, init_paths)

    print('Annealed')
    for path in state:
        print(path)
    print(cost)

    utils.plot_graph_paths_max(graph, paths=init_paths, title='Individual Planning')
    utils.plot_graph_paths_max(graph, paths=state, title='Tabu Search Cooperative Planning')
    plt.show()
    x = range(len(hist))

    plt.plot(x, hist)

    plt.xlabel("Step")
    plt.ylabel("Cost function")

    plt.show()


if __name__ == '__main__':
    main()
