function removeDuplicates(arr) {
    return [...new Set(arr)];
}

let arr = [1, 2, 3, 2, 4, 5, 1, 6];
console.log(removeDuplicates(arr));
/*nput
javascript
Copy
Edit
arr = [1, 2, 3, 2, 4, 5, 1, 6]
Output
csharp
Copy
Edit
[1, 2, 3, 4, 5, 6]
Explanation
The Set removes duplicate values automatically.
The [...new Set(arr)] spreads the Set back into an array.*/