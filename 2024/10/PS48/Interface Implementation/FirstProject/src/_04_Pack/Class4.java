package _04_Pack;
interface Shape {
    void draw();
}

// Derived interface that extends Shape
interface Colorful {
    void fillColor();
}

// Class implementing derived interface
class Circle implements Shape, Colorful {
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    public void fillColor() {
        System.out.println("Filling the circle with color");
    }
}
public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
        circle.draw(); // Drawing a circle
        circle.fillColor(); // Filling the circle with color
	}

}
