import java.util.Arrays;

public class script {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, break (array is sorted)
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
/*Bubble Sort Explanation
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process continues until the list is sorted. The algorithm gets its name because smaller elements "bubble" to the top of the list.

Algorithm Steps
Start from the first element and compare it with the next.
If the current element is greater than the next element, swap them.
Move to the next pair and repeat the process.
The largest element moves to the end in each pass.
Repeat the process for the remaining elements until no swaps are needed.
Example
Input
java
Copy
Edit
int arr[] = {64, 34, 25, 12, 22, 11, 90};
Output
less
Copy
Edit
Original array: [64, 34, 25, 12, 22, 11, 90]
Sorted array: [11, 12, 22, 25, 34, 64, 90]*/