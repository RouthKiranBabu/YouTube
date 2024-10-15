/*Solution-1
class Car{
    String model;
    int year;
    Car(){
        this.model = "Unknown";
        this.year = 0;
    }
    public void displayInfo(){
        System.out.println("Model: " + this.model + " Year: " + this.year);
    }
}
public class Test {
    public static void main(String[] args){
        Car c = new Car();
        c.displayInfo(); // Model: Unknown Year: 0
    }
}

Solution-2
class Car{
    String model;
    int year;
    Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Model: " + this.model + " Year: " + this.year);
    }
}
public class Test {
    public static void main(String[] args){
        Car c = new Car("Toyota", 2024);
        c.displayInfo(); // Model: Toyota Year: 2024
    }
}
*/