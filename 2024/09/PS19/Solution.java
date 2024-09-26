/*Problem-1
public class Test{
    public static void main(String[] args){
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String newstr = new String(chars);
        System.out.println(newstr); // Hello
    }
}

Problem-2
public class Test{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(", ").append("World!");
        String str4 = sb.toString();
        System.out.println(sb + " " +str4); // Hello, World! Hello, World!
    }
}

Problem-3
import java.util.List;
import java.util.Arrays;
public class Test{
    public static void main(String[] args){
        String[] arr = { "Apple", "Banana", "Cherry" };
        Integer[] intArr = { 1, 2, 3 };
        Character[] charArr = { 'a', 'b', 'c' };
        List<String> newstr = Arrays.asList(arr);
        List<Integer> newint = Arrays.asList(intArr);
        List<Character> newchar = Arrays.asList(charArr);
        System.out.println(newstr); // [Apple, Banana, Cherry]
        System.out.println(newint); // [1, 2, 3]
        System.out.println(newchar); // [a, b, c]
    }
}

Problem-4
import java.util.List;
import java.util.Arrays;
public class Test{
    public static void main(String[] args){
        int[] arr = { 1, 3, 5, 7, 9 };
        String[] strArr = { "Apple", "Banana", "Cherry" };
        char[] charArr = { 'a', 'c', 'e', 'g' };
        int arri = Arrays.binarySearch(arr, 5);
        int strarri = Arrays.binarySearch(strArr, "Banana");
        int chararri = Arrays.binarySearch(charArr, 'e');
        System.out.println(arri); // 2
        System.out.println(strarri); // 1
        System.out.println(chararri); // 2
    }
}

Problem-5
import java.util.List;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Test{
    public static void main(String[] args){
        int[] arr = { 1, 2, 3 };
        String[] strArr = { "Apple", "Banana" };
        double[] doubleArr = { 1.1, 2.2, 3.3 };
        int[] newarr = Arrays.copyOf(arr, 5);
        String[] newstrArr = Arrays.copyOf(strArr, 3);
        double[] newdoubleArr = Arrays.copyOf(doubleArr, 2);
        System.out.println(newarr + "\n" + newstrArr + "\n" + newdoubleArr);
        System.out.println(Arrays.toString(newarr)); // [1, 2, 3, 0, 0]
        System.out.println(Arrays.toString(newstrArr)); // [Apple, Banana, null]
        System.out.println(Arrays.toString(newdoubleArr)); // [1.1, 2.2]
    }
}
*/