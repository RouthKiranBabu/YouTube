number = 10  # Example input
binary_string = bin(number)[2:]  # Removing the '0b' prefix
print("Binary String:", binary_string)
"""Explanation:
Python’s bin() function converts a number to binary but prefixes it with 0b.
We remove the first two characters ([2:]) to get the pure binary representation."""