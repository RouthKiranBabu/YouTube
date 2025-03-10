/*
Explanation:
- The problem is to find the maximum area of an island in a 2D grid where `1` represents land and `0` represents water.
- We use Depth-First Search (DFS) to explore all connected land cells.
- The DFS function marks visited cells and returns the size of the connected component.
- The algorithm iterates through the grid and computes the max island size.
*/

import java.util.*;

public class script {
    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length, cols = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    private static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0; // Mark as visited
        int area = 1;
        area += dfs(grid, i + 1, j);
        area += dfs(grid, i - 1, j);
        area += dfs(grid, i, j + 1);
        area += dfs(grid, i, j - 1);
        return area;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1, 0, 0},
            {1, 1, 1, 1, 0},
            {0, 0, 1, 0, 0},
            {1, 1, 0, 0, 0}
        };
        System.out.println("Maximum Island Area: " + maxAreaOfIsland(grid));
    }
}

/*
Output:
Maximum Island Area: 5

Explanation:
- The largest island consists of 5 connected 1s.
- The DFS function ensures that we explore all directions and calculate the area properly.
*/
