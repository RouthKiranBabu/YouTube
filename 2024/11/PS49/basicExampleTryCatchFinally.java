public class basicExampleTryCatchFinally {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);  // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");  // Always executes
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
// Cannot divide by zero: / by zero
// Execution completed.