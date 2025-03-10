/*Definition:
Two strings are called anagrams if they contain the same characters in the same frequency but in a different order. For example, "listen" and "silent" are anagrams because they both contain the same characters but arranged differently.
*/
import java.util.Arrays;

public class script {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams(str1, str2));
    }
}
/*Output:
sql
Copy
Edit
Are 'listen' and 'silent' anagrams? true

Explanation
Sorting Approach:

Convert the strings into arrays of characters.
Sort both arrays.
If they are equal after sorting, the strings are anagrams.
Time Complexity:

Sorting takes O(n log n) time complexity.
The overall approach is efficient for small to medium-sized strings.
Alternative Approach (Using Frequency Count - More Efficient in Java & JavaScript)
Instead of sorting, we can count the frequency of each character and compare.

Conclusion
An anagram check ensures two words have the same letters in the same frequency but in a different order. The above implementations in Java, JavaScript, and Python provide a simple way to verify this using sorting. However, for better efficiency, a frequency-based approach can be used in cases where performance is a concern.
*/