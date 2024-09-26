/*Solution-1
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list2.add("Apple");
        System.out.println("Before:\n" + "list1: " + list1.toString() + "\nlist2: " + list2.toString());
        list1.removeAll(list2);
        System.out.println("After:\n" + "list1: " + list1.toString() + "\nlist2: " + list2.toString());
        // Before:
        // list1: [Apple, Banana]
        // list2: [Apple]
        // After:
        // list1: [Banana]
        // list2: [Apple]
    }
}

Solution-2
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        System.out.println(strlist.toString()); // [Apple]
        strlist.set(0, "Banana");
        System.out.println(strlist.toString()); // [Banana]
    }
}

Solution-3
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        int sz = strlist.size();
        System.out.println(sz); // 1
    }
}

Solution-4
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        System.out.println(strlist.isEmpty()); // true
        strlist.add("Apple");
        System.out.println(strlist.isEmpty()); // false
    }
}

Solution-5
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        strlist.add("Banana");
        System.out.println(strlist.get(0)); // Apple
        Object[] arrlist = strlist.toArray();
        System.out.println(arrlist[0]); // Apple
    }
}

Solution-6
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        strlist.add("Banana");
        strlist.add("Cherry");
        List<String> substrlist = strlist.subList(0, 2);
        System.out.println(substrlist.toString()); // [Apple, Banana]
    }
}
*/