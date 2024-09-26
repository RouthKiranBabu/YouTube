/*Solution-1:
public class Test {
    public static void main(String[] args){
        System.out.printf("%15s|%012.06f%n", "apple", 20.32);
        System.out.printf("%-15s|%012.06f%n", "banana", -323.4333);
        System.out.printf("%15s|%012.06f", "cherry", 20001.22343);
        // apple|00020.320000
        // banana         |-0323.433300
        //          cherry|20001.223430
    }
}

Problem-2:
1.
// Class Dog
class Dog{
    // field(attributes) named "name", "Age".
    String name;
    int Age;
    // method(behavior) named bark() Which prints "Woof!".
    void bark(){
        System.out.println("Woof!" + " by " + name);
    }
}
public class Test {
    public static void main(String[] args){
        // instance of the dog class and provide values to name and age.
        Dog d1 = new Dog();
        d1.name = "Dog1";
        d1.Age = 15;
        // bark method present inside the Dog class.
        d1.bark(); // Woof! by Dog1
        // another instance and do same as above statement.
        Dog d2 = new Dog();
        d2.name = "Dog2";
        d2.Age = 15;
        d2.bark(); // Woof! by Dog2
    }
}

*/