// JavaScript program to find the longest repeating subsequence

class script {
    static findLRS(str) {
        let n = str.length;
        let dp = Array.from({ length: n + 1 }, () => Array(n + 1).fill(0));

        // Build the DP table
        for (let i = 1; i <= n; i++) {
            for (let j = 1; j <= n; j++) {
                if (str[i - 1] === str[j - 1] && i !== j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][n];
    }
}

// Example usage
let str = "aabebcdd";
console.log("Longest Repeating Subsequence length:", script.findLRS(str));

/*
Output:
Longest Repeating Subsequence length: 3

Explanation:
The longest repeating subsequence in "aabebcdd" is "abd" (or "aba").
It appears twice in a non-overlapping manner.
*/
