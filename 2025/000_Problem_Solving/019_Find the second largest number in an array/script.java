import java.util.Arrays;
public class script {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest: " + findSecondLargest(arr));
    }
}
/**
 * Input:
java
Copy
Edit
int[] arr = {12, 35, 1, 10, 34, 1};
Output:
sql
Copy
Edit
Second largest: 34
Explanation:
The largest number is 35.
The second largest number is 34./