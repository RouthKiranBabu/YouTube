/*Solution-1:
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print(str);
        // Output:
        // Enter the string: hello world
        // hello world
    }
}

Solution-2:
import java.util.Scanner;
import java.text.DecimalFormat;
public class Test {
    public static void main(String[] args){
        DecimalFormat df1 = new DecimalFormat("##,##.000");
        DecimalFormat df2 = new DecimalFormat("###,###.00");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int i = scanner.nextInt();
        System.out.print("Enter the Double: ");
        Float d = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();
        scanner.close();

        String strd1 = df1.format(d);
        String strd2 = df2.format(d);
        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
        System.out.println("Double format(##,##.000): " + strd1);
        System.out.println("Double format(###,###.00): " + strd2);
        System.out.println("String: " + s);
        
        // Output:
        // Enter the integer: 121231
        // Enter the Double: 1312.1414243
        // Enter the string: hello world how are you
        // Integer: 121231
        // Double: 1312.1415
        // Double format(##,##.000): 13,12.141
        // Double format(###,###.00): 1,312.14
        // String: hello world how are you
    }
}

*/