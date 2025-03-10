function findMissingNumber(arr, n) {
    let expectedSum = (n * (n + 1)) / 2;
    let actualSum = arr.reduce((sum, num) => sum + num, 0);
    
    return expectedSum - actualSum;
}

// Example usage
let arr = [1, 2, 4, 5, 6]; // n = 6, missing = 3
let n = 6;
console.log("Missing number:", findMissingNumber(arr, n));

/*Output
Missing number: 3
*/