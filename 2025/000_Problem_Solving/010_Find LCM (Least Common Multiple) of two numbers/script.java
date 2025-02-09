public class script {
    // Function to calculate GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 18;
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
        // LCM of 12 and 18 is: 36
    }
}
