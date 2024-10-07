/*Solution-1
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        boolean is_JavaPresent = set.contains("Java");
        boolean is_CppPresent = set.contains("C++");
        System.out.println("Is Java is present: " + is_JavaPresent); // Is Java is present: true
        System.out.print("Is C++ is present: " + is_CppPresent); // Is C++ is present: false
    }
}

Solution-2
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('B');
        boolean is_BPresent = set.contains('B');
        boolean is_CPresent = set.contains('C');
        System.out.println("Is B is present: " + is_BPresent); // Is B is present: true
        System.out.print("Is C is present: " + is_CPresent); // Is C is present: false
    }
}

Solution-3
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set); // [1, 2]
        set.remove(1);
        System.out.println(set); // [2]
    }
}

Solution-4
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        System.out.println(set); // [Java, Python]
        set.remove("Java");
        System.out.println(set); // [Python]
    }
}

Solution-5
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('B');
        System.out.println(set); // [A, B]
        set.remove('A');
        System.out.println(set); // [B]
    }
}

Solution-6
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Set<Integer> toRemove = new HashSet<>();
        toRemove.add(2);
        toRemove.add(3);
        set.removeAll(toRemove);
        System.out.println(set); // [1]
    }
}

*/