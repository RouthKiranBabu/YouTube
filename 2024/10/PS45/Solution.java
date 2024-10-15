/*Solution-1
class Car{
    String model;
    int year;
    String color;
    Car(){
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unpainted";
    }
    Car(String model, int year){
        this.model = model;
        this.year = year;
        this.color = "Unpainted";
    }
    Car(String model, int year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public void displayDetails(){
        System.out.println("Model: " + this.model + ", Year: " + this.year + ", Color: " + this.color);
    }
}
public class Test {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("Toyota Corolla", 2022);
        Car c3 = new Car("Tesla Model S", 2024, "Red");
        c1.displayDetails(); // Model: Unknown, Year: 0, Color: Unpainted
        c2.displayDetails(); // Model: Toyota Corolla, Year: 2022, Color: Unpainted
        c3.displayDetails(); // Model: Tesla Model S, Year: 2024, Color: Red
    }
}

Solution-2
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }
    public void displayInfo(){
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}
public class Test{
    public static void main(String[] args){
        Person p1 = new Person("John", 25);
        Person p2 = new Person(p1);
        p1.displayInfo(); // Name: John, Age: 25
        p2.displayInfo(); // Name: John, Age: 25
    }
}
*/