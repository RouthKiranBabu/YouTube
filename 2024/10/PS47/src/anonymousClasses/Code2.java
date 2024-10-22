package anonymousClasses;
class Car{
	public void sound() {
		System.out.println("Car is driving!");
	}
}
public class Code2 {
	public static void main(String[] args) {
		Car sportCar = new Car() {
			@Override
			public void sound() {
				System.out.println("Sport car is moving Fast!");
			}
		};
		sportCar.sound(); // Sport car is moving Fast!
	}

}
