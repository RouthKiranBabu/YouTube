/*Solution-1
public class Test {
    public static void main(String[] args){
        String str = "Java Programming";
        System.out.println(str.indexOf("Pro")); // 5
        System.out.println(str.indexOf("Java")); // 0
        System.out.println(str.indexOf("Python")); // -1
    }   
}

Solution-2:
public class Test {
    public static void main(String[] args){
        String str1 = "";
        String str2 = "Hello";
        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false
        System.out.println(" ".isEmpty()); // false
    }   
}

Solution-3:
public class Test {
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(str.length()); // 11
        System.out.println("Java".length()); // 4
        System.out.println("".length()); // 0
    }   
}

Solution-4:
public class Test {
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(str.replace('o', 'a')); // Hella Warld
        System.out.println(str.replace('l', 'p')); // Heppo Worpd
        System.out.println("Java".replace('a', 'e')); // Jeve
    }   
}

Solution-5
public class Test {
    public static void main(String[] args){
        String str = "Java123Java"; // For replaceAll need to use the double quote
        System.out.println(str.replaceAll("\\d", "*")); // Java***Java
        System.out.println("123abc456".replaceAll("\\d", "p")); // pppabcppp
        System.out.println("Hello".replaceAll("l", "w")); // Hewwo
    }   
}
*/