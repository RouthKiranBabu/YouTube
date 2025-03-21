/*
Problem: Longest Palindromic Subsequence (LPS)
Theory:
- We use Dynamic Programming to solve this problem.
- Define dp[i][j] as the length of the longest palindromic subsequence in string[i:j+1].
- If s[i] == s[j], then dp[i][j] = 2 + dp[i+1][j-1].
- Otherwise, dp[i][j] = max(dp[i+1][j], dp[i][j-1]).
- Base case: Single character substrings are palindromes of length 1.

Time Complexity: O(n^2), Space Complexity: O(n^2).
*/

public class LongestPalindromicSubsequence {
    public static int longestPalindromicSubsequence(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Single character substrings are palindromes of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill the table for substrings of length 2 and above
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1]; // LPS length of the entire string
    }

    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println("Longest Palindromic Subsequence length: " + longestPalindromicSubsequence(s));
    }
}

/*
Output:
Longest Palindromic Subsequence length: 4
*/
