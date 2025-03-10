function findMinMax(arr) {
    let min = Math.min(...arr);
    let max = Math.max(...arr);

    console.log("Minimum value:", min);
    console.log("Maximum value:", max);
}

let arr = [10, 5, 20, 8, 25, 3];
findMinMax(arr);
/*Example Input:
plaintext
Copy
Edit
arr = [10, 5, 20, 8, 25, 3]
Output:
plaintext
Copy
Edit
Minimum value: 3
Maximum value: 25
Explanation:
The Math.min(...arr) function is used to get the minimum value.
The Math.max(...arr) function is used to get the maximum value.
The values are printed to the console.*/