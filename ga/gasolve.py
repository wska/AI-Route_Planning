from simanneal import Annealer
from math import log10
import networkx as nx
import matplotlib.pyplot as plt
import os
from random import randint
import random
import pandas as pd
import operator
import datetime
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



def create_population(init_states, graph, popsize):
        pathDict = {}

        for start,goal in init_states:
            pathDict[(start,goal)] = []
            for path in nx.all_simple_paths(graph, source=start, target=goal):
                #print(path)
                pathDict[(start,goal)].append(path)


        #return pathDict
        population = []
        #keys = pathDict.keys()
        

        for _ in range(0,popsize):
            sample = []
            for start,goal in init_states:
                pathChoice = randint(0, len(pathDict[(start,goal)])-1)
                sample.append(pathDict[(start,goal)][pathChoice])
            population.append(sample)

        return population


def selection(populationPaths, graph, selectionsize):
    #selection = []
    #df = pd.DataFrame(np.array(populationPaths), columns=["Index", "Fitness"])
    #df["Score"] = df.collective_cost.cumsum()
    #df["%"] = 100*df.score/df.collective_cost.sum()
    populationPaths = random.sample(populationPaths, selectionsize)
    
    rankings = []
    for pathSet in populationPaths:
        #print(pathSet)
        rankings.append((pathSet, collective_cost(graph, pathSet)))
    
    #rankings.sort(key=lambda x:x[1])
    
    return min(rankings, key=lambda x:x[1])


def makeEdgeProblem(populationPaths):
    popEdges = []
    for pathSet in populationPaths:
        newSet = []
        #print(pathSet)
        for path in pathSet:
            #print(path)
            newSet.append([(path[i], path[i+1]) for i in range(len(path)-1)])
        popEdges.append(newSet)
   
    return popEdges

def next_generation(parents, graph, gensize):
    newGeneration = []
    for _ in range(gensize):
        child = []
        for i in range(len(parents[0])):
            child.append(parents[randint(0,len(parents)-1)][i])
        newGeneration.append(child)
        
    return newGeneration



def main():

    startTime = datetime.datetime.now()
    initialPopulationSize = 100
    numberOfParents = 5
    iterations = 30


    graph, init_states = utils.read_graph(os.getcwd() + ct.EDGE_LIST_PATH, os.getcwd() + ct.INITIAL_STATE_PATH)
    

    populationPaths = create_population(init_states, graph, initialPopulationSize)
    populationPaths = makeEdgeProblem(populationPaths)
    savedOriginalPaths = populationPaths


    for i in range(0,iterations):
        print("Starting iteration" + str(i+1))
        parents = []
        for _ in range(numberOfParents):
            parent = selection(populationPaths, graph, int(round(initialPopulationSize/2)))
            #print(parent)
            parents.append(parent[0])

        #print(parents)
        populationPaths = next_generation(parents, graph, initialPopulationSize)
    

    output = selection(populationPaths, graph, initialPopulationSize)
    endTime = datetime.datetime.now() - startTime

    #print(len(output[0]))
    for i in range(0,len(output[0])):
        print("Agent"+str(i+1)+'\'s path: ' + str(output[0][i]))
    print("Total cost: " + str(output[1]))
    print("Original cost: " + str(selection(savedOriginalPaths, graph, initialPopulationSize)[1]))

    print("Execution time with " + str(iterations) + " iterations: " + str(endTime.total_seconds() * 1000) + " ms")
    #utils.plot_graph_paths(graph, paths=state, colors=['b', 'g', 'r', 'c', 'm', 'y', 'k', 'w'])


if __name__ == '__main__':
    main()
