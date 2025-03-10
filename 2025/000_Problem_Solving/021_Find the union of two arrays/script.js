function unionOfArrays(arr1, arr2) {
    let unionSet = new Set([...arr1, ...arr2]);
    return Array.from(unionSet);
}

// Example input
let arr1 = [1, 2, 3, 4, 5];
let arr2 = [3, 4, 5, 6, 7];

console.log("Union of arrays:", unionOfArrays(arr1, arr2));
/*Input
plaintext
Copy
Edit
arr1 = [1, 2, 3, 4, 5]
arr2 = [3, 4, 5, 6, 7]
Output
plaintext
Copy
Edit
Union of arrays: [1, 2, 3, 4, 5, 6, 7]
Explanation
The Set object in JavaScript automatically removes duplicates.
We use the spread operator (...) to merge both arrays into a set.
Finally, we convert the set back to an array.*/