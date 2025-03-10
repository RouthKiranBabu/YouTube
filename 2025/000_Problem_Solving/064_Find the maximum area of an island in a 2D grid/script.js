/*
Explanation:
- We iterate through the 2D grid to find an unvisited land cell (`1`).
- A recursive DFS is used to explore all connected land cells and compute the island's size.
- The visited cells are marked as `0` to avoid redundant checks.
- The maximum island size is updated during the traversal.
*/

class script {
    static maxAreaOfIsland(grid) {
        let maxArea = 0;
        
        function dfs(i, j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] === 0) {
                return 0;
            }
            grid[i][j] = 0; // Mark as visited
            return 1 + dfs(i + 1, j) + dfs(i - 1, j) + dfs(i, j + 1) + dfs(i, j - 1);
        }

        for (let i = 0; i < grid.length; i++) {
            for (let j = 0; j < grid[0].length; j++) {
                if (grid[i][j] === 1) {
                    maxArea = Math.max(maxArea, dfs(i, j));
                }
            }
        }
        return maxArea;
    }
}

// Example Usage
const grid = [
    [0, 0, 1, 0, 0],
    [1, 1, 1, 1, 0],
    [0, 0, 1, 0, 0],
    [1, 1, 0, 0, 0]
];

console.log("Maximum Island Area:", script.maxAreaOfIsland(grid));

/*
Output:
Maximum Island Area: 5

Explanation:
- The largest island consists of 5 connected 1s.
- The DFS function explores all directions and calculates the area.
- The result is returned as the maximum found island area.
*/
