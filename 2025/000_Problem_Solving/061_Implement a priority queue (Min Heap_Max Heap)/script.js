/*
 * Implementation of Priority Queue using Min Heap and Max Heap in JavaScript.
 * 
 * JavaScript does not have a built-in priority queue, so we use a custom class.
 * Min Heap maintains the smallest element at the top.
 * Max Heap maintains the largest element at the top.
 */

class script {
    constructor(compareFn) {
        this.heap = [];
        this.compareFn = compareFn; // Function to determine heap order
    }

    push(value) {
        this.heap.push(value);
        this.heap.sort(this.compareFn); // Maintain heap property
    }

    pop() {
        return this.heap.shift(); // Remove top priority element
    }

    peek() {
        return this.heap[0]; // Get top element
    }

    print() {
        console.log(this.heap);
    }
}

// Min Heap (Default)
const minHeap = new script((a, b) => a - b);
minHeap.push(10);
minHeap.push(40);
minHeap.push(20);
minHeap.push(5);

console.log("Min Heap: ");
minHeap.print();
console.log("Min Heap Poll: ", minHeap.pop());
console.log("Min Heap after Poll: ");
minHeap.print();

// Max Heap (Reverse Comparator)
const maxHeap = new script((a, b) => b - a);
maxHeap.push(10);
maxHeap.push(40);
maxHeap.push(20);
maxHeap.push(5);

console.log("\nMax Heap: ");
maxHeap.print();
console.log("Max Heap Poll: ", maxHeap.pop());
console.log("Max Heap after Poll: ");
maxHeap.print();

/*
 * Output:
 * Min Heap:
 * [5, 10, 20, 40]
 * Min Heap Poll: 5
 * Min Heap after Poll:
 * [10, 20, 40]
 * 
 * Max Heap:
 * [40, 20, 10, 5]
 * Max Heap Poll: 40
 * Max Heap after Poll:
 * [20, 10, 5]
 * 
 * Explanation:
 * - The heap is implemented using a sorted array.
 * - Insertion keeps elements sorted.
 * - The root element (smallest for Min Heap, largest for Max Heap) is removed on polling.
 */
