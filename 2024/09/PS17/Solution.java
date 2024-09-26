/*Solution-1
public class Test {
    public static void main(String[] args){
        String str = "apple,orange,banana";
        String[] strarr = str.split(",");
        for(String ele: strarr){
            System.out.println(ele);
        }
    }
}
// apple
// orange
// banana

Solution-2
public class Test {
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(str.startsWith("Hello")); // true
        System.out.println(str.startsWith("World")); // false
        System.out.println(str.startsWith("He")); // true
    }
}

Solution-3
public class Test {
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(str.substring(6)); // World
        System.out.println(str.substring(0)); // Hello World
        System.out.println(str.substring(4)); // o World
    }
}

Solution-4
public class Test {
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(str.substring(0, 5)); // Hello
        System.out.println(str.substring(6, 11)); // World
        System.out.println(str.substring(3, 7)); // lo W
    }
}

Solution-5
public class Test {
    public static void main(String[] args){
        String str = "Hello";
        char[] chararr = str.toCharArray();
        for(char c: chararr){
            System.out.println(c);
        }
    }
}
// H
// e
// l
// l
// o

Solution-6
public class Test {
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(str.startsWith("Hello")); // true
        System.out.println(str.startsWith("World")); // false
        System.out.println(str.startsWith("He")); // true
    }
}
*/