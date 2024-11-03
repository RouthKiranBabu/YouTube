class Animal {
    public final void sound() {
        System.out.println("Animal sound");
    }
    
    public void eat() {
        System.out.println("Animal eats");
    }
}

public class finalMethod extends Animal{
    // Uncommenting this will cause a compilation error because sound() is final
    // public void sound() {
    //     System.out.println("Dog barks");
    // }
    
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
    public static void main(String[] args){
        finalMethod dog = new finalMethod();
        dog.sound(); // Calls final method from Animal class: "Animal sound"
        dog.eat();   // Calls overridden method from Dog class: "Dog eats"
    } 
}
