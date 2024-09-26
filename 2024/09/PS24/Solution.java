/*Solution-1
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        strlist.add("Banana");
        strlist.add("Cherry");
        System.out.println(strlist.toString()); // [Apple, Banana, Cherry]
    }
}

Solution-2
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        strlist.add(1, "Banana");
        strlist.add(0, "Cherry");
        System.out.print(strlist.toString()); // [Cherry, Apple, Banana]
    }
}

Solution-3
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        list1.addAll(1, list2);
        System.out.println(list1.toString()); // [Apple, Banana, Cherry]
        System.out.print(list2.toString()); // [Banana, Cherry]
    }
}

Solution-4
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        strlist.add("Banana");
        System.out.println(strlist.toString()); // [Apple, Banana]
        strlist.clear();
        System.out.print(strlist.toString()); // []
    }
}

Solution-5
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        boolean apple_exist = strlist.contains("Apple");
        boolean banana_exist = strlist.contains("Banana");
        if(apple_exist){
            System.out.println("Yes apple exists.");
        }else{System.out.println("No apple does not exists.");}
        if(banana_exist){
            System.out.print("Yes, Banana exists.");
        }else{System.out.print("No, Banana does not exists.");}
        // Yes apple exists.
        // No, Banana does not exists.
    }
}
*/