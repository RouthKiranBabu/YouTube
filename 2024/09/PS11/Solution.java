/*
Problem-1:
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            String s = scanner.next();
            int j = scanner.nextInt();
            System.out.printf("%-15s%4d%n", s, j);
            System.out.printf("%15s%04d%n", s, j);
        }
        scanner.close();
    }
}

Problem-2:
import java.text.DecimalFormat;
public class Test {
    public static void main(String[] args){
        double d1 = 0.85;
        double d2 = 123.4;
        DecimalFormat df1 = new DecimalFormat("##%");
        DecimalFormat df2 = new DecimalFormat("000000.00");
        String s1 = df1.format(d1);
        String s2 = df2.format(d2);
        System.out.println(s1); // 85%
        System.out.println(s2); // 000123.40
    }
}

*/