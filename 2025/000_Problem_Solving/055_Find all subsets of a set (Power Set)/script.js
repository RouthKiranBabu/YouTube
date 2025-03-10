// The following JavaScript program generates all subsets (Power Set) of a given set using a backtracking approach.
// It uses a helper function to explore including/excluding elements recursively.

class script {
    static getSubsets(arr, index, current, result) {
        if (index === arr.length) {
            result.push([...current]); // Store current subset
            return;
        }
        
        // Include current element
        current.push(arr[index]);
        script.getSubsets(arr, index + 1, current, result);
        
        // Exclude current element
        current.pop();
        script.getSubsets(arr, index + 1, current, result);
    }

    static main() {
        let arr = [1, 2, 3]; // Input set
        let result = [];
        
        script.getSubsets(arr, 0, [], result);
        console.log("Power Set:", result);
    }
}

script.main();

/*
 * Output:
 * Power Set: [[], [3], [2], [2,3], [1], [1,3], [1,2], [1,2,3]]
 *
 * Explanation:
 * - The function recursively generates subsets by either including or excluding an element.
 * - The result contains all possible subsets of the input set.
 */
