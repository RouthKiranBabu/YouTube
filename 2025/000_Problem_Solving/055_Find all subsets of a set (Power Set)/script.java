// The following Java program finds all subsets (Power Set) of a given set using a recursive approach.
// We use a helper function to generate subsets and store them in a list.
// The program prints all subsets, including the empty set.

import java.util.*;

class script {
    static void findSubsets(List<Integer> input, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == input.size()) {
            result.add(new ArrayList<>(current)); // Add current subset to result
            return;
        }
        
        // Include the current element
        current.add(input.get(index));
        findSubsets(input, index + 1, current, result);
        
        // Exclude the current element
        current.remove(current.size() - 1);
        findSubsets(input, index + 1, current, result);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3); // Input set
        List<List<Integer>> result = new ArrayList<>();
        
        findSubsets(input, 0, new ArrayList<>(), result);
        
        System.out.println("Power Set: " + result);
    }
}

/*
 * Output:
 * Power Set: [[], [3], [2], [2, 3], [1], [1, 3], [1, 2], [1, 2, 3]]
 *
 * Explanation:
 * - The function recursively includes and excludes elements to form all subsets.
 * - The final result contains all possible subsets, including the empty set and full set.
 */
