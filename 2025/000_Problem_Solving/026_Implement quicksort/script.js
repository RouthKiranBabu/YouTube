function quickSort(arr) {
    if (arr.length <= 1) {
        return arr;
    }
    
    const pivot = arr[arr.length - 1]; // Choosing last element as pivot
    const left = [];
    const right = [];

    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] < pivot) {
            left.push(arr[i]);
        } else {
            right.push(arr[i]);
        }
    }

    return [...quickSort(left), pivot, ...quickSort(right)];
}

// Example usage
const arr = [8, 4, 7, 3, 5, 2];
console.log("Before sorting:", arr);
const sortedArray = quickSort(arr);
console.log("After sorting:", sortedArray);
/*Example Input & Output
Input: [8, 4, 7, 3, 5, 2]
Output: [2, 3, 4, 5, 7, 8]*/