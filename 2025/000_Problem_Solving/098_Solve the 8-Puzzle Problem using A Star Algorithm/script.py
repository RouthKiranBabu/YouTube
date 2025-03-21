"""
8-Puzzle Problem Solved Using A* Algorithm in Python

Problem: Given a 3x3 sliding puzzle with numbers 1-8 and a blank space, 
rearrange it to match the goal state using the minimum number of moves.

Theory:
- The A* algorithm is used with a heuristic function to guide the search.
- We use the Manhattan Distance as the heuristic function.
- The total cost is calculated as f(n) = g(n) + h(n), 
  where g(n) is the number of moves from the start state, 
  and h(n) is the estimated cost to reach the goal.
"""

from queue import PriorityQueue

class PuzzleNode:
    def __init__(self, state, parent, move, depth, cost):
        self.state = state
        self.parent = parent
        self.move = move
        self.depth = depth
        self.cost = cost

    def __lt__(self, other):
        return (self.depth + self.cost) < (other.depth + other.cost)

# Goal State
GOAL_STATE = [[1, 2, 3], [4, 5, 6], [7, 8, 0]]

# Heuristic Function: Manhattan Distance
def manhattan_distance(state):
    distance = 0
    for i in range(3):
        for j in range(3):
            if state[i][j] == 0:
                continue
            x, y = divmod(state[i][j] - 1, 3)
            distance += abs(x - i) + abs(y - j)
    return distance

# Get possible moves
def get_neighbors(state):
    neighbors = []
    x, y = next((i, j) for i in range(3) for j in range(3) if state[i][j] == 0)
    directions = [("Up", -1, 0), ("Down", 1, 0), ("Left", 0, -1), ("Right", 0, 1)]

    for move, dx, dy in directions:
        nx, ny = x + dx, y + dy
        if 0 <= nx < 3 and 0 <= ny < 3:
            new_state = [row[:] for row in state]
            new_state[x][y], new_state[nx][ny] = new_state[nx][ny], new_state[x][y]
            neighbors.append((new_state, move))
    
    return neighbors

# A* Algorithm
def solve_puzzle(start_state):
    pq = PriorityQueue()
    pq.put(PuzzleNode(start_state, None, None, 0, manhattan_distance(start_state)))
    visited = set()
    
    while not pq.empty():
        node = pq.get()

        if node.state == GOAL_STATE:
            path = []
            while node.parent:
                path.append(node.move)
                node = node.parent
            return path[::-1]
        
        visited.add(tuple(map(tuple, node.state)))

        for new_state, move in get_neighbors(node.state):
            if tuple(map(tuple, new_state)) not in visited:
                pq.put(PuzzleNode(new_state, node, move, node.depth + 1, manhattan_distance(new_state)))

    return None

# Example Input
start_state = [[1, 2, 3], [4, 0, 5], [7, 8, 6]]
solution = solve_puzzle(start_state)

# Output
print("Solution:", solution)

"""
Example Output:
Solution: ['Right', 'Down']
Explanation: Moves to reach the goal state from the given start state.
"""
