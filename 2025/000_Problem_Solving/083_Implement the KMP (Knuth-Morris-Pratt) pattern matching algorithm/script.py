# KMP Algorithm for Pattern Matching in Python

# Problem Statement:
# Given a text and a pattern, find all occurrences of the pattern in the text using the KMP algorithm.
# The KMP algorithm preprocesses the pattern to create an LPS (Longest Prefix Suffix) array,
# which helps in avoiding redundant comparisons during the search.

def compute_lps(pattern):
    """
    Function to preprocess the pattern and create the LPS array.
    LPS array stores the length of the longest prefix which is also a suffix.
    """
    m = len(pattern)
    lps = [0] * m  # Initialize LPS array with zeros
    j = 0  # Length of the previous longest prefix suffix

    for i in range(1, m):
        while j > 0 and pattern[i] != pattern[j]:
            j = lps[j - 1]  # Fall back in the pattern
        if pattern[i] == pattern[j]:
            j += 1
            lps[i] = j  # Store the length in LPS array
    return lps

def kmp_search(text, pattern):
    """
    Function to perform the KMP search algorithm.
    Returns the starting indices of all occurrences of the pattern in the text.
    """
    n, m = len(text), len(pattern)
    lps = compute_lps(pattern)  # Precompute the LPS array
    j = 0  # Index for pattern
    result = []

    for i in range(n):
        while j > 0 and text[i] != pattern[j]:
            j = lps[j - 1]  # Fall back in pattern
        if text[i] == pattern[j]:
            j += 1
        if j == m:  # Pattern found
            result.append(i - m + 1)
            j = lps[j - 1]  # Continue searching for more occurrences

    return result

# Example Usage
text = "ababcababcabc"
pattern = "abc"
print("Pattern found at indices:", kmp_search(text, pattern))

# Expected Output:
# Pattern found at indices: [2, 7, 10]

"""
Explanation:
1. The pattern 'abc' appears at indices 2, 7, and 10 in the text.
2. The LPS array helps in avoiding unnecessary comparisons, making the search efficient.
3. Time Complexity: O(n + m), where n is the length of the text and m is the length of the pattern.
"""
