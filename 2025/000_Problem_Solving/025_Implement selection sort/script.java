/*Selection Sort Definition
Selection Sort is a simple sorting algorithm that divides the input array into two parts: a sorted sublist and an unsorted sublist. The algorithm repeatedly selects the smallest (or largest) element from the unsorted sublist, swaps it with the leftmost unsorted element, and moves the boundary of the sorted sublist one step to the right.

Time Complexity:

Best case: 
𝑂
(
𝑛
2
)
O(n 
2
 )
Average case: 
𝑂
(
𝑛
2
)
O(n 
2
 )
Worst case: 
𝑂
(
𝑛
2
)
O(n 
2
 )
Space Complexity: 
𝑂
(
1
)
O(1) (in-place sorting)*/
import java.util.Arrays;

public class script {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Find the minimum element in unsorted part
                }
            }
            // Swap the found minimum element with the first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
/*Example Input and Output (Java)
Input: [64, 25, 12, 22, 11]
Output: [11, 12, 22, 25, 64]*/