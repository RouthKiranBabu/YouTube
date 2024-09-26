/*Solution-1
import java.util.HashMap;
public class Test {
    public static void main(String[] args){
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 10);
        fruits.put("Banana", 20);
        fruits.put("Cherry", 30);
        boolean is20val_present = fruits.containsValue(20); // true
        boolean is30val_present = fruits.containsValue(30); // true
        System.out.println(is20val_present);
        System.out.println(is30val_present);
        fruits.remove("Banana");
        boolean nowis20val_present = fruits.containsValue(20); // false
        boolean nowis30val_present = fruits.containsValue(30); // true
        System.out.println(nowis20val_present);
        System.out.println(nowis30val_present);
    }
}

Solution-2
import java.util.HashMap;
public class Test {
    public static void main(String[] args){
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 10);
        fruits.put("Banana", 20);
        fruits.put("Cherry", 30);
        System.out.print(fruits.size()); // 3
    }
}

Solution-3
import java.util.HashMap;
public class Test {
    public static void main(String[] args){
        HashMap<String, Integer> fruits = new HashMap<>();
        System.out.println(fruits.isEmpty()); // true
        fruits.put("Apple", 10);
        System.out.println(fruits.isEmpty()); // false
    }
}

Solution-4
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
public class Test {
    public static void main(String[] args){
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 10);
        fruits.put("Banana", 20);
        fruits.put("Cherry", 30);
        Set<String> keyset = fruits.keySet();
        System.out.println(keyset); // [Apple, Cherry, Banana]
        Collection<Integer> values = fruits.values();
        System.out.println(values); // [10, 30, 20]
        fruits.clear();
        System.out.println(fruits.isEmpty()); // true
        System.out.print(fruits); // {}
    }
}
*/