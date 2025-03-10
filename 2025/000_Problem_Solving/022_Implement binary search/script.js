function binarySearch(arr, target) {
    let left = 0, right = arr.length - 1;

    while (left <= right) {
        let mid = Math.floor(left + (right - left) / 2);

        if (arr[mid] === target)
            return mid; // Target found

        if (arr[mid] < target)
            left = mid + 1; // Search right half
        else
            right = mid - 1; // Search left half
    }
    return -1; // Target not found
}

// Example usage
let arr = [1, 3, 5, 7, 9, 11, 13];
let target = 7;

let result = binarySearch(arr, target);
if (result !== -1)
    console.log("Element found at index:", result);
else
    console.log("Element not found");
/*Example Input and Output:
pgsql
Copy
Edit
Input: arr = [1, 3, 5, 7, 9, 11, 13], target = 7
Output: Element found at index: 3*/