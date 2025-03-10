/*
    Java program to find the Longest Increasing Subsequence (LIS)
    Approach: Dynamic Programming
    - Create an array `dp[]` where dp[i] stores the length of LIS ending at index i.
    - Iterate through the array and update the dp array by checking previous elements.
    - Return the maximum value in dp[] as the length of LIS.
    - Time Complexity: O(n^2)
*/

import java.util.Arrays;

class script {
    public static int findLIS(int[] nums) {
        if (nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);  // Each element is a subsequence of length 1 initially

        int maxLIS = 1; // Stores the maximum LIS found

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]);
        }

        return maxLIS;
    }

    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        System.out.println("Length of Longest Increasing Subsequence: " + findLIS(nums));
    }
}

/*
Output:
Length of Longest Increasing Subsequence: 6

Explanation:
The longest increasing subsequence in the given array is [10, 22, 33, 50, 60, 80], which has a length of 6.
*/
