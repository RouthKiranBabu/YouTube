/*Solution-1
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        Set<String> toRemove = new HashSet<>();
        toRemove.add("Python");
        toRemove.add("C++");
        System.out.println(set); // [Java, C++, Python]
        set.removeAll(toRemove);
        System.out.println(set); // [Java]
    }
}

Solution-2
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('B');
        set.add('C');
        Set<Character> toRemove = new HashSet<>();
        toRemove.add('B');
        System.out.println(set); // [A, B, C]
        set.removeAll(toRemove);
        System.out.println(set); // [A, C]
    }
}

Solution-3
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Set<Integer> toRemove = new HashSet<>();
        toRemove.add(2);
        toRemove.add(3);
        System.out.println(set); // [1, 2, 3]
        set.retainAll(toRemove);
        System.out.println(set); // [2, 3]
    }
}

Solution-4
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        Set<String> toRetain = new HashSet<>();
        toRetain.add("Python");
        System.out.println(set); // [Java, Python]
        set.retainAll(toRetain);
        System.out.println(set); // [Python]
    }
}

Solution-5
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('B');
        set.add('C');
        Set<Character> toRetain = new HashSet<>();
        toRetain.add('B');
        toRetain.add('C');
        System.out.println(set); // [A, B, C]
        set.retainAll(toRetain);
        System.out.println(set); // [B, C]
    }
}

Solution-6
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set); // [1, 2]
        set.clear();
        System.out.println(set); // []
    }
}

Solution-7
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        System.out.println(set); // [Java, Python]
        set.clear();
        System.out.println(set); // []
    }
}
*/