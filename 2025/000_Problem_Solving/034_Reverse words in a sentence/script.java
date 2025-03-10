/*Problem Statement:
The task is to reverse the order of words in a given sentence while maintaining the order of characters in each word. For example,
Input: "Hello World from Java"
Output: "Java from World Hello"

We need to implement this in Java, JavaScript, and Python.*/
public class script {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" "); // Split sentence into words
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        
        return reversed.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        String sentence = "I love programming";
        System.out.println(reverseWords(sentence)); // Output: "programming love I"
    }    
}
/*Summary of the Code
Splitting the Sentence:

All three solutions first split the sentence into words using split(" ") in Java and JavaScript, and split() in Python.
Reversing the Order of Words:

In Java, we use a loop to append words in reverse order.
In JavaScript, reverse() method is applied to the array.
In Python, slicing [::-1] is used to reverse the list.
Joining the Words:

The reversed words are joined back into a sentence using join() in JavaScript and Python.
Java uses StringBuilder to efficiently construct the reversed sentence.
Each approach efficiently reverses the words in a sentence while maintaining a clean and concise implementation.*/