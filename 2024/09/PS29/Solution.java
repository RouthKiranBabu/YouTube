/*Solution-1
import java.util.HashSet;
import java.util.Set;
public class Test {
    public static void main(String[] args){
        Set<String> lan = new HashSet<>();
        lan.add("Java");
        lan.add("Python");
        lan.add("C++");
        System.out.print(lan); // [Java, C++, Python]
    }
}

Solution-2
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class Test {
    public static void main(String[] args){
        Set<String> languages = new HashSet<>();
        languages.add("Java");
        Set<String> anset = new HashSet<>(Arrays.asList("Python", "C++"));
        System.out.println(languages); // [Java]
        languages.addAll(anset);
        System.out.print(languages); // [Java, C++, Python]
    }
}

Solution-3
import java.util.HashSet;
import java.util.Set;
public class Test {
    public static void main(String[] args){
        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        System.out.println(languages); // [Java, Python]
        languages.clear(); 
        System.out.print(languages); // []
    }
}

Solution-4
import java.util.HashSet;
import java.util.Set;
public class Test {
    public static void main(String[] args){
        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        boolean isjavaPresent = languages.contains("Java");
        boolean iscppPresent = languages.contains("C++");
        if(isjavaPresent){
            System.out.println("Yes Java is present!");
        }if (iscppPresent){

        }else{
            System.out.print("No C++ is not Present!");
        }
    }
}
// Yes Java is present!
// No C++ is not Present!

Solution-5
import java.util.HashSet;
import java.util.Set;
public class Test {
    public static void main(String[] args){
        Set<String> languages = new HashSet<>();
        System.out.println(languages.isEmpty()); // true
        languages.add("Java" );
        System.out.println(languages.isEmpty()); // false
    }
}
*/