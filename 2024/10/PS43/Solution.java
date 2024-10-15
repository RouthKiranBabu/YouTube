/*Solution-1
abstract class Animal{
    public abstract void sound();
    public void sleep(){
        System.out.println("This animal is sleeping.");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("The cat meows.");
    }
}
public class Test {
    public static void main(String[] args){
        Animal dog = new Dog();
        dog.sound(); // The dog barks.
        dog.sleep(); // This animal is sleeping.
        Animal cat = new Cat();
        cat.sound(); // The cat meows.
    }
}

Solution-2
interface Vehicle{
    abstract void startEngine();

    default void honk(){
        System.out.println("The vehicle honks.");
    }
}
class Car implements Vehicle{
    public void startEngine(){
        System.out.println("The car engine starts.");
    }
}
class Bike implements Vehicle{
    public void startEngine(){
        System.out.println("The bike engine starts.");
    }
}
public class Test{
    public static void main(String[] args){
        Vehicle car = new Car();
        car.startEngine(); // The car engine starts.
        car.honk(); // The vehicle honks.
        Vehicle bike = new Bike();
        bike.startEngine(); // The bike engine starts.
        bike.honk(); // The vehicle honks.
    }
}
*/