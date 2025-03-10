def find_second_largest(arr):
    if len(arr) < 2:
        raise ValueError("Array must have at least two elements.")

    first, second = float('-inf'), float('-inf')

    for num in arr:
        if num > first:
            second = first
            first = num
        elif num > second and num != first:
            second = num

    return second if second != float('-inf') else -1

# Example usage
arr = [12, 35, 1, 10, 34, 1]
print("Second largest:", find_second_largest(arr))
"""Common Algorithm Explanation:
Initialize first and second to the smallest possible values (Integer.MIN_VALUE, -Infinity, or float('-inf')).
Iterate through the array:
If the current element is greater than first, update second as first, then update first with the current element.
If the current element is greater than second and not equal to first, update second.
If second remains the smallest value, return -1 (indicating no second largest value exists).
Otherwise, return second.
This approach runs in O(n) time complexity since it only requires a single pass through the array. 🚀

Let me know if you have any questions! 😊"""