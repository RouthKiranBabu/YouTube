function findIntersection(arr1, arr2) {
    let set1 = new Set(arr1);
    let resultSet = new Set();

    arr2.forEach(num => {
        if (set1.has(num)) {
            resultSet.add(num);
        }
    });

    return Array.from(resultSet);
}

// Example Usage
let nums1 = [1, 2, 2, 3, 4];
let nums2 = [2, 2, 4, 5];

console.log("Intersection:", findIntersection(nums1, nums2));
