"""
Python program to find the median of two sorted arrays.
This function merges both arrays, sorts them, and finds the median.
"""

class script:
    @staticmethod
    def find_median_sorted_arrays(nums1, nums2):
        merged = sorted(nums1 + nums2)
        n = len(merged)
        
        if n % 2 == 1:
            return merged[n // 2]  # Odd length, return middle element
        else:
            return (merged[n // 2 - 1] + merged[n // 2]) / 2  # Even length, return average of middle elements

# Example usage
nums1 = [1, 3]
nums2 = [2]

median = script.find_median_sorted_arrays(nums1, nums2)
print("Median:", median)

"""
Output:
Median: 2

Explanation:
The merged array is [1, 2, 3]. The median is the middle element, which is 2.
"""
