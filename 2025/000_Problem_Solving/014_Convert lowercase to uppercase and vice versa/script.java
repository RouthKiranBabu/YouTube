public class CaseFlipper {
    public static String toggleCase(String str) {
        char[] chars = str.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            // Check if the character is an English letter
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                chars[i] ^= 32; // Flips between uppercase and lowercase
            }
        }
        
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Hello World! 123";
        String result = toggleCase(input);
        System.out.println(result); // Outputs: hELLO wORLD! 123
    }
}

public class script {
    public static void main(String[] args) {
        String input = "Hello WoRLd";
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Keep non-alphabet characters as they are
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
/*Example Execution
Input:
nginx
Copy
Edit
Hello WoRLd
Output:
nginx
Copy
Edit
hELLO wOrlD
Explanation:
Each character is checked.
If it's uppercase, convert to lowercase.
If it's lowercase, convert to uppercase.
Other characters remain unchanged.*/
