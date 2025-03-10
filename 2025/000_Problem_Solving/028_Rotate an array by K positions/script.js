function rotateRight(arr, k) {
    let n = arr.length;
    k = k % n; // Handle cases where k > n
    let rotated = arr.slice(-k).concat(arr.slice(0, n - k));
    return rotated;
}

let arr = [1, 2, 3, 4, 5, 6, 7];
let k = 3;
console.log("Rotated Array (Right):", rotateRight(arr, k));
/*Input
plaintext
Copy
Edit
Array: [1, 2, 3, 4, 5, 6, 7]
K: 3
Output
plaintext
Copy
Edit
Rotated Array (Right): [5, 6, 7, 1, 2, 3, 4]*/