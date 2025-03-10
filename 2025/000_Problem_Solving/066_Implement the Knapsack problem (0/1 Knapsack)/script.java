/*Knapsack Problem (0/1 Knapsack) Implementation in Java, JavaScript, and Python
The 0/1 Knapsack Problem is a classic dynamic programming problem where we have a set of items, each with a weight and value, and a knapsack with a weight capacity. The goal is to determine the maximum total value we can achieve without exceeding the weight capacity.

Below are implementations in Java, JavaScript, and Python with explanations.*/
/*
 * 0/1 Knapsack Problem Implementation in Java
 * 
 * Problem: Given weights and values of n items, and a knapsack of capacity W,
 *          find the maximum value that can be obtained.
 *
 * Approach: Dynamic Programming (Bottom-Up)
 * Time Complexity: O(n * W), where n is the number of items and W is the capacity.
 * Space Complexity: O(n * W) for the DP table.
 */

 public class script {
    public static int knapsack(int W, int wt[], int val[], int n) {
        int dp[][] = new int[n + 1][W + 1];

        // Build the DP table
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0; // Base case: No items or weight is 0
                else if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        return dp[n][W]; // Max value that can be obtained
    }

    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W = 50;
        int n = val.length;

        System.out.println("Maximum value in Knapsack: " + knapsack(W, wt, val, n));
    }
}

/*
 * Output:
 * Maximum value in Knapsack: 220
 *
 * Explanation:
 * - The optimal selection is items with weights {20, 30}, giving values {100, 120} with total value = 220.
 */
