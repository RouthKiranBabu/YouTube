import java.util.HashSet;

public class script {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> unionSet = new HashSet<>();

        // Adding elements of first array
        for (int num : arr1) {
            unionSet.add(num);
        }

        // Adding elements of second array
        for (int num : arr2) {
            unionSet.add(num);
        }

        // Display the union of two arrays
        System.out.println("Union of arrays: " + unionSet);
    }
}
/*Input
plaintext
Copy
Edit
arr1 = {1, 2, 3, 4, 5}
arr2 = {3, 4, 5, 6, 7}
Output
plaintext
Copy
Edit
Union of arrays: [1, 2, 3, 4, 5, 6, 7]
Explanation
We use a HashSet to store unique elements.
Insert elements of arr1 and arr2 into the set.
Since sets store only unique values, duplicates are automatically removed.*/