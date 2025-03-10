/*Quicksort Algorithm Explanation
Quicksort is a divide-and-conquer sorting algorithm that works by selecting a "pivot" element and partitioning the array into two subarrays:

Elements less than the pivot go to the left.
Elements greater than the pivot go to the right.
The process is recursively applied to both subarrays until they are sorted.*/
import java.util.Arrays;
public class script {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 3, 5, 2};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
/*Example Input & Output
Input: {8, 4, 7, 3, 5, 2}
Output: {2, 3, 4, 5, 7, 8}

Explanation
Pivot Selection: In all implementations, the last element is chosen as the pivot.
Partitioning:
Elements smaller than the pivot go to the left.
Elements greater than or equal to the pivot go to the right.
Recursive Sorting: The left and right subarrays are recursively sorted.
Base Case: If the array has one or zero elements, it is already sorted.
Quicksort is widely used because of its efficient average case performance of O(n log n). However, to avoid worst-case scenarios, techniques like random pivot selection or median-of-three pivot selection can be used.*/