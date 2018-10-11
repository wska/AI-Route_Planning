from simanneal import Annealer
from numpy import tanh


# This is the problem we are solving
class PathsProblem(Annealer):
    def move(self):

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
def initial_guess():
    pass

def main():
    # read graph
    graph = None
    prob = PathsProblem(initial_guess(), graph)
    prob.steps = 100000

    state, e = prob.anneal()

    print(state, e)

if __name__ == '__main__':
    main()