public class script {
    public static double power(double base, int exponent) {
        double result = 1;
        boolean isNegative = exponent < 0;
        exponent = Math.abs(exponent);

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return isNegative ? 1 / result : result;
    }

    public static void main(String[] args) {
        double base = 2;
        int exponent = -3;
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }
}
/*Example:
Input:
plaintext
Copy
Edit
Base = 2, Exponent = -3
Output:
plaintext
Copy
Edit
2^-3 = 0.125*/