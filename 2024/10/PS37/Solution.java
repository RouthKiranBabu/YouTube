/*Solution-1
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('B');
        System.out.println(set); // [A, B]
        set.clear();
        System.out.println(set); // []
    }
}

Solution-2
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        System.out.println(set.isEmpty()); // true
    }
}

Solution-3
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Java");
        System.out.println(set.isEmpty()); // false
    }
}

Solution-4
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        set.add('A');
        System.out.println(set.isEmpty()); // false
    }
}

Solution-5
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set.size()); // 2
    }
}

Solution-6
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Java");
        System.out.println(set.size()); // 1
    }
}

Solution-7
import java.util.Set;
import java.util.HashSet;
public class Test{
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        System.out.println(set.size()); // 0
    }
}

Solution-8
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Test{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
// 1
// 2
*/