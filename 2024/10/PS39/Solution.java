/*Solution-1
public class Test{
    public static int count = 0;
    Test(){
        count++;
    }
    public static void main(String[] args){
        System.out.println(Test.count); // 0
        System.out.println(Test.count); // 0
        Test t1 = new Test();
        System.out.println(Test.count); // 1
        System.out.println(t1.count); // 1
        Test t2 = new Test();
        System.out.println(Test.count); // 2
        System.out.println(t2.count); // 2
    }
}

Solution-2
public class Test{
    public static int mathUtils(int num){
        return num * num;
    }
    public static void main(String[] args){
        System.out.println(Test.mathUtils(5)); // 25

    }
}

Solution-3
public class Person{
    public static String name;
    Person(String initName){
        name = initName;
    }
    public void greet(){
        System.out.println("Hello, " + name + ".");
    }
    public static void main(String[] args){
        Person p1 = new Person("Person1");
        p1.greet(); // Hello, Person1.
    }
}

Solution-4
public class MyClass{
    public static String staticVar = "I am static";
    public String instaceVar = "I am instance";
    public static void staticMethod(){
        System.out.println("Inside static method");
        System.out.println(staticVar);
        // System.out.println(instaceVar); // cant be called
    }
    public void instanceMethod(){
        System.out.println("Inside instance method");
        System.out.println(staticVar);
        System.out.println(instaceVar); // cant be called
    }
    public static void main(String[] args){
        System.out.println(MyClass.staticVar); // I am static
        MyClass.staticMethod();
        // Inside static method
        // I am static
        MyClass mc = new MyClass();
        mc.instanceMethod();
        // Inside instance method
        // I am static
        // I am instance
    }
}
*/