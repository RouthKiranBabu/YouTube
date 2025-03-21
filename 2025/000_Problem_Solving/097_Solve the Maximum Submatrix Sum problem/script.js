// Maximum Submatrix Sum Problem
// Given a 2D matrix, find the submatrix with the maximum sum

function maxSubmatrixSum(matrix) {
    /**
     * This function finds the maximum submatrix sum using a 2D adaptation of Kadane’s Algorithm.
     * Time Complexity: O(rows^2 * cols).
     */
    if (matrix.length === 0 || matrix[0].length === 0) return 0;

    const rows = matrix.length;
    const cols = matrix[0].length;
    let maxSum = -Infinity;

    // Iterate over all row pairs
    for (let top = 0; top < rows; top++) {
        let temp = new Array(cols).fill(0); // Temporary array for column sums

        for (let bottom = top; bottom < rows; bottom++) {
            // Compute column sums between 'top' and 'bottom' rows
            for (let col = 0; col < cols; col++) {
                temp[col] += matrix[bottom][col];
            }

            // Apply Kadane's Algorithm on the computed column sums
            maxSum = Math.max(maxSum, kadane(temp));
        }
    }

    return maxSum;
}

function kadane(arr) {
    /**
     * Helper function to find the maximum subarray sum using Kadane’s Algorithm.
     */
    let maxCurrent = arr[0];
    let maxGlobal = arr[0];

    for (let i = 1; i < arr.length; i++) {
        maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
        maxGlobal = Math.max(maxGlobal, maxCurrent);
    }

    return maxGlobal;
}

// Example Matrix
const matrix = [
    [1, -2, 3],
    [-4, 5, 6],
    [-7, 8, 9]
];

// Finding Maximum Submatrix Sum
const result = maxSubmatrixSum(matrix);

// Output
console.log(result); // Expected Output: 29 (Submatrix [[5,6], [8,9]])
