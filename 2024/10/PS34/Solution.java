/*Solution-1
import java.util.Set;
import java.util.HashSet;
public class test {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.print(set); // [1, 2, 3]
    }
}

Solution-2
import java.util.Set;
import java.util.HashSet;
public class test {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");
        System.out.print(set); // [Java, Python]
    }
}

Solution-3
import java.util.Set;
import java.util.HashSet;
public class test {
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('B');
        set.add('C');
        System.out.print(set); // [A, B, C]
    }
}

Solution-4
import java.util.Set;
import java.util.HashSet;
public class test {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.addAll(set2);
        System.out.print(set1); // [1, 2, 3]
    }
}

Solution-5
import java.util.Set;
import java.util.HashSet;
public class test {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("Apple");
        set2.add("Banana");
        set2.add("Apple");
        set1.addAll(set2);
        System.out.print(set1); // [Apple, Banana]
    }
}

Solution-6
import java.util.Set;
import java.util.HashSet;
public class test {
    public static void main(String[] args){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        set1.add('A');
        set2.add('B');
        set2.add('C');
        set1.addAll(set2);
        System.out.print(set1); // [A, B, C]
    }
}

Solution-7
import java.util.Set;
import java.util.HashSet;
public class test {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        boolean is_1Present = set.contains(1);
        boolean is_3Present = set.contains(3);
        System.out.println("Is 1 present: " + is_1Present); // Is 1 present: true
        System.out.print("Is 3 present: " + is_3Present); // Is 3 present: false
    }
}

*/