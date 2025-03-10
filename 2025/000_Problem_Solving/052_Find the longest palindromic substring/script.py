"""
This Python program finds the longest palindromic substring using the expand-around-center approach.
It checks each character and each pair of characters as the center of a possible palindrome.
"""

class script:
    @staticmethod
    def longest_palindrome(s):
        if not s or len(s) < 1:
            return ""

        start, end = 0, 0

        def expand_around_center(left, right):
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            return right - left - 1

        for i in range(len(s)):
            len1 = expand_around_center(i, i)      # Odd length palindrome
            len2 = expand_around_center(i, i + 1)  # Even length palindrome
            length = max(len1, len2)

            if length > (end - start):
                start = i - (length - 1) // 2
                end = i + length // 2

        return s[start:end + 1]


# Example usage
str_value = "babad"
print("Longest Palindromic Substring:", script.longest_palindrome(str_value))

"""
Output:
Longest Palindromic Substring: aba  (or "bab", since both are valid)

Explanation:
The function finds palindromic substrings by expanding from centers.
For input "babad", it detects either "aba" or "bab" as the longest palindrome.
"""
