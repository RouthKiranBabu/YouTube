/*Solution-1
class Animal{
    String name;
    Animal(String initname){
        this.name = initname;
        System.out.println(this.name + " is an animal.");
    }
    public void eat(){
        System.out.println(this.name + " eats food.");
    }
}
class Dog extends Animal{
    Dog(String dogName){
        super(dogName);
    }
    @Override
    public void eat(){
        System.out.println(this.name + " eats food.");
    }
    public void bark(){
        System.out.println(this.name + " is barking.");
    }
}
public class Test {
    public static void main(String[] args){
        Dog d1 = new Dog("DogNameGiven1");
        d1.eat();
        d1.bark();
    }
}
// DogNameGiven1 is an animal.
// DogNameGiven1 eats food.
// DogNameGiven1 is barking.
*/