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