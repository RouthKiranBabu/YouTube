public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println("Reversed: " + reversed); // Output: dlroW olleH
    }




public class script {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed); // Output: "olleh"
    }
}

public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // Output: "olleh"
    }
}
