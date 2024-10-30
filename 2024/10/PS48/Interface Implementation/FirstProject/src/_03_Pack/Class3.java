package _03_Pack;
//Define interfaces
interface Vehicle {
 void start();
}

interface Engine {
 void start();
}

//Implement both interfaces in a single class
class Car implements Vehicle, Engine {
 // Implementing both methods from Vehicle and Engine
 public void start() {
     System.out.println("Car engine started");
 }
}
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
        car.start(); // Car engine started
	}

}
