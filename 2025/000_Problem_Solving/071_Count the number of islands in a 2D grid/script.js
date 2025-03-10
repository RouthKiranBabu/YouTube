/*
 * JavaScript program to count islands in a 2D grid using DFS.
 * We traverse each cell, and for each unvisited land, we mark connected lands.
 * 
 * Time Complexity: O(m * n) - Visits each cell once.
 * Space Complexity: O(m * n) - Recursion stack for worst case scenario.
 */

class script {
    numIslands(grid) {
        if (!grid.length) return 0;

        let count = 0;
        let rows = grid.length, cols = grid[0].length;

        // Function to perform DFS marking
        const dfs = (i, j) => {
            if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] === '0') return;
            
            grid[i][j] = '0'; // Mark as visited
            
            dfs(i + 1, j); // Down
            dfs(i - 1, j); // Up
            dfs(i, j + 1); // Right
            dfs(i, j - 1); // Left
        };

        // Traverse the grid
        for (let i = 0; i < rows; i++) {
            for (let j = 0; j < cols; j++) {
                if (grid[i][j] === '1') {
                    count++;
                    dfs(i, j);
                }
            }
        }
        return count;
    }
}

// Example usage
const obj = new script();
let grid = [
    ['1', '1', '0', '0', '0'],
    ['1', '1', '0', '0', '0'],
    ['0', '0', '1', '0', '0'],
    ['0', '0', '0', '1', '1']
];

console.log("Number of islands:", obj.numIslands(grid));

/*
 * Output:
 * Number of islands: 3
 *
 * Explanation:
 * Same as Java example.
 */
