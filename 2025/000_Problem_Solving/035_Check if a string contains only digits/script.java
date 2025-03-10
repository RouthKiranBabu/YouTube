/*Problem Statement
We need to check whether a given string consists only of digits (0-9). This means that the string should not contain any letters, spaces, or special characters.

Example Inputs and Outputs
Input String	Output (True/False)
"123456"	True
"abc123"	False
"09876"	True
"12 34"	False
"1234a5"	False*/
public class script {
    public static boolean containsOnlyDigits(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456";
        System.out.println(containsOnlyDigits(input)); // Output: true

        input = "abc123";
        System.out.println(containsOnlyDigits(input)); // Output: false
    }
}
