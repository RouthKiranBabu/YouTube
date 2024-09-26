/*Problem-1:
1.
public class Test {
    public static void main(String[] args){
        String firststr = "Hello, World";
        String secondstr = new String("Java Programming");
    }
}

2.
public class Test {
    public static void main(String[] args){
        String str1 = "Hello, World.";
        String str2 = "apple";
        String str3 = "banana";
        System.out.println(str1.charAt(0)); // H
        System.out.println(str1.charAt(4)); // O
        System.out.println(str1.charAt(6)); // Contains space
    }
}

3.
public class Test {
    public static void main(String[] args){
        String str2 = "apple";
        String str3 = "banana";
        System.out.println(str2.compareTo(str3));// -1(apple is less than banana)
        System.out.println(str3.compareTo(str2));// 1(banana is greater than apple)
        System.out.println(str2.compareTo(str2));// 0(both the string are the same)
    }
}

Problem-2
1.
public class Test {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = " World";
        System.out.println(str1.concat(str2)); // Hello World
        System.out.println(str1.concat(" Java")); // Hello Java
        System.out.println("Java ".concat("Programming")); // Java Programming
    }
}

*/