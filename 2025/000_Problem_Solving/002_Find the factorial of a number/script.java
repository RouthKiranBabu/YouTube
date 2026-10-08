import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FactorialMemoization {
    // Cache to store calculated factorials
    private static final Map<Integer, BigInteger> memo = new HashMap<>();

    static {
        memo.put(0, BigInteger.ONE);
        memo.put(1, BigInteger.ONE);
    }

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        
        // Return cached result if already calculated
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute using the highest previously calculated value in cache
        BigInteger result = memo.get(memo.size() - 1);
        for (int i = memo.size(); i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
            memo.put(i, result); // Store for future calls
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("10! = " + factorial(10)); // Computes up to 10
        System.out.println("5! = " + factorial(5));   // Returns instantly from cache O(1)
        System.out.println("12! = " + factorial(12)); // Reuses 10! and multiplies by 11 and 12
    }
}

class Factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
