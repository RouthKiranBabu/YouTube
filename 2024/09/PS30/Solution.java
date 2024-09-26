/*Solution-1
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<String> lstr = new HashSet<>();
        lstr.add("Java");
        lstr.add("Python");
        System.out.println(lstr); // [Java, Python]
        lstr.remove("Java");
        System.out.print(lstr); // [Python]
    }
}

Solution-2
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<String> lstr = new HashSet<>();
        lstr.add("Java");
        lstr.add("Python");
        System.out.println(lstr.size()); // 2
    }
}

Solution-3
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Test {
    public static void main(String[] args){
        Set<String> lstr = new HashSet<>();
        lstr.add("Java");
        lstr.add("Python");
        Iterator<String> it = lstr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
// Java
// Python

Solution-4
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<String> lstr = new HashSet<>();
        lstr.add("Java");
        lstr.add("Python");
        Object[] toarr = lstr.toArray();
        for(Object lan: toarr){
            System.out.println(lan);
        }

    }
}
// Java
// Python

Solution-5
import java.util.Set;
import java.util.HashSet;
public class Test {
    public static void main(String[] args){
        Set<String> fstr = new HashSet<>();
        fstr.add("Java");
        fstr.add("Python");
        fstr.add("C++");
        Set<String> sstr = new HashSet<>();
        sstr.add("Java");
        sstr.add("Python");
        System.out.println(fstr); // [Java, C++, Python]
        fstr.retainAll(sstr);
        System.out.print(fstr); // [Java, Python]
    }
}
*/