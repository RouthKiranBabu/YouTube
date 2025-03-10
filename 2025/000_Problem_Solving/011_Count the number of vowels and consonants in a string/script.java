public class script {
    public static void main(String[] args) {
        String input = "Hello World";
        countVowelsAndConsonants(input);
    }

    public static void countVowelsAndConsonants(String str) {
        str = str.toLowerCase(); // Convert to lowercase for easy comparison
        int vowels = 0, consonants = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if it's a letter
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Input: " + str);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
/*Output
Input: hello world
Vowels: 3
Consonants: 7

Explanation
Convert the input string to lowercase.
Iterate through the string and check if each character is a letter.
If the character is a vowel (a, e, i, o, u), increment the vowel count.
Otherwise, increment the consonant count.
*/