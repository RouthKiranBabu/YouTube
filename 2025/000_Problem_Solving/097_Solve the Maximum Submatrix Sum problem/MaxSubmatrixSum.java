// Maximum Submatrix Sum Problem
// Given a 2D matrix, find the submatrix with the maximum sum

public class MaxSubmatrixSum {
    public static int maxSubmatrixSum(int[][] matrix) {
        /**
         * This function finds the maximum submatrix sum using a 2D adaptation of Kadane’s Algorithm.
         * Time Complexity: O(rows^2 * cols).
         */
        if (matrix.length == 0 || matrix[0].length == 0) return 0;

        int rows = matrix.length, cols = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;

        // Iterate over all row pairs
        for (int top = 0; top < rows; top++) {
            int[] temp = new int[cols]; // Temporary array for column sums

            for (int bottom = top; bottom < rows; bottom++) {
                // Compute column sums between 'top' and 'bottom' rows
                for (int col = 0; col < cols; col++) {
                    temp[col] += matrix[bottom][col];
                }
                
                // Apply Kadane's Algorithm on the computed column sums
                maxSum = Math.max(maxSum, kadane(temp));
            }
        }

        return maxSum;
    }

    private static int kadane(int[] arr) {
        /**
         * Helper function to find the maximum subarray sum using Kadane’s Algorithm.
         */
        int maxCurrent = arr[0], maxGlobal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }

        return maxGlobal;
    }

    public static void main(String[] args) {
        // Example Matrix
        int[][] matrix = {
            {1, -2, 3},
            {-4, 5, 6},
            {-7, 8, 9}
        };

        // Finding Maximum Submatrix Sum
        int result = maxSubmatrixSum(matrix);

        // Output
        System.out.println(result); // Expected Output: 29 (Submatrix [[5,6], [8,9]])
    }
}
