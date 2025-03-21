// Problem: Find the number of unique paths in a grid with obstacles.
// We use a 2D DP array where dp[i][j] represents the number of ways
// to reach cell (i, j). If a cell contains an obstacle, set dp[i][j] = 0.

function uniquePathsWithObstacles(grid) {
    let m = grid.length, n = grid[0].length;

    // If start or end cell has an obstacle, return 0 as no path is possible.
    if (grid[0][0] === 1 || grid[m-1][n-1] === 1) {
        return 0;
    }

    let dp = Array.from({ length: m }, () => Array(n).fill(0));
    dp[0][0] = 1; // Starting position

    // Fill the DP table
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (grid[i][j] === 1) { // If there's an obstacle
                dp[i][j] = 0;
            } else {
                if (i > 0) dp[i][j] += dp[i - 1][j]; // Paths from top
                if (j > 0) dp[i][j] += dp[i][j - 1]; // Paths from left
            }
        }
    }

    return dp[m-1][n-1]; // Result at bottom-right corner
}

// Example grid with obstacles (0 = open space, 1 = obstacle)
let grid = [
    [0, 0, 0],
    [0, 1, 0],
    [0, 0, 0]
];

// Output
console.log(uniquePathsWithObstacles(grid)); // Expected Output: 2
