# Python program to find the longest repeating subsequence

class script:
    @staticmethod
    def findLRS(str):
        n = len(str)
        dp = [[0] * (n + 1) for _ in range(n + 1)]

        # Build the DP table
        for i in range(1, n + 1):
            for j in range(1, n + 1):
                if str[i - 1] == str[j - 1] and i != j:
                    dp[i][j] = 1 + dp[i - 1][j - 1]
                else:
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
        
        return dp[n][n]

# Example usage
str = "aabebcdd"
result = script.findLRS(str)
print("Longest Repeating Subsequence length:", result)

"""
Output:
Longest Repeating Subsequence length: 3

Explanation:
The longest repeating subsequence in "aabebcdd" is "abd" (or "aba").
It appears twice in a non-overlapping manner.
"""
