# Problem: Find the number of unique paths in a grid with obstacles.
# Given a 2D grid where some cells contain obstacles (represented as 1),
# we need to find the number of unique paths from the top-left corner (0,0)
# to the bottom-right corner (m-1, n-1) using only right and down moves.

def unique_paths_with_obstacles(grid):
    m, n = len(grid), len(grid[0])
    
    # If the starting or ending cell has an obstacle, return 0 as no path is possible.
    if grid[0][0] == 1 or grid[m-1][n-1] == 1:
        return 0

    # Initialize a DP table with the same dimensions as the grid
    dp = [[0] * n for _ in range(m)]
    
    # Start position
    dp[0][0] = 1
    
    # Fill the DP table
    for i in range(m):
        for j in range(n):
            if grid[i][j] == 1:  # If there is an obstacle, no path is possible through this cell
                dp[i][j] = 0
            else:
                if i > 0:
                    dp[i][j] += dp[i-1][j]  # Paths from top
                if j > 0:
                    dp[i][j] += dp[i][j-1]  # Paths from left
    
    return dp[m-1][n-1]  # Return the result from the bottom-right corner

# Example grid with obstacles (0 = open space, 1 = obstacle)
grid = [
    [0, 0, 0],
    [0, 1, 0],
    [0, 0, 0]
]

# Output
print(unique_paths_with_obstacles(grid))  # Expected Output: 2
