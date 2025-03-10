function selectionSort(arr) {
    let n = arr.length;
    for (let i = 0; i < n - 1; i++) {
        let minIndex = i;
        for (let j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j; // Find the minimum element in unsorted part
            }
        }
        // Swap the found minimum element with the first element of unsorted part
        [arr[minIndex], arr[i]] = [arr[i], arr[minIndex]];
    }
}

let arr = [64, 25, 12, 22, 11];
console.log("Original Array:", arr);
selectionSort(arr);
console.log("Sorted Array:", arr);
/*Example Input and Output (JavaScript)
Input: [64, 25, 12, 22, 11]
Output: [11, 12, 22, 25, 64]*/