/*
 * Java program to count the number of islands in a 2D grid.
 * We use Depth-First Search (DFS) to traverse and mark visited land cells.
 * 
 * Time Complexity: O(m * n)  - Each cell is visited once.
 * Space Complexity: O(m * n) - In worst case, all cells are land and stored in recursion stack.
 */

 class script {
    // Function to count islands
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length, cols = grid[0].length;

        // Traverse entire grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {  // Found new island
                    count++;
                    dfs(grid, i, j);  // Mark connected land
                }
            }
        }
        return count;
    }

    // Depth-First Search to mark visited land cells
    private void dfs(char[][] grid, int i, int j) {
        // Check boundary and if water or already visited
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0'; // Mark as visited
        dfs(grid, i + 1, j); // Down
        dfs(grid, i - 1, j); // Up
        dfs(grid, i, j + 1); // Right
        dfs(grid, i, j - 1); // Left
    }

    // Example usage
    public static void main(String[] args) {
        script obj = new script();
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println("Number of islands: " + obj.numIslands(grid));
    }
}

/*
 * Output:
 * Number of islands: 3
 *
 * Explanation:
 * 1 1 0 0 0     ->  Island 1
 * 1 1 0 0 0  
 * 0 0 1 0 0     ->  Island 2
 * 0 0 0 1 1     ->  Island 3
 */
