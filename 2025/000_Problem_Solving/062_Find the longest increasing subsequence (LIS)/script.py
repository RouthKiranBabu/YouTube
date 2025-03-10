"""
    Python program to find the Longest Increasing Subsequence (LIS)
    Approach: Dynamic Programming
    - Create a list `dp[]` where dp[i] stores the length of LIS ending at index i.
    - Iterate through the array and update the dp list by checking previous elements.
    - Return the maximum value in dp[] as the length of LIS.
    - Time Complexity: O(n^2)
"""

class script:
    @staticmethod
    def findLIS(nums):
        if not nums:
            return 0

        dp = [1] * len(nums)  # Each element is initially a subsequence of length 1
        maxLIS = 1  # Stores the maximum LIS found

        for i in range(1, len(nums)):
            for j in range(i):
                if nums[i] > nums[j]:
                    dp[i] = max(dp[i], dp[j] + 1)
            maxLIS = max(maxLIS, dp[i])

        return maxLIS

# Example usage
nums = [10, 22, 9, 33, 21, 50, 41, 60, 80]
print("Length of Longest Increasing Subsequence:", script.findLIS(nums))

"""
Output:
Length of Longest Increasing Subsequence: 6

Explanation:
The longest increasing subsequence in the given array is [10, 22, 33, 50, 60, 80], which has a length of 6.
"""
