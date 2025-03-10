def find_first_non_repeating_char(s):
    char_count = {}

    # Count occurrences of each character
    for char in s:
        char_count[char] = char_count.get(char, 0) + 1

    # Find the first character with count 1
    for char in s:
        if char_count[char] == 1:
            return char

    return '_'  # Return '_' if no non-repeating character exists

# Example usage
input_str = "swiss"
print("First Non-Repeating Character:", find_first_non_repeating_char(input_str))

"""Example Input/Output
Input: "swiss"
Output: 'w'"""