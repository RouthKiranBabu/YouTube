public class script {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed); // Output: "olleh"
    }
}

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
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
