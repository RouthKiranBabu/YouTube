/*
 * JavaScript program to find the median of two sorted arrays.
 * This function merges both arrays, sorts them, and finds the median.
 */

class script {
    static findMedianSortedArrays(nums1, nums2) {
        let merged = nums1.concat(nums2).sort((a, b) => a - b);
        let n = merged.length;
        
        if (n % 2 === 1) {
            return merged[Math.floor(n / 2)]; // Odd length, return middle element
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2; // Even length, return average of middle elements
        }
    }
}

// Example usage
let nums1 = [1, 3];
let nums2 = [2];

let median = script.findMedianSortedArrays(nums1, nums2);
console.log("Median:", median);

/*
 * Output:
 * Median: 2
 *
 * Explanation:
 * The merged array is [1, 2, 3]. The median is the middle element, which is 2.
 */
