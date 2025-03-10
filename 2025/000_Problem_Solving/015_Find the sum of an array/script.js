function arraySum(arr) {
    return arr.reduce((acc, num) => acc + num, 0); // Using reduce to sum elements
}

let numbers = [10, 20, 30, 40, 50]; // Example input
console.log("Sum of array:", arraySum(numbers));
/*Explanation
Define a function arraySum(arr), which takes an array as input.
Use the reduce() method to sum all elements.
acc stores the accumulated sum.
num is the current element.
0 is the initial value.
Call arraySum(numbers) with input [10, 20, 30, 40, 50].
Print the result.
Output
php
Copy
Edit
Sum of array: 150*/