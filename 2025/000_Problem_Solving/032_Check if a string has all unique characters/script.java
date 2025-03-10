import java.util.HashSet;

public class script {
    public static boolean hasUniqueChars(String str) {
        HashSet<Character> charSet = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (charSet.contains(ch)) {
                return false;
            }
            charSet.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "abcdef";
        System.out.println("Input: " + input);
        System.out.println("All unique characters? " + hasUniqueChars(input));

        input = "hello";
        System.out.println("Input: " + input);
        System.out.println("All unique characters? " + hasUniqueChars(input));
    }
}
/*Output
Input: abcdef
All unique characters? true
Input: hello
All unique characters? false
*/