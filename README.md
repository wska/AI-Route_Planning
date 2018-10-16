# DD2380 Artificial Intelligence Team 42: Route Planning

### Graphs
The graphs used in the project can be found in the directory /graphs.
All graphs will follow cartesian coordinates in a (x,y) plane.

The graph will assume that the edges are undirected, meaning that an edge from (x,y) to (z,k) implies that there is also an edge from (z,k) to (x,y).

The coordinates are based around a grid-based approach, and takes place entirely in the first quadrant of a Cartesian coordinate system.
This means that for a 5x5 graph, the grid will be based from (0,0) to (4,4).

Therefore, the starting point for the grid based map will always be in the origin (0,0), and then work its way outwards with positive X and Y coordinates.

The edges will exclusively be vertical or horizontal. There are no diagonal edges.
The format of the files are as follows:

Two integers, representing the total size of the grid (i.e. "5 5" for a 5x5 grid).
One integer, displaying the total number of edges present in the graph (i.e. 23 for 23 edges).
A number of edge coordinates, displayed as x,y z,k, for an edge between the Cartesian coordinates (x,y) and (z,k).


### Fast-Downward
The code for the PDDL implementation of the route planning problem can be found in the following files:
   - /dwpddl/path/domain.pddl
   - /dwpddl/path/path.pddl

Instructions for running the .pddl files using the fast downward solver:
  1. Download the planner from http://www.fast-downward.org/ObtainingAndRunningFastDownward
  2. There are instructions on how to install it. You need a few dependencies obtainable by a packet manager, but htese are platform dependent.
  3. Skip the part that talks about 'Validator VAL'.
  3. Obtain the code by: $ hg clone http://hg.fast-downward.org downward
  4. Create the default build (32-bit) by $ cd downward; ./build.py
  5. After compiling it, it can be used to solve .pddl problems.
  6. For solving, the planner needs three components:
    a) a domain.pddl file specifying the problem domain.
    b) a problem.pddl specification about the problem instance.
    c) instructions on which algorithm to use.

Example:
Assume that the planner was unpacked in downward/, and your current working directory is dwpddl/.
The following prompt causes fast-downward to solve the problem using the a-star algorithm with a landmark-cut heuristic:
./downward/fast-downward.py path/path.pddl --search "astar(lmcut())"

More information on additional algorithms and parameters are available on the website from (1).


### JSHOP2
The relevant code for the JSHOP2 implementation of the route planning problem can be found in the following two files:
  - /jshop2-master/examples/routeplanning/problem
  - /jshop2-master/examples/routeplanning/routeplanning

To run the code at your end:
  1. $ export CLASSPATH=~'pwd'/jshop2-master/antlr.jar:~'pwd'/jshop2-master/bin.build/JSHOP2.jar:.

  To compile all files
  2. $ make c

  To start the GUI/solver for the route-planning problem
  3. $ make 9


### SIMULATED ANNEALING
