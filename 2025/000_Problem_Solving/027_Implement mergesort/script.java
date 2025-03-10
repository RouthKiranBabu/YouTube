/*Definition of Merge Sort
Merge Sort is a divide-and-conquer algorithm that recursively divides the input array into two halves until each half has one or zero elements. Then, it merges these halves back together in a sorted manner. It has a time complexity of O(n log n) in all cases, making it efficient for large datasets.
*/
import java.util.Arrays;

public class script {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively divide the array
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) arr[k++] = leftArray[i++];
            else arr[k++] = rightArray[j++];
        }

        while (i < n1) arr[k++] = leftArray[i++];
        while (j < n2) arr[k++] = rightArray[j++];
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
/*Original Array: [38, 27, 43, 3, 9, 82, 10]
Sorted Array: [3, 9, 10, 27, 38, 43, 82]

Explanation of Merge Sort Process
Divide: The array is continuously split into halves until only single-element subarrays remain.
Conquer: These single-element subarrays are already sorted by definition.
Merge: The sorted halves are merged together in order, comparing elements and placing them in the correct position.
Time Complexity Analysis
Best Case: O(n log n) → Already sorted input.
Average Case: O(n log n) → Random input.
Worst Case: O(n log n) → Reverse-sorted input.
Key Advantages of Merge Sort
✔️ Efficient for large datasets.
✔️ Guarantees O(n log n) time complexity.
✔️ Works well with linked lists.

Disadvantages
❌ Requires additional space for merging (O(n) extra space).
❌ Not as fast as Quick Sort for smaller datasets.

Conclusion
Merge Sort is a powerful and stable sorting algorithm with consistent performance. It is widely used in real-world applications, such as external sorting (handling large files), and is especially useful when stability and efficiency are required.
*/