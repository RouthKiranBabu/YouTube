/*Solution-1:
1.
import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.println("Your name: " + name + ".");
        System.out.println("Your age: " + age + ".");
        System.out.println("Your height: " + height + ".");
        scanner.close();
        // Enter your name: routh kirn^W^W dfasf
        // Enter your age: 1313
        // Enter your height: 24243234.24324324234
        // Your name: routh kirn↨↨ dfasf.
        // Your age: 1313.
        // Your height: 2.4243234243243244E7.
    }
}

2.
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();
        String name = scanner.nextLine();
        System.out.println("Your favorate color: " + color + ".");
        System.out.println("Your Name: " + name + ".");
        scanner.close();
        // Blue rouh kiran sdfadf
        // Your favorate color: Blue.
        // Your Name:  rouh kiran sdfadf.
    }
}
*/


