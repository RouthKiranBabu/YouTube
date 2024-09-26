/*Solution-1
import java.util.HashMap;
public class Test {
    public static void main(String[] args){
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 10);
        fruits.put("banana", 20);
        fruits.put("cherry", 30);
        System.out.println(fruits.get("apple")); // 10
    }    
}

Solution-2
import java.util.HashMap;
public class Test{
    public static void main(String[] args){
        HashMap<String, Integer> dict = new HashMap<>();
        dict.put("date", 40);
        dict.put("elderberry", 50);
        dict.put("fig", 60);
        System.out.print(dict); // {date=40, fig=60, elderberry=50}
    }
}

Solution-3
import java.util.HashMap;
public class Test{
    public static void main(String[] args){
        HashMap<String, Integer> dict = new HashMap<>();
        dict.put("apple", 10);
        dict.put("cherry", 30);
        System.out.println(dict.get("apple")); // 10
        System.out.print(dict.get("cherry")); // 30
    }
}

Solution-4
import java.util.HashMap;
public class Test{
    public static void main(String[] args){
        HashMap<String, Integer> dict = new HashMap<>();
        dict.put("banana", 10);
        System.out.println(dict); // {banana=10}
        dict.remove("banana");
        System.out.print(dict); // {}
    }
}

Solution-5
import java.util.HashMap;
public class Test{
    public static void main(String[] args){
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 10);
        fruits.put("banana", 20);
        boolean appleIsPresent = fruits.containsKey("apple");
        boolean bananaIsPresent = fruits.containsKey("grapes");
        if(appleIsPresent){
            System.out.println("Yes, apple key is present.");
        }if (bananaIsPresent){

        }else{
            System.out.print("No, banana is not present.");
        }
    }
}
// Yes, apple key is present.
// No, banana is not present.
*/