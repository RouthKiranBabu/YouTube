# Josephus Problem - Python Implementation

def josephus(n, k):
    """
    Function to find the safe position using recursion.
    n -> Total number of people
    k -> Step count for elimination
    Returns the safe position (1-based index)
    """
    if n == 1:
        return 0  # Base case: Only one person remains, so they are at index 0 (zero-based)
    else:
        return (josephus(n - 1, k) + k) % n  # Recursive step

# Driver Code
n, k = 7, 3  # Example: 7 people, eliminating every 3rd person
safe_position = josephus(n, k) + 1  # Convert from 0-based to 1-based index

# Output
print(f"The safe position is: {safe_position}")

"""
Expected Output:
The safe position is: 4
"""

# Explanation:
# Given 7 people standing in a circle, counting every 3rd person for elimination,
# the last person left standing is in position 4.
