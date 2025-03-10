/*Problem Statement:
The majority element in an array is the element that appears more than n/2 times, where n is the size of the array. We need to find this majority element efficiently.

Example Input and Output:
Input: [3, 2, 3]
Output: 3

Input: [2, 2, 1, 1, 1, 2, 2]
Output: 2

We will solve this in Java, JavaScript, and Python using Boyer-Moore Voting Algorithm, which runs in O(n) time complexity and O(1) space complexity.*/
public class script {
    public static int findMajorityElement(int[] nums) {
        int candidate = 0, count = 0;

        // Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajorityElement(nums));
    }
}
// Majority Element: 2
/*Summary of Code:
We use Boyer-Moore Voting Algorithm to find the majority element efficiently.
We iterate over the array and maintain a candidate that may be the majority element.
If count == 0, we select the current number as the new candidate.
We increase the count when we see the same number and decrease it when we see a different number.
The final candidate is our majority element.*/