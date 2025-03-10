function countOccurrences(arr, target) {
    return arr.filter(num => num === target).length;
}

const arr = [1, 2, 3, 2, 4, 2, 5, 3, 1, 2];
const target = 2;
console.log(`Occurrences of ${target}: ${countOccurrences(arr, target)}`);
/*Input:
javascript
Copy
Edit
arr = [1, 2, 3, 2, 4, 2, 5, 3, 1, 2]
target = 2
Output:
yaml
Copy
Edit
Occurrences of 2: 4
Explanation:
The function filters the array for elements that match target and counts them.*/