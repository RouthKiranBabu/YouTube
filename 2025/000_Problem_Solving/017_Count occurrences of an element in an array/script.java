public class script {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5, 3, 1, 2};
        int target = 2;
        
        int count = countOccurrences(arr, target);
        System.out.println("Occurrences of " + target + ": " + count);
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
/*Input:
java
Copy
Edit
arr = {1, 2, 3, 2, 4, 2, 5, 3, 1, 2}
target = 2
Output:
yaml
Copy
Edit
Occurrences of 2: 4
Explanation:
The number 2 appears 4 times in the given array.*/