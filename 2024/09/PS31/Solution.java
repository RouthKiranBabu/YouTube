/*Solution-1
import java.util.HashSet;
import java.util.Arrays;
public class Test {
    public static void main(String[] args){
        HashSet<String> lan1 = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        HashSet<String> lan2 = new HashSet<>(Arrays.asList("Java", "Python"));
        System.out.println(lan1); // [Java, C++, Python]
        lan1.retainAll(lan2);
        System.out.print(lan1); // [Java, Python]
    }
}

Solution-2
import java.util.HashSet;
import java.util.Arrays;
public class Test {
    public static void main(String[] args){
        HashSet<String> lan1 = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        HashSet<String> lan2 = new HashSet<>(Arrays.asList("Python"));
        System.out.println(lan1); // [Java, C++, Python]
        lan1.removeAll(lan2);
        System.out.print(lan1); // [Java, C++]
    }
}

Solution-3
import java.util.HashSet;
import java.util.Arrays;
public class Test {
    public static void main(String[] args){
        HashSet<String> lan1 = new HashSet<>(Arrays.asList("Java", "Python"));
        HashSet<String> lan2 = new HashSet<>(Arrays.asList("Python", "Java"));
        System.out.print(lan1.equals(lan2)); // true
    }
}

Solution-4
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
public class Test {
    public static void main(String[] args){
        Set<String> lan = new HashSet<>(Arrays.asList("Java", "Python"));
        Iterator<String> it = lan.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
// Java
// Python

Solution-5
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
public class Test {
    public static void main(String[] args){
        Set<String> lan = new HashSet<>(Arrays.asList("Java", "Python"));
        Object[] arr = lan.toArray();
        for(Object str : arr){
            System.out.println(str);
        }
    }
}
// Java
// Python
*/