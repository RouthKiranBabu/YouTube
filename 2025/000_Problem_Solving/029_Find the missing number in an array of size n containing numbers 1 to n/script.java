/*Definition:
The problem is to find the missing number in an array of size n-1, where the elements are in the range from 1 to n. This means that one number from 1 to n is missing, and our task is to find that number efficiently.

Approach:
A mathematical approach using the sum formula is optimal:

Calculate the expected sum using the formula:
Sum=[𝑛(𝑛+1)]/2

Calculate the actual sum of elements in the array.
Subtract actual sum from expected sum to find the missing number.*/
public class script {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // n = 6, missing = 3
        int n = 6;
        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }
}
/*Output
Missing number: 3

Explanation at the End
The above implementations use the sum formula method to efficiently find the missing number. The time complexity of this approach is O(n) because we iterate through the array once to compute the sum. The space complexity is O(1) since no extra space is used apart from a few variables.

This method is more efficient than sorting or using extra data structures, making it an optimal choice for finding a missing number in a sequence. 🚀
*/