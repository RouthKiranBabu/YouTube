function findSecondLargest(arr) {
    if (arr.length < 2) {
        throw new Error("Array must have at least two elements.");
    }

    let first = -Infinity, second = -Infinity;

    for (let num of arr) {
        if (num > first) {
            second = first;
            first = num;
        } else if (num > second && num !== first) {
            second = num;
        }
    }

    return second === -Infinity ? -1 : second;
}

// Example usage
let arr = [12, 35, 1, 10, 34, 1];
console.log("Second largest:", findSecondLargest(arr));
