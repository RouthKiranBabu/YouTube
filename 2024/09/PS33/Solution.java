/*Solution-1
class MyInteger{
    private int value;
    MyInteger(int val){
        this.value = val;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int newval){
        this.value = newval;
    }
    public void add(int valadd){
        this.value += valadd;
    }
    @Override
    public String toString(){
        return "Value: " + this.value;
    }
}
public class Test{
    public static void main(String[] args){
        MyInteger mi = new MyInteger(0);
        System.out.println(mi.getValue());
        mi.add(1);
        System.out.println(mi.getValue());
        mi.setValue(0);
        System.out.println(mi.getValue());
        System.out.println(mi);
    }
}

Solution-2
class Car{
    String model;
    Car(String model){
        this.model = model;
    }
}
public class Test{
    public static void main(String[] args){
        Car car = new Car("Tesla");
    }
}

Solution-3
class MathUtils{
    static int add(int a, int b){
        return a + b;
    }
}
public class Test{
    public static void main(String[] args){
        int mu = MathUtils.add(1, 2);
        System.out.print(mu); // 3
    }
}

Solution-4:
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Bark");
    }
}
public class Test{
    public static void main(String[] args){
        Animal d1 = new Dog();
        d1.sound(); // Bark
    }
}

Solution-5:
interface Vehicle{
    default void honk(){
        System.out.println("Vehicle is hooking");
    }
}
class Car implements Vehicle{
}
public class Test{
    public static void main(String[] args){
        Vehicle v1 = new Car();
        v1.honk(); // Vehicle is hooking
    }
}
*/