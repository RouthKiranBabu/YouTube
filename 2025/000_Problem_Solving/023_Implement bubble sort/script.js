function bubbleSort(arr) {
    let n = arr.length;
    let swapped;
    for (let i = 0; i < n - 1; i++) {
        swapped = false;
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap elements
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                swapped = true;
            }
        }
        // If no swaps, break
        if (!swapped) break;
    }
}

// Example usage
let arr = [64, 34, 25, 12, 22, 11, 90];
console.log("Original array:", arr);

bubbleSort(arr);

console.log("Sorted array:", arr);
/*Example
Input
javascript
Copy
Edit
let arr = [64, 34, 25, 12, 22, 11, 90];
Output
less
Copy
Edit
Original array: [64, 34, 25, 12, 22, 11, 90]
Sorted array: [11, 12, 22, 25, 34, 64, 90]*/