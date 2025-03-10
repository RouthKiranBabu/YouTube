"""
    This Python function finds the longest substring without repeating characters.
    - We use the sliding window approach with a Set.
    - The `left` pointer moves forward when a duplicate is found.
    - The `right` pointer extends the window while checking for unique characters.

    Time Complexity: O(n)
    Space Complexity: O(n)
"""

class script:
    @staticmethod
    def longest_unique_substring(s):
        char_set = set()
        left = 0
        max_length = 0

        for right in range(len(s)):
            while s[right] in char_set:
                char_set.remove(s[left])
                left += 1
            char_set.add(s[right])
            max_length = max(max_length, right - left + 1)

        return max_length

# Test case
input_string = "abcabcbb"
result = script.longest_unique_substring(input_string)
print("Longest substring length:", result)

"""
    Output:
    Longest substring length: 3

    Explanation:
    - The longest substring without repeating characters in "abcabcbb" is "abc" with a length of 3.
"""
