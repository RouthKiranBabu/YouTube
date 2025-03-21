// Traveling Salesman Problem (TSP) using Dynamic Programming (Held-Karp Algorithm)
import java.util.Arrays;

public class TSP {
    static final int INF = Integer.MAX_VALUE / 2; // Avoid overflow
    static int n;
    static int[][] dist;
    static int[][] dp;

    // Function to solve TSP using DP and Bitmasking
    static int tsp(int mask, int pos) {
        // Base case: all cities visited
        if (mask == (1 << n) - 1) return dist[pos][0];

        // Return stored result if already computed
        if (dp[mask][pos] != -1) return dp[mask][pos];

        int minCost = INF;

        // Try visiting all unvisited cities
        for (int city = 0; city < n; city++) {
            if ((mask & (1 << city)) == 0) { // If city is not visited
                int newCost = dist[pos][city] + tsp(mask | (1 << city), city);
                minCost = Math.min(minCost, newCost);
            }
        }

        // Store result and return
        dp[mask][pos] = minCost;
        return minCost;
    }

    public static void main(String[] args) {
        dist = new int[][] {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };
        n = dist.length;
        dp = new int[1 << n][n];

        // Initialize DP table with -1
        for (int[] row : dp) Arrays.fill(row, -1);

        // Solve TSP
        int minCost = tsp(1, 0);
        System.out.println("Minimum Traveling Cost: " + minCost);
    }
}

/*
Expected Output:
Minimum Traveling Cost: 80
*/
