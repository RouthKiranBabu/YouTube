/*
 * Java program to find the median of two sorted arrays.
 * This program merges both arrays and then finds the median.
 */
import java.util.Arrays;

class script {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);
        int n = merged.length;
        
        if (n % 2 == 1) {
            return merged[n / 2]; // Odd length, return middle element
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0; // Even length, return average of middle elements
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}

/*
 * Output:
 * Median: 2.0
 *
 * Explanation:
 * The merged array is [1, 2, 3]. The median is the middle element, which is 2.
 */
