package _01_Pack;

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

public class Class1 {

	public static void main(String[] args) {
		Calculator calculator = new SimpleCalculator();
        calculator.add(5, 10);
        calculator.show();
        
        Calculator.staticMethodExample();
	}

}
