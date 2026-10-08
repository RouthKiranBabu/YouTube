public class PrimeCheck {

    public static boolean isPrime(int n) {
        // Step 1: Base cases
        if (n <= 1) return false;
        if (n <= 3) return true; // 2 and 3 are prime

        // Step 2: Eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Step 3: Check remaining potential factors of the form 6k ± 1 up to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 4, 29, 49, 97, 100, 104729};

        for (int num : testNumbers) {
            System.out.println(num + " is prime? " + isPrime(num));
        }
    }
}


public class script {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 29;
        System.out.println(num + " is prime: " + isPrime(num));
    }
}
