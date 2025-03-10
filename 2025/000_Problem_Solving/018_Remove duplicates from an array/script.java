import java.util.*;
public class script {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};

        // Convert array to a Set to remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert back to an array
        int[] uniqueArr = set.stream().mapToInt(Integer::intValue).toArray();

        // Output result
        System.out.println(Arrays.toString(uniqueArr));
    }
}
/*Input
java
Copy
Edit
arr = {1, 2, 3, 2, 4, 5, 1, 6}
Output
csharp
Copy
Edit
[1, 2, 3, 4, 5, 6]
Explanation
The LinkedHashSet automatically removes duplicates while maintaining the order.
We convert it back to an array using stream().*/