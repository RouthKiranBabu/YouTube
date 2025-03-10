// Java program to find the longest repeating subsequence
// using dynamic programming

class script {
    public static int findLRS(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][n];
    }

    public static void main(String[] args) {
        String str = "aabebcdd";
        int result = findLRS(str);
        System.out.println("Longest Repeating Subsequence length: " + result);
    }
}

/*
Output:
Longest Repeating Subsequence length: 3

Explanation:
The longest repeating subsequence in "aabebcdd" is "abd" (or "aba").
It appears twice in a non-overlapping manner.
*/
