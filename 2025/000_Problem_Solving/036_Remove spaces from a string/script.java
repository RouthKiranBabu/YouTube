/*Problem Statement:
Given a string, the task is to remove all spaces (whitespace characters) from it. The input string may contain multiple spaces between words, leading or trailing spaces. The goal is to return a new string without any spaces.

Example:
Input:
arduino
Copy
Edit
"Hello World, Welcome to Programming!"
Output:
arduino
Copy
Edit
"HelloWorld,WelcometoProgramming!"*/
public class script {
    public static void main(String[] args) {
        String input = "Hello World, Welcome to Programming!";
        String output = input.replaceAll("\\s", ""); // Remove all spaces
        System.out.println("Output: " + output);
    }
}
/*Explanation:
We use replaceAll("\\s", "") where \s is a regex pattern that matches all whitespace characters.
The replaceAll() method replaces all occurrences of spaces with an empty string.
Finally, we print the modified string.*/