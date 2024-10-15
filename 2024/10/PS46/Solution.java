/*Solution-1
class OuterClass{
    private String outerField = "Outer field value";
    class InnerClass{
        void display(){
            System.out.println("Accessing outer class field: " + outerField);
        }
    }
    public void createInnerClassInstance(){
        InnerClass ic = new InnerClass();
        ic.display();
    }
}
public class Test {
    public static void main(String[] args){
        OuterClass oc = new OuterClass();
        oc.createInnerClassInstance(); // Accessing outer class field: Outer field value
    }
}

Solution-2
class OuterClass{
    private static String staticField = "Static outer field";
    static class StaticInnerClass{
        void display(){
            System.out.println("Accessing static outer class field: " + staticField);
        }
    }
}
public class Test {
    public static void main(String[] args){
        OuterClass.StaticInnerClass oc = new OuterClass.StaticInnerClass();
        oc.display(); // Accessing static outer class field: Static outer field
    }
}
*/