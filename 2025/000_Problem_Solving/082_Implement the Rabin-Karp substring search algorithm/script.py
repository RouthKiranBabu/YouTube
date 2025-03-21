# Problem: Implement the Rabin-Karp substring search algorithm
# Theory:
# The Rabin-Karp algorithm is a string searching algorithm that uses hashing to find any one of a set of pattern strings in a text.
# It works by computing a hash value for the pattern and for each substring of the text, allowing comparisons to be made efficiently.

# Approach:
# 1. Compute the hash value of the pattern.
# 2. Compute the hash value of the first window of the text.
# 3. Slide the window across the text, updating the hash and comparing it to the pattern's hash.
# 4. If a hash match is found, do a character-by-character check to confirm.

# Actual Implementation:

def rabin_karp(text, pattern, prime=101):
    n = len(text)
    m = len(pattern)
    base = 256  # Total number of characters in the input set
    pattern_hash = 0
    text_hash = 0
    h = 1

    # Compute the value of base^(m-1) % prime
    for i in range(m - 1):
        h = (h * base) % prime

    # Compute the initial hash values for the pattern and the first window of text
    for i in range(m):
        pattern_hash = (base * pattern_hash + ord(pattern[i])) % prime
        text_hash = (base * text_hash + ord(text[i])) % prime

    # Slide the pattern over the text
    for i in range(n - m + 1):
        # If hash values match, check the actual characters
        if pattern_hash == text_hash:
            if text[i:i + m] == pattern:
                print(f"Pattern found at index {i}")

        # Compute hash for the next window
        if i < n - m:
            text_hash = (base * (text_hash - ord(text[i]) * h) + ord(text[i + m])) % prime
            if text_hash < 0:
                text_hash += prime

# Example Usage:
text = "ABABDABACDABABCABAB"
pattern = "ABABCABAB"
rabin_karp(text, pattern)

# Output:
# Pattern found at index 10
