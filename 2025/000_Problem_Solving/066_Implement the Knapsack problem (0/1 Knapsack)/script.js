/*
 * 0/1 Knapsack Problem Implementation in JavaScript
 * 
 * Problem: Given weights and values of n items, and a knapsack of capacity W,
 *          find the maximum value that can be obtained.
 *
 * Approach: Dynamic Programming (Bottom-Up)
 * Time Complexity: O(n * W)
 * Space Complexity: O(n * W)
 */

class script {
    static knapsack(W, wt, val, n) {
        let dp = Array(n + 1).fill().map(() => Array(W + 1).fill(0));

        for (let i = 0; i <= n; i++) {
            for (let w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0; // Base case
                else if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        return dp[n][W]; // Max value that can be obtained
    }
}

// Test Case
let val = [60, 100, 120];
let wt = [10, 20, 30];
let W = 50;
let n = val.length;

console.log("Maximum value in Knapsack:", script.knapsack(W, wt, val, n));

/*
 * Output:
 * Maximum value in Knapsack: 220
 *
 * Explanation:
 * - The optimal selection is items with weights {20, 30}, giving values {100, 120} with total value = 220.
 */
