/*Solution-1
class Dog{
    String name;
    int age;
}
public class Test{
    public static void main(String[] args){
        Dog d1 = new Dog();
        System.out.println(d1.name); // null
        System.out.print(d1.age); // 0
    }
}

Solution-2
class Dog{
    private String name;
    private int age;
}
public class Test{
    public static void main(String[] args){
        Dog d1 = new Dog();
        System.out.println(d1.name);
        System.out.print(d1.age);
    }
}
// Test.java:8: error: name has private access in Dog
//         System.out.println(d1.name); // null
//                              ^
// Test.java:9: error: age has private access in Dog
//         System.out.print(d1.age); // 0
//                            ^
// 2 errors

Solution-3
class Dog{
    String name;
    int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Dog name: " + this.name);
        System.out.print("Dog age: " + this.age);
    }
}
public class Test{
    public static void main(String[] args){
        Dog d1 = new Dog("Doggy", 11);
        System.out.println(d1.name); // Doggy
        System.out.println(d1.age); // 11
        d1.displayInfo();
        //Dog name: Doggy
        //Dog age: 11
    }
}

Solution-4
class Dog{
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Dog name: " + this.name);
        System.out.print("Dog age: " + this.age);
    }
}
public class Test{
    public static void main(String[] args){
        Dog d1 = new Dog("Doggy", 11);
        d1.displayInfo();
    }
}
// Dog name: Doggy
// Dog age: 11

Solution-5
class Dog{
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Dog name: " + this.name);
        System.out.print("Dog age: " + this.age);
    }
}
class Puppy extends Dog{
    String breed;
    public Puppy(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
}
public class Test{
    public static void main(String[] args){
        Dog d1 = new Puppy("Doggy", 13, "breed1");
        d1.displayInfo();
    }
}
// Dog name: Doggy
// Dog age: 13
*/