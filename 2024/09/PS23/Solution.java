/*Solution-1
public class Test {
    public static void main(String[] args){
        String text = "Hello";
        System.out.print(text.getClass()); // class java.lang.String
    }
}

Solution-2
public class Test {
    public static void main(String[] args){
        Object number = 10;
        System.out.print(number);
        if(number instanceof Integer){
            System.out.print("Yes " + number + " is integer");// Yes 10 is integer
        }
    }
}

Solution-3
public class Test {
    public static void main(String[] args){
        String str = "hello";
        Integer i = 0;
        Class<?> strclass = String.class;
        if(strclass == str.getClass()){
            System.out.println("Yes " + str + " is a string");
        }else{
            System.out.println("No " + str + " is not a string.");
        }
        Class<?> intclass = Integer.class;
        if(intclass == Integer.class){
            System.out.print("Yes " + i + " is a integer.");
        }else{
            System.out.print("No " + i + " is not a integer.");
        }
        // Yes hello is a string
        // Yes 0 is a integer.
    }
}
*/