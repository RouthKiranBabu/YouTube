/*
Binary Search in a Rotated Sorted Array in JavaScript

Explanation:
1. Identify which part of the array (left or right) is sorted.
2. If the left part is sorted, check if the target lies in that range.
3. Otherwise, search in the right sorted portion.
4. Keep reducing the search space using binary search.

Time Complexity: O(log N)
*/

class script {
    static search(nums, target) {
        let left = 0, right = nums.length - 1;

        while (left <= right) {
            let mid = Math.floor((left + right) / 2);

            if (nums[mid] === target)
                return mid;

            // Check if left part is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1; // Target not found
    }
}

// Example usage
let nums = [4, 5, 6, 7, 0, 1, 2];
let target = 6;
console.log("Target found at index:", script.search(nums, target));

/*
Output:
Target found at index: 2

Explanation:
The rotated sorted array is [4,5,6,7,0,1,2].
The number 6 is at index 2.
Binary search efficiently finds the element in logarithmic time.
*/
