/*
 * This Java program finds all permutations of a given string.
 * It uses recursion to swap characters and generate different permutations.
 * The base case occurs when the left index reaches the string's length.
 */

 import java.util.*;

 class script {
     // Method to generate permutations
     public static void permute(String str, int left, int right, List<String> result) {
         if (left == right) {
             result.add(str);
         } else {
             for (int i = left; i <= right; i++) {
                 str = swap(str, left, i);
                 permute(str, left + 1, right, result);
                 str = swap(str, left, i); // Backtrack to original state
             }
         }
     }
 
     // Helper method to swap characters in a string
     private static String swap(String str, int i, int j) {
         char[] charArray = str.toCharArray();
         char temp = charArray[i];
         charArray[i] = charArray[j];
         charArray[j] = temp;
         return new String(charArray);
     }
 
     public static void main(String[] args) {
         String input = "abc";
         List<String> result = new ArrayList<>();
         
         permute(input, 0, input.length() - 1, result);
 
         // Printing all permutations
         System.out.println("Permutations of " + input + ": " + result);
     }
 }
 
 /*
  * Output:
  * Permutations of abc: [abc, acb, bac, bca, cba, cab]
  *
  * Explanation:
  * - The program generates all possible arrangements of the characters in "abc".
  * - It uses recursion to swap characters and explore different orderings.
  * - The results are stored in a list and printed.
  */
 