/*
Binary Search in a Rotated Sorted Array in Java

Explanation:
1. We first find the index of the smallest element (pivot) in the rotated sorted array.
2. Once we identify the pivot, we perform binary search on either the left or right part, depending on the target value.
3. If the target lies in the left sorted portion (before pivot), search in that range.
4. Otherwise, search in the right sorted portion (after pivot).

Time Complexity: O(log N)
*/

class script {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            // Check which part is sorted
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

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int result = search(nums, target);
        System.out.println("Target found at index: " + result);
    }
}

/*
Output:
Target found at index: 2

Explanation:
The rotated sorted array is {4,5,6,7,0,1,2}.
The number 6 is found at index 2.
The algorithm efficiently finds it in O(log N) time.
*/
