// Josephus Problem - JavaScript Implementation

function josephus(n, k) {
    /**
     * Recursive function to find the safe position
     * n -> Total number of people
     * k -> Step count for elimination
     * Returns the safe position (1-based index)
     */
    if (n === 1)
        return 0; // Base case: Only one person remains, so they are at index 0 (zero-based)
    
    return (josephus(n - 1, k) + k) % n; // Recursive formula
}

// Driver Code
let n = 7, k = 3; // Example: 7 people, eliminating every 3rd person
let safePosition = josephus(n, k) + 1; // Convert from 0-based to 1-based index

// Output
console.log("The safe position is: " + safePosition);

/*
Expected Output:
The safe position is: 4
*/
