/*Problem-1
1.
public class Test{
    public static void main(String[] args){
        System.out.print("Hello, Java"); // Hello, Java
    }
}
2.
import java.util.Scanner;
public class Test{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int n = scanner.nextInt();
        scanner.close();
        if(n%2 != 0){
            System.out.println("Weird");
        }
        else if(n%2 == 0 && n > 1 && n <= 5){
            System.out.println("Not Weird");
        }else if(n%2 == 0 && n > 6 && n <= 20){
            System.out.println("Weird");
        }else if(n%2 == 0 && n > 20){
            System.out.println("Not Weird");
        }
    }
}

Problem-2:
1, 2 and 3.
import java.text.DecimalFormat;
public class Test{    public static void main(String[] args){
        double num = 1234567890.98765546;
        DecimalFormat df1 = new DecimalFormat("##,##.000");
        DecimalFormat df2 = new DecimalFormat("###,###.00");
        DecimalFormat df3 = new DecimalFormat(".0%");
        
        String dfs1 = df1.format(num);
        String dfs2 = df2.format(num);
        String dfs3 = df3.format(num);

        System.out.println(dfs1); // 12,34,56,78,90.988
        System.out.println(dfs2); // 1,234,567,890.99
        System.out.println(dfs3); // 123456789098.8%
    }
}
*/