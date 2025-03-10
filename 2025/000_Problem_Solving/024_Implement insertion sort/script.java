/*Insertion Sort Implementation in Java, JavaScript, and Python with Explanation
Definition of Insertion Sort
Insertion Sort is a simple and efficient comparison-based sorting algorithm that works similarly to sorting playing cards in a hand. It builds the sorted array one element at a time by picking the next element and inserting it into its correct position relative to the already sorted part.

Best Case Time Complexity: 
𝑂
(
𝑛
)
O(n) (when the array is already sorted)
Worst Case Time Complexity: 
𝑂
(
𝑛
2
)
O(n 
2
 ) (when the array is sorted in reverse order)
Space Complexity: 
𝑂
(
1
)
O(1) (In-place sorting)
Explanation of the Algorithm
Start from the second element (index 1) as the first element is already "sorted."
Compare the current element with the previous elements.
Shift all larger elements one position ahead.
Insert the current element at its correct position.
Repeat for all elements.
Advantages of Insertion Sort
Simple and easy to implement.
Efficient for small or nearly sorted datasets.
In-place sorting (no extra memory needed).
Disadvantages
Not suitable for large datasets due to 
𝑂
(
𝑛
2
)
O(n 
2
 ) time complexity.*/
import java.util.Arrays;

public class script {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
/*Output
Before Sorting: [9, 5, 1, 4, 3]
After Sorting: [1, 3, 4, 5, 9]
*/