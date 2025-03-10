"""
Binary Search in a Rotated Sorted Array in Python

Explanation:
1. The array is rotated, meaning we need to find the sorted half to perform binary search efficiently.
2. Identify whether the left half or right half is sorted.
3. Narrow down the search space accordingly by adjusting `left` and `right` pointers.
4. Continue this process until the target is found or the search space is exhausted.

Time Complexity: O(log N)
"""

class script:
    @staticmethod
    def search(nums, target):
        left, right = 0, len(nums) - 1

        while left <= right:
            mid = (left + right) // 2

            if nums[mid] == target:
                return mid

            # Determine which side is sorted
            if nums[left] <= nums[mid]:  
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1
            else:
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1

        return -1  # Target not found

# Example usage
nums = [4, 5, 6, 7, 0, 1, 2]
target = 6
result = script.search(nums, target)
print("Target found at index:", result)

"""
Output:
Target found at index: 2

Explanation:
The rotated sorted array is [4,5,6,7,0,1,2].
The number 6 is at index 2.
Binary search efficiently finds the element in logarithmic time.
"""
