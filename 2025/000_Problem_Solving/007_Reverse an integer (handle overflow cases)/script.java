public class script {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        script si = new script();
        System.out.println(si.reverse(123));  // Output: 321
        System.out.println(si.reverse(-456)); // Output: -654
        System.out.println(si.reverse(1534236469)); // Output: 0 (overflow)
    }
}
