/*Problem-1
import java.util.Arrays;
import java.util.List;
public class Test{
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5 };
        String[] strArr = { "A", "B", "C", "D" };
        char[] charArr = { 'a', 'b', 'c', 'd' };
        int[] newarr = Arrays.copyOfRange(arr, 1, 4);
        String[] newstrArr = Arrays.copyOfRange(strArr, 0, 2);
        char[] newcharArr = Arrays.copyOfRange(charArr, 2, 4);
        System.out.println(Arrays.toString(newarr)); // [2, 3, 4]
        System.out.println(Arrays.toString(newstrArr)); // [A, B]
        System.out.println(Arrays.toString(newcharArr)); // [c, d]
    }
}

Problem-2
import java.util.Arrays;
import java.util.List;
public class Test{
    public static void main(String[] args){
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        String[] strArr1 = { "Apple", "Banana" };
        String[] strArr2 = { "Apple", "Banana" };
        char[] charArr1 = { 'a', 'b' };
        char[] charArr2 = { 'a', 'c' };
        boolean bool1 = Arrays.equals(arr1, arr2);
        boolean bool2 = Arrays.equals(strArr1, strArr2);
        boolean bool3 = Arrays.equals(charArr1, charArr2);
        System.out.println(bool1 + "\n" + bool2 + "\n" + bool3);
        // true
        // true
        // false
    }
}

Problem-3
import java.util.Arrays;
import java.util.List;
public class Test{
    public static void main(String[] args){
        int[] arr = new int[5];
        String[] strArr = new String[3];
        double[] doubleArr = new double[4];
        Arrays.fill(arr, 9);
        Arrays.fill(strArr, "Hello");
        Arrays.fill(doubleArr, 3.14);
        System.out.println(Arrays.toString(arr)); // [9, 9, 9, 9, 9]
        System.out.println(Arrays.toString(strArr)); // [Hello, Hello, Hello]
        System.out.println(Arrays.toString(doubleArr)); // [3.14, 3.14, 3.14, 3.14]
    }
}

Problem-4
import java.util.Arrays;
import java.util.List;
public class Test{
    public static void main(String[] args){
        int[] arr = { 5, 2, 4, 1, 3 };
        String[] strArr = { "Banana", "Apple", "Cherry" };
        char[] charArr = { 'd', 'b', 'a', 'c' };
        Arrays.sort(arr);
        Arrays.sort(strArr);
        Arrays.sort(charArr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(strArr)); // [Apple, Banana, Cherry]
        System.out.println(Arrays.toString(charArr)); // [a, b, c, d]
    }
}

Problem-5
import java.util.Arrays;
import java.util.List;
public class Test{
    public static void main(String[] args){
        int[] arr = { 1, 2, 3 };
        String[] strArr = { "Apple", "Banana" };
        char[] charArr = { 'a', 'b', 'c' };
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]
        System.out.println(Arrays.toString(strArr)); // [Apple, Banana]
        System.out.println(Arrays.toString(charArr)); // [a, b, c]
    }
}
*/