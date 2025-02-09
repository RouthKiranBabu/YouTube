public class script {
    public static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Get last digit and add to sum
            num /= 10;       // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 12345; // Example input
        System.out.println("Sum of digits: " + sumDigits(num));
    }
}
