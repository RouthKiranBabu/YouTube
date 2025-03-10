/*Definition
Array rotation means shifting its elements to the left or right by a given number of positions. When rotating right, the last K elements move to the beginning. When rotating left, the first K elements move to the end. The rotation is cyclic, meaning elements wrap around.*/

import java.util.Arrays;

public class script {
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateRight(arr, k);
        System.out.println("Rotated Array (Right): " + Arrays.toString(arr));
    }
}
/*Input
plaintext
Copy
Edit
Array: [1, 2, 3, 4, 5, 6, 7]
K: 3
Output
plaintext
Copy
Edit
Rotated Array (Right): [5, 6, 7, 1, 2, 3, 4]

Explanation
Handling Large K Values: Since rotating by n is the same as not rotating at all, we use k = k % n to avoid redundant rotations.
Java Approach: Uses the reverse method (reverse full array → reverse first k elements → reverse remaining).
JavaScript Approach: Uses slice() to split and concatenate the parts efficiently.
Python Approach: Uses slicing to shift elements efficiently.*/