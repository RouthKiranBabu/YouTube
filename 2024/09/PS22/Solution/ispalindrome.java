import java.util.Scanner;
public class ispalindrome{
    public String reverseString(String str){
        char[] newstr = new char[str.length()];
        int j = 0;
        for(int i = str.length() - 1; i > -1; i --){
            newstr[j] = str.charAt(i);
            j += 1;
        }
        String news = new String(newstr);
        return news;
    }
    public Boolean isPalindrome(String str){
        ispalindrome isp = new ispalindrome();
        String news = isp.reverseString(str);
        if(str.equals(news)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        ispalindrome isp = new ispalindrome();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        boolean condition = isp.isPalindrome(str);
        //System.out.println(str + "\n" + news);
        if(condition){
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is not a palindrome.");
        }
    }
}