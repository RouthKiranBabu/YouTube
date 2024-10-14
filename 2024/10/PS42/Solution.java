/*Solution-1
class Calculator{
    public int add(int a, int b){return a + b;}
    public int add(int a, int b, int c){return a + b + c;}
    public double add(double a, double b){return a + b;}
}
public class Test {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10)); // 15
        System.out.println(c.add(5, 10, 15)); // 30
        System.out.println(c.add(2.5, 3.5)); // 6.0
    }
}

Solution-2
class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat meows");
    }
}
public class Test {
    public static void main(String[] args){
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        a.sound(); // Animal makes a sound
        d.sound(); // Dog barks
        c.sound(); // Cat meows
    }
}
*/