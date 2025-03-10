/*Problem Statement
Given an unsorted array of numbers, find the kth largest or kth smallest element in the array.

Example
Input:
plaintext
Copy
Edit
arr = [3, 2, 1, 5, 6, 4]
k = 2
Output:
plaintext
Copy
Edit
Kth largest element: 5
Kth smallest element: 2*/
import java.util.Arrays;
import java.util.PriorityQueue;

public class script {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println("Kth Largest: " + findKthLargest(arr, k));
        System.out.println("Kth Smallest: " + findKthSmallest(arr, k));
    }
}
/*Kth Largest: 5
Kth Smallest: 2

Explanation
Uses a Min-Heap for the largest element (smallest k elements in heap).
Uses a Max-Heap for the smallest element (largest k elements in heap).
The heap removes extra elements to keep only k elements.*/