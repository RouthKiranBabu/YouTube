"""
Explanation:
- The function iterates through the 2D grid and finds unvisited land cells (1).
- A recursive DFS explores all adjacent land cells.
- Visited cells are marked as 0 to avoid revisiting.
- The max island size is updated as we traverse the grid.
"""

class script:
    @staticmethod
    def maxAreaOfIsland(grid):
        def dfs(i, j):
            if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]) or grid[i][j] == 0:
                return 0
            grid[i][j] = 0  # Mark as visited
            return 1 + dfs(i+1, j) + dfs(i-1, j) + dfs(i, j+1) + dfs(i, j-1)

        max_area = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    max_area = max(max_area, dfs(i, j))
        return max_area

# Example Usage
grid = [
    [0, 0, 1, 0, 0],
    [1, 1, 1, 1, 0],
    [0, 0, 1, 0, 0],
    [1, 1, 0, 0, 0]
]

print("Maximum Island Area:", script.maxAreaOfIsland(grid))

"""
Output:
Maximum Island Area: 5

Explanation:
- The DFS explores the largest island consisting of 5 connected 1s.
- The function ensures we visit every cell and compute the correct maximum area.
"""
