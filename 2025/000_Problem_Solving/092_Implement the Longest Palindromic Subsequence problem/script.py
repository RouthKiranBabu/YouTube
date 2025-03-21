"""
Problem: Longest Palindromic Subsequence (LPS)
A subsequence is a sequence derived from another sequence by deleting some or no elements
without changing the order of the remaining elements.
The Longest Palindromic Subsequence is the longest subsequence of a given string that is also a palindrome.

Theory:
- We use Dynamic Programming to solve this problem.
- Define dp[i][j] as the length of the longest palindromic subsequence in string[i:j+1].
- If s[i] == s[j], then dp[i][j] = 2 + dp[i+1][j-1].
- Otherwise, dp[i][j] = max(dp[i+1][j], dp[i][j-1]).
- Base case: Single character substrings are palindromes of length 1.

Time Complexity: O(n^2), Space Complexity: O(n^2).
"""

def longest_palindromic_subsequence(s):
    n = len(s)
    dp = [[0] * n for _ in range(n)]

    # Single character substrings are palindromes of length 1
    for i in range(n):
        dp[i][i] = 1

    # Fill the table for substrings of length 2 and above
    for length in range(2, n + 1):  # length of the substring
        for i in range(n - length + 1):
            j = i + length - 1
            if s[i] == s[j]:
                dp[i][j] = 2 + dp[i + 1][j - 1]
            else:
                dp[i][j] = max(dp[i + 1][j], dp[i][j - 1])

    return dp[0][n - 1]  # LPS length of the entire string

# Example usage
s = "bbbab"
print("Longest Palindromic Subsequence length:", longest_palindromic_subsequence(s))

"""
Output:
Longest Palindromic Subsequence length: 4
"""
