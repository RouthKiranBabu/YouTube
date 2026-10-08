import java.util.Scanner;

public class DynamicLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to compare? ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }

        System.out.print("Enter number 1: ");
        int max = scanner.nextInt();

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int current = scanner.nextInt();
            max = Math.max(max, current); // Continuously updates the largest number
        }

        System.out.println("The largest number is: " + max);
        scanner.close();
    }
}

public class LargestNumber {
    public static void main(String[] args) {
        int a = 25;
        int b = 42;
        int c = 18;

        // Math.max(a, b) finds the larger of a and b, 
        // then compares that result with c.
        int largest = Math.max(a, Math.max(b, c));

        System.out.println("The largest number is: " + largest);
    }
}

public class LargestNumber {
    public static void main(String[] args) {
        int a = 25;
        int b = 42;
        int c = 18;

        // Math.max(a, b) finds the larger of a and b, 
        // then compares that result with c.
        int largest = Math.max(a, Math.max(b, c));

        System.out.println("The largest number is: " + largest);
    }
}

public class script {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;
        
        int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        
        System.out.println("Largest number: " + largest);
    }
}
