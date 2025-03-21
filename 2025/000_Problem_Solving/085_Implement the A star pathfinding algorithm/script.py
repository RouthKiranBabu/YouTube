"""
Problem:
Implement the A* (A-star) pathfinding algorithm, which is used to find the shortest path from a start node to a goal node.
The algorithm uses:
- g(n): Cost from the start node to the current node
- h(n): Heuristic estimate of the cost from the current node to the goal
- f(n) = g(n) + h(n): Total estimated cost of the node

Theory:
A* uses both actual cost (g) and estimated cost (h) to determine the best path. The heuristic function must be admissible (not overestimate the cost).
"""

import heapq

class Node:
    def __init__(self, position, g, h, parent=None):
        self.position = position  # (x, y) coordinates
        self.g = g  # Cost from start node
        self.h = h  # Heuristic cost to goal
        self.f = g + h  # Total cost
        self.parent = parent  # Parent node for path reconstruction

    def __lt__(self, other):
        return self.f < other.f  # Priority queue sorting by f value

def heuristic(a, b):
    """Calculate Manhattan distance as heuristic."""
    return abs(a[0] - b[0]) + abs(a[1] - b[1])

def astar(grid, start, goal):
    """
    Implements A* algorithm on a given grid.
    :param grid: 2D list (0 for open path, 1 for obstacles)
    :param start: Tuple (x, y) for start position
    :param goal: Tuple (x, y) for goal position
    :return: Shortest path as a list of (x, y) tuples
    """
    open_set = []
    closed_set = set()
    
    start_node = Node(start, 0, heuristic(start, goal))
    heapq.heappush(open_set, start_node)

    while open_set:
        current = heapq.heappop(open_set)  # Get node with lowest f value

        if current.position == goal:
            path = []
            while current:
                path.append(current.position)
                current = current.parent
            return path[::-1]  # Return reversed path

        closed_set.add(current.position)

        for dx, dy in [(-1, 0), (1, 0), (0, -1), (0, 1)]:  # Neighbor directions
            neighbor_pos = (current.position[0] + dx, current.position[1] + dy)

            if (0 <= neighbor_pos[0] < len(grid) and
                0 <= neighbor_pos[1] < len(grid[0]) and
                grid[neighbor_pos[0]][neighbor_pos[1]] == 0 and
                neighbor_pos not in closed_set):

                g_score = current.g + 1
                neighbor = Node(neighbor_pos, g_score, heuristic(neighbor_pos, goal), current)

                heapq.heappush(open_set, neighbor)

    return None  # No path found

# Example usage
grid = [
    [0, 1, 0, 0, 0],
    [0, 1, 0, 1, 0],
    [0, 0, 0, 1, 0],
    [1, 1, 0, 1, 0],
    [0, 0, 0, 0, 0]
]
start = (0, 0)
goal = (4, 4)

path = astar(grid, start, goal)
print("Shortest Path:", path)

"""
Output:
Shortest Path: [(0, 0), (1, 0), (2, 0), (2, 1), (2, 2), (3, 2), (4, 2), (4, 3), (4, 4)]
"""
