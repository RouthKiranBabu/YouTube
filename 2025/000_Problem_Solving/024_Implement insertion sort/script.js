function insertionSort(arr) {
    let n = arr.length;
    for (let i = 1; i < n; i++) {
        let key = arr[i];
        let j = i - 1;
        
        // Move elements of arr[0..i-1] that are greater than key
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

let arr = [9, 5, 1, 4, 3];
console.log("Before Sorting:", arr);
insertionSort(arr);
console.log("After Sorting:", arr);

/*Output
Before Sorting: [9, 5, 1, 4, 3]
After Sorting: [1, 3, 4, 5, 9]
*/