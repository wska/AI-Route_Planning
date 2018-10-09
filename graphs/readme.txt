In this file, I will add some graphs that we can utilize in the project. The graphs will follow cartesian coordinates in a (x,y) plane.

The graph will assume that the coordinates are non-directed, meaning that a edge from (x,y) to (z,k) also follows that (z,k) has a edge to (x,y).
The coordinates are based around a grid-based approach, and takes place entirely in the 1st quadrant of a cartesian coordinate system.
This means that for a 5 by 5 graph(5x5), the grid will be based from (0,0) to (4,4).

Therefore, the starting point for the grid based map will always be in origo (0,0), and then work its way outwards with positive X and Y coordinates.

The edges will exclusively be vertical or horizontal. There are no diagonal edges. 

The format of the files are as follows:

Two integers, representing the total size of the grid(etc, "5 5" for a 5x5 grid).
One integer, displaying the total number of edges present in the graph (etc, 23, for 23 edges).
A number of edge coordinates, displayed as x,y z,k, for a edge between the cartesian coordinates (x,y) and (z,k).
