#!/usr/bin/python3

from datetime import datetime
import os
from copy import deepcopy as dup
import numpy as np
from tabu_search import tabu_search
from simulated_annealing import simulate_annealing
from gasolve import ga_solve
import utils
import constants as ct

def main(fun, trials=8):
    """
    :param fun: a function which should take 2 arguments
        1. graph
        2. init_states (i.e. the paths) [[..], [..], ..]

        And it should solve the problem and return a tuple
        (solution_paths, cost)
        see tabu_search for an example
    :param trials:
    :return:
    """
    graph, init_states = utils.read_graph(os.getcwd() + ct.EDGE_LIST_PATH,
                                          os.getcwd() + ct.INITIAL_STATE_PATH)

    init_paths = utils.initial_guess(init_states, graph)

    times = []
    costs = []

    # no use for this rn, but maybe it'll have a use later on? for visualization
    # or something...
    solutions = []

    for _ in range(trials):
        # in case these are changed
        init_graph = dup(graph)
        init_state = dup(init_paths)
        start_time = datetime.now()
        res = fun(init_graph, init_state)
        solution = res[0]
        cost = res[1]
        end_time = datetime.now()
        times.append((end_time - start_time).seconds * 1000)
        costs.append(cost)
        solutions.append(solution)

    print('Avg cost: ' + str(np.mean(costs)))
    print('var cost: ' + str(np.var(costs)))
    print('Min cost:' + str(np.min(costs)))

    print('Avg time: ' + str(np.mean(times)))
    print('var time: ' + str(np.var(times)))
    print('Min time:' + str(np.min(times)))


if __name__ == '__main__':
    main(simulate_annealing)

