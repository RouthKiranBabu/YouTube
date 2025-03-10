"""
0/1 Knapsack Problem Implementation in Python

Problem: Given weights and values of n items, and a knapsack of capacity W,
         find the maximum value that can be obtained.

Approach: Dynamic Programming (Bottom-Up)
Time Complexity: O(n * W)
Space Complexity: O(n * W)
"""

class script:
    @staticmethod
    def knapsack(W, wt, val, n):
        dp = [[0 for _ in range(W + 1)] for _ in range(n + 1)]

        for i in range(n + 1):
            for w in range(W + 1):
                if i == 0 or w == 0:
                    dp[i][w] = 0  # Base case
                elif wt[i - 1] <= w:
                    dp[i][w] = max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w])
                else:
                    dp[i][w] = dp[i - 1][w]

        return dp[n][W]  # Max value that can be obtained

# Test Case
val = [60, 100, 120]
wt = [10, 20, 30]
W = 50
n = len(val)

print("Maximum value in Knapsack:", script.knapsack(W, wt, val, n))

"""
Output:
Maximum value in Knapsack: 220

Explanation:
- The optimal selection is items with weights {20, 30}, giving values {100, 120} with total value = 220.
"""
