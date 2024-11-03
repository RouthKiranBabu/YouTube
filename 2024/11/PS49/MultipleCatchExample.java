public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String[] data = {"10", null, "5"};
            int sum = Integer.parseInt(data[0]) + Integer.parseInt(data[1]);
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null value encountered: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }
}
// Invalid number format: Cannot parse null string
// Operation completed.
