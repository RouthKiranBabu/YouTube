/*
Problem: Check if a given graph is bipartite.

Theory:
A graph is bipartite if we can color its vertices using two colors such that no two adjacent vertices have the same color.
We use BFS to color nodes level by level.
*/

import java.util.*;

public class BipartiteGraph {
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1); // -1 means uncolored

        for (int start = 0; start < n; start++) { // Check all components
            if (color[start] == -1) {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(start);
                color[start] = 0; // Start with color 0

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int neighbor : graph[node]) {
                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[node];
                            queue.offer(neighbor);
                        } else if (color[neighbor] == color[node]) {
                            return false; // Same color means not bipartite
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {1, 3}, // Node 0 is connected to 1 and 3
            {0, 2}, // Node 1 is connected to 0 and 2
            {1, 3}, // Node 2 is connected to 1 and 3
            {0, 2}  // Node 3 is connected to 0 and 2
        };

        System.out.println(isBipartite(graph)); // Output: true
    }
}

/*
Explanation:
- The given graph is a cycle of even length (4 nodes), which is bipartite.
- BFS ensures nodes are colored alternately to check if no two adjacent nodes share the same color.
*/
