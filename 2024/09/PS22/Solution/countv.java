import java.util.Scanner;
public class countv {
    public int countVowels(String s){
        String vstr = "AEIOUaeiou";
        int c = 0;
        for(int i = 0; i < s.length(); i += 1){
            char ch = s.charAt(i);
            for(int j = 0; j < vstr.length() ; j += 1){
                char chv = vstr.charAt(j);
                if (ch == chv){
                    c += 1;
                }
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        countv cv = new countv();
        int c = cv.countVowels(str);
        System.out.println("Number of vowels: " + c);
    }
}
