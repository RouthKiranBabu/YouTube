/*Solution-1:
class Lion{
    String gender;
    int age;
    Lion(String Gender, int Age){
        gender = Gender;
        age = Age;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int newage){
        age = newage;
    }
}
public class Test {
    public static void main(String[] args){
        Lion l1 = new Lion("Male", 12);
        String name = l1.getGender();
        System.out.println(name);
        System.out.println(l1.age);
        l1.setAge(15);
        System.out.println(l1.age);
    }
}
*/