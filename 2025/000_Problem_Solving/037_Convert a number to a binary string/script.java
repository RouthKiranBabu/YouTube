/*
Problem Statement
We need to convert a given number into its binary string representation in Java, JavaScript, and Python. The binary representation of a number consists of only 0s and 1s, which represent powers of 2.

Example Input & Output:
Input:
plaintext
Copy
Edit
Number: 10
Output:
plaintext
Copy
Edit
Binary String: "1010"
*/
public class script {
    public static void main(String[] args) {
        int number = 10; // Example input
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary String: " + binaryString);
    }
}
/*Summary
Language	Method Used	Key Function
Java	Integer.toBinaryString()	Converts an integer to binary directly.
JavaScript	.toString(2)	Converts a number to a string in base-2.
Python	bin(number)[2:]	Converts a number to binary and removes the 0b prefix.
Each implementation effectively converts an integer to its binary representation. The Java method is built-in and simple, JavaScript allows specifying the base in .toString(), and Python requires slicing to remove the 0b prefix.*/