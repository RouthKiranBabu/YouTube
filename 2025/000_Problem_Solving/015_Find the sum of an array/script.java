public class script {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Example input
        int sum = 0;

        for (int num : numbers) {
            sum += num;  // Adding each element to sum
        }

        System.out.println("Sum of array: " + sum);
    }
}
/*Explanation
Declare an integer array numbers with values {10, 20, 30, 40, 50}.
Initialize sum = 0.
Use a for-each loop to iterate through the array and add each element to sum.
Print the sum.
Output
php
Copy
Edit
Sum of array: 150*/