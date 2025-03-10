function findKthLargest(nums, k) {
    let minHeap = [];
    for (let num of nums) {
        minHeap.push(num);
        minHeap.sort((a, b) => a - b);
        if (minHeap.length > k) {
            minHeap.shift();
        }
    }
    return minHeap[0];
}

function findKthSmallest(nums, k) {
    let maxHeap = [];
    for (let num of nums) {
        maxHeap.push(num);
        maxHeap.sort((a, b) => b - a);
        if (maxHeap.length > k) {
            maxHeap.shift();
        }
    }
    return maxHeap[0];
}

let arr = [3, 2, 1, 5, 6, 4];
let k = 2;

console.log("Kth Largest:", findKthLargest(arr, k));
console.log("Kth Smallest:", findKthSmallest(arr, k));
/*Kth Largest: 5
Kth Smallest: 2

Explanation
Uses sorting with an array as a makeshift heap.
Keeps only the k largest or smallest elements.
Retrieves the first element in the modified array.*/