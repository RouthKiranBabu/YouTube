// Josephus Problem - Java Implementation

class Josephus {
    // Function to find the safe position
    public static int josephus(int n, int k) {
        // Base case: When only one person remains
        if (n == 1)
            return 0; // 0-based index
        
        // Recursive formula to find the safe position
        return (josephus(n - 1, k) + k) % n;
    }

    // Driver method
    public static void main(String[] args) {
        int n = 7, k = 3;  // Example: 7 people, eliminating every 3rd person
        int safePosition = josephus(n, k) + 1; // Convert from 0-based to 1-based index
        
        // Output result
        System.out.println("The safe position is: " + safePosition);
    }
}

/*
Expected Output:
The safe position is: 4
*/
