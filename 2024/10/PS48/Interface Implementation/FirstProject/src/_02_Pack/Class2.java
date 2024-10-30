package _02_Pack;
interface Calculator {
    void add(int a, int b);
    // Default method
    default void show() {
        System.out.println("Calculator is active");
    }
    // Static method
    static void staticMethodExample() {
        System.out.println("This is a static method in the interface");
    }
}
class SimpleCalculator implements Calculator {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    @Override
    public void show() {
        System.out.println("Simple Calculator is active");
    }
}
public class Class2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new SimpleCalculator();
        calculator.add(5, 10); // Sum: 15
        calculator.show(); // Simple Calculator is active
        Calculator.staticMethodExample(); // This is a static method in the interface
	}
}
