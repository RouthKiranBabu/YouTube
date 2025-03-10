def has_unique_chars(s):
    char_set = set()
    for ch in s:
        if ch in char_set:
            return False
        char_set.add(ch)
    return True

# Example test cases
print("Input: 'abcdef'")
print("All unique characters?", has_unique_chars("abcdef"))

print("Input: 'hello'")
print("All unique characters?", has_unique_chars("hello"))

"""Output:
Input: 'abcdef'
All unique characters? True
Input: 'hello'
All unique characters? False
"""