/*Solution-1
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        String eleat0 = strlist.get(0);
        System.out.print(eleat0); // Apple
    }
}

Solution-2
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        strlist.add("Banana");
        int ixofBan = strlist.indexOf("Banana");
        System.out.print(ixofBan); // 1
    }
}

Solution-3
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static void main(String[] args){
        List<String> strlist = new ArrayList<>();
        strlist.add("Apple");
        strlist.add("Banana");
        strlist.add("Apple");
        System.out.println(strlist.toString()); // [Apple, Banana, Apple]
        int lastinxApp = strlist.lastIndexOf("Apple");
        System.out.println("Last index of " + strlist.get(2) + " at: " + lastinxApp);
        // Last index of Apple at: 2
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
        strlist.remove(1);
        System.out.print(strlist.toString()); // [Apple]
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
        System.out.println(strlist.toString()); // [Apple, Banana]
        strlist.remove("Apple");
        System.out.print(strlist.toString()); // [Banana]
    }
}
*/