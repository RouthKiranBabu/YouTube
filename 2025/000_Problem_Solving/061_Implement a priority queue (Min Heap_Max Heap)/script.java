/*
 * Implementation of Priority Queue using Min Heap and Max Heap in Java.
 * 
 * A Min Heap always keeps the smallest element at the root, whereas a Max Heap keeps the largest.
 * Java's PriorityQueue defaults to a Min Heap, but we can use a comparator to make a Max Heap.
 * 
 * This implementation demonstrates:
 * 1. Inserting elements into Min Heap and Max Heap.
 * 2. Retrieving and removing the top priority element.
 * 3. Printing the priority queues after each operation.
 */

 import java.util.PriorityQueue;
 import java.util.Collections;
 
 class script {
     public static void main(String[] args) {
         // Min Heap (Default)
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
         minHeap.add(10);
         minHeap.add(40);
         minHeap.add(20);
         minHeap.add(5);
 
         System.out.println("Min Heap: " + minHeap);
         System.out.println("Min Heap Poll: " + minHeap.poll()); // Removes smallest element
         System.out.println("Min Heap after Poll: " + minHeap);
 
         // Max Heap (Using Comparator)
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
         maxHeap.add(10);
         maxHeap.add(40);
         maxHeap.add(20);
         maxHeap.add(5);
 
         System.out.println("\nMax Heap: " + maxHeap);
         System.out.println("Max Heap Poll: " + maxHeap.poll()); // Removes largest element
         System.out.println("Max Heap after Poll: " + maxHeap);
     }
 }
 
 /*
  * Output:
  * Min Heap: [5, 10, 20, 40]
  * Min Heap Poll: 5
  * Min Heap after Poll: [10, 40, 20]
  * 
  * Max Heap: [40, 10, 20, 5]
  * Max Heap Poll: 40
  * Max Heap after Poll: [20, 10, 5]
  * 
  * Explanation:
  * - The Min Heap maintains the smallest element at the top.
  * - The Max Heap maintains the largest element at the top.
  * - Polling removes the root element (highest priority).
  */
 