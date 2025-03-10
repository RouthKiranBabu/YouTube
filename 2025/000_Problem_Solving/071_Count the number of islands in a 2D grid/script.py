"""
Python program to count islands in a 2D grid using DFS.
For each unvisited land cell (1), we mark its entire connected component as visited.

Time Complexity: O(m * n) - Each cell is visited once.
Space Complexity: O(m * n) - Worst case recursion stack.
"""

class script:
    def numIslands(self, grid):
        if not grid:
            return 0

        rows, cols = len(grid), len(grid[0])
        count = 0

        # Depth-First Search function
        def dfs(i, j):
            if i < 0 or j < 0 or i >= rows or j >= cols or grid[i][j] == '0':
                return
            
            grid[i][j] = '0'  # Mark visited

            # Explore 4 possible directions
            dfs(i + 1, j)  # Down
            dfs(i - 1, j)  # Up
            dfs(i, j + 1)  # Right
            dfs(i, j - 1)  # Left

        # Traverse grid
        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == '1':  # Found a new island
                    count += 1
                    dfs(i, j)

        return count

# Example usage
obj = script()
grid = [
    ['1', '1', '0', '0', '0'],
    ['1', '1', '0', '0', '0'],
    ['0', '0', '1', '0', '0'],
    ['0', '0', '0', '1', '1']
]
print("Number of islands:", obj.numIslands(grid))

"""
Output:
Number of islands: 3

Explanation:
Same as Java and JavaScript examples.
"""
