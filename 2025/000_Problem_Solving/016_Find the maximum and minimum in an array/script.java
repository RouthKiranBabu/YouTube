import java.util.Arrays;

public class script {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25, 3};

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
/*Example Input:
plaintext
Copy
Edit
arr = {10, 5, 20, 8, 25, 3}
Output:
plaintext
Copy
Edit
Minimum value: 3
Maximum value: 25
Explanation:
We use Arrays.stream(arr).min().getAsInt() to find the minimum value.
We use Arrays.stream(arr).max().getAsInt() to find the maximum value.
The min and max values are printed.*/