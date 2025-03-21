# Maximum Submatrix Sum Problem
# Given a 2D matrix, find the submatrix with the maximum sum

def max_submatrix_sum(matrix):
    """
    This function finds the maximum submatrix sum using a 2D adaptation of Kadane’s Algorithm.
    Time Complexity: O(rows^2 * cols) -> Efficient for small to medium matrices.
    """
    if not matrix or not matrix[0]:
        return 0  # Edge case: Empty matrix

    rows, cols = len(matrix), len(matrix[0])
    max_sum = float('-inf')

    # Iterate over all row pairs
    for top in range(rows):
        temp = [0] * cols  # Temporary array for column sums
        for bottom in range(top, rows):
            # Calculate column sums between 'top' and 'bottom' rows
            for col in range(cols):
                temp[col] += matrix[bottom][col]
            
            # Apply Kadane's Algorithm on this 1D array
            max_sum = max(max_sum, kadane(temp))

    return max_sum

def kadane(arr):
    """
    Helper function to find the maximum subarray sum using Kadane’s Algorithm.
    """
    max_current = max_global = arr[0]
    for num in arr[1:]:
        max_current = max(num, max_current + num)
        max_global = max(max_global, max_current)
    return max_global

# Example Matrix
matrix = [
    [1, -2, 3],
    [-4, 5, 6],
    [-7, 8, 9]
]

# Finding Maximum Submatrix Sum
result = max_submatrix_sum(matrix)

# Output
print(result)  # Expected Output: 29 (Submatrix [[5,6], [8,9]])
