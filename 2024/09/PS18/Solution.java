/*Solution-1
public class Test {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.toLowerCase()); // hello world
        System.out.println("JAVA".toLowerCase()); // java
        System.out.println("javaScript".toLowerCase()); // javascript
    }
}

Solution-2
public class Test {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.toUpperCase()); // HELLO WORLD
        System.out.println("java".toUpperCase()); // JAVA
        System.out.println("JavaScript".toUpperCase()); // JAVASCRIPT
    }
}

Solution-3
public class Test {
    public static void main(String[] args) {
        String str = "  Hello World  ";
        System.out.println(str.trim()); // Hello World
        System.out.println("   Java   ".trim()); // Java
        System.out.println("   ".trim()); // ""
    }
}

Solution-4
public class Test {
    public static void main(String[] args) {
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result); // H
    }
}

Solution-5
public class Test {
    public static void main(String[] args) {
        String myStr = "azAZ09";
        for(int i = 0; i < myStr.length(); i+=1){
            int j = myStr.codePointAt(i);
            System.out.println("Code for " + myStr.charAt(i) + " is " + j);
        }
        // Code for a is 97
        // Code for z is 122
        // Code for A is 65
        // Code for Z is 90
        // Code for 0 is 48
        // Code for 9 is 57
    }
}

Solution-6
public class Test {
    public static void main(String[] args) {
        String myStr = "az";
        int j = myStr.codePointBefore(1);
        System.out.println(j); // 97
    }
}
*/