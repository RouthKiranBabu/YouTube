/*Solution-1
import java.util.Arrays;
public class Test {
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

Solution-2
import java.util.Arrays;
public class Test {
    public static void main(String[] args){
        int[] arr = { 1, 2, 3 };
        String[] strArr = { "Apple", "Banana" };
        char[] charArr = { 'a', 'b', 'c' };
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]
        System.out.println(Arrays.toString(strArr)); // [Apple, Banana]
        System.out.println(Arrays.toString(charArr)); // [a, b, c]
    }
}

Solution-3
import java.util.Arrays;
public class Test {
    public static void main(String[] args){
        int[][] arr = { {1, 2}, {3, 4} };
        String[][] strArr = { {"Apple", "Banana"}, {"Cherry", "Date"} };
        Object[] objArr = { new int[]{1, 2}, new String[]{"A", "B"} };
        System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4]]
        System.out.println(Arrays.deepToString(strArr)); // [[Apple, Banana], [Cherry, Date]]
        System.out.println(Arrays.deepToString(objArr)); // [[1, 2], [A, B]]
    }
}

*/