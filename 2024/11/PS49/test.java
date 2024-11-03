public class test {
    public static void main(String[] args){
        String s = "Hello world";
        int j = 123;
        System.out.printf("%-15s %4d", s, j);
        System.out.printf("\n%15s %04d", s, j);
    }
}
