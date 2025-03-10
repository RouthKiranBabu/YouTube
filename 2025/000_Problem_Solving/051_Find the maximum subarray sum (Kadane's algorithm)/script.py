# Python program to find the maximum subarray sum using Kadane's Algorithm
class script:
    @staticmethod
    def max_subarray_sum(nums):
        max_sum = float('-inf')  # Stores the maximum sum found
        current_sum = 0  # Stores the running sum of the subarray

        for num in nums:
            current_sum += num  # Add the current number to the running sum
            max_sum = max(max_sum, current_sum)  # Update max_sum if current_sum is greater
            
            # If current_sum becomes negative, reset it to 0
            if current_sum < 0:
                current_sum = 0
        
        return max_sum

# Example usage
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
print("Maximum Subarray Sum:", script.max_subarray_sum(arr))

"""
Output:
Maximum Subarray Sum: 6

Explanation:
The subarray [4, -1, 2, 1] has the maximum sum of 6.
Kadane's Algorithm ensures that negative sums are ignored by resetting the current sum.
"""
