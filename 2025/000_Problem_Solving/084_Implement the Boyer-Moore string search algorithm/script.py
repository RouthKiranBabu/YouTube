# Boyer-Moore String Search Algorithm
# -----------------------------------
# The Boyer-Moore algorithm is an efficient string search algorithm that skips sections of the text to improve performance.
# It preprocesses the pattern using two heuristics:
# 1. Bad Character Heuristic: Determines how far to shift when a mismatch occurs.
# 2. Good Suffix Heuristic: Determines shifts when there is a partial match.

def bad_character_heuristic(pattern):
    """Creates the bad character table for Boyer-Moore algorithm."""
    bad_char = [-1] * 256  # Supports all ASCII characters
    for i in range(len(pattern)):
        bad_char[ord(pattern[i])] = i  # Store last occurrence of character
    return bad_char

def boyer_moore_search(text, pattern):
    """Performs Boyer-Moore string search."""
    m, n = len(pattern), len(text)
    bad_char = bad_character_heuristic(pattern)
    
    shift = 0  # Shift of the pattern with respect to text
    results = []

    while shift <= n - m:
        j = m - 1

        # Compare pattern from right to left
        while j >= 0 and pattern[j] == text[shift + j]:
            j -= 1

        if j < 0:  # Pattern found
            results.append(shift)
            shift += (m - bad_char[ord(text[shift + m])] if shift + m < n else 1)
        else:
            shift += max(1, j - bad_char[ord(text[shift + j])])

    return results

# Example usage:
text = "ABAAABCD"
pattern = "ABC"
matches = boyer_moore_search(text, pattern)

# Output: Indices where the pattern is found
print("Pattern found at indices:", matches)

"""
Output:
Pattern found at indices: [4]
"""

# Explanation:
# The function preprocesses the pattern using the bad character heuristic.
# It then slides the pattern over the text and checks for matches using right-to-left comparisons.
# When a mismatch occurs, the pattern is shifted based on the bad character table, optimizing search time.
