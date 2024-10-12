/*Solution-1
public class Person {
    private String name;
    private Integer age;
    public Person(String forName, Integer forAge){
        this.name = forName;
        this.age = forAge;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newname){
        this.name = newname;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer newage){
        if (newage >= 0){
            this.age = newage;
        }else{
            System.out.println("Age must be positive.");
        }
    }
    public void displayInfo(){
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }
    public static void main(String[] args){
        Person p1 = new Person("John", 25);
        p1.displayInfo(); // Name: John Age: 25
        p1.setAge(30);
        p1.setName("Doe");
        p1.displayInfo(); // Name: Doe Age: 30
    }
}

*/