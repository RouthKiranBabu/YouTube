/*codePointCount(int beginIndex, int endIndex)
getBytes()
getBytes(String charsetName)
hashCode()
lastIndexOf(int ch)
lastIndexOf(int ch, int fromIndex)
lastIndexOf(String str, int fromIndex)
matches(String regex)
normalize(Normalizer.Form form)
offsetByCodePoints(int index, int codePointOffset)
toLowerCase(Locale locale)
toUpperCase(Locale locale)*/
// Removing the space present at side by side.
public class test{
    public static void main(String[] args){
        String str = "    Hello World   ";
        String subseq = str.trim();
        System.out.println(subseq); // Hello World
    }
}

// Converting everything into uppercase.
public class test{
    public static void main(String[] args){
        String str = "Hello World Hello";
        String subseq = str.toUpperCase();
        System.out.println(subseq); // HELLO WORLD HELLO
    }
}

// Converting everything into lowercase.
public class test{
    public static void main(String[] args){
        String str = "Hello World Hello";
        String subseq = str.toLowerCase();
        System.out.println(subseq); // hello world hello
    }
}

// Getting the substring of the string.
public class test{
    public static void main(String[] args){
        String str = "Hello World Hello";
        String subseq = str.substring(str.indexOf('o'));
        System.out.println(subseq); // o World Hello
        subseq = str.substring(1, 7);
        System.out.println(subseq); // ello W
    }
}

// Getting the subsequence of the string.
public class test{
    public static void main(String[] args){
        String str = "Hello World Hello";
        CharSequence subseq = str.subSequence(6, 12);
        System.out.println(subseq); // World
    }
}

// Check Hi is present at index 9
public class test{
    public static void main(String[] args){
        String str = "Hi world Hi";
        // Second 'Hi' starts from index 9
        if(str.startsWith("Hi", 9)) System.out.println("Yes"); // Yes
    }
}

// Checking if it starts with particular string
public class test{
    public void starts(String tar, String str){
        if (tar.startsWith(str)) System.out.println("Begins with '" + str + "'.");
        else System.out.println("Does not Begins with '" + str + "'.");
    }
    public static void main(String[] args){
        test t1 = new test();
        String str = "Hello world";
        t1.starts(str, "Hello");
        t1.starts(str, "hello");
    }
    /*  Output:
        Begins with 'Hello'.
        Does not Begins with 'hello'.
    */
}

// Limited Spliting string into array.
public class test{
    public static void main(String[] args){
        String str = "apple,banana,orange,grape";
        String[] result = str.split(",", 3);
        System.out.println("Result:");
        for (String s : result) {
            System.out.println(s);
        }
        /*  Result:
            apple
            banana
            orange,grape*/
        String str1 = "apple123banana456orange78grape";
        String[] result1 = str1.split("\\d+", 3);
        System.out.println("Result:");
        for (String s : result1) {
            System.out.println(s);
        }
        /*  Result:
            apple
            banana
            orange78grape*/
    }
}

// Spliting string into array using character or regex.
public class test{
    public static void main(String[] args){
        String str = "Java is fun.";
        String[] strarr = str.split(" ");
        for (String ele: strarr){
            System.out.println(ele);
        }
        /*Output:
        Java
        is
        fun.
        */
        String[] strarr1 = ">a123>b".split("\\d+");
        for (String ele: strarr1){
            System.out.println(ele);
        }
        /*Output:
        >a
        >b
        */
    }
}

//Replacing first repeating word or category into desired String.
public class test{
    public static void main(String[] args){
        String str = "123Java Programming Java324234.";
        String str1 = str.replaceFirst("Java", "Do you like");
        System.out.println(str1); // Do you like Programming Java.
        String str2 = str.replaceFirst("\\d+", "*");
        System.out.println(str2); // *Java Programming Java324234.
    }
}

//Replacing first repeating word into desired String.
public class test{
    public static void main(String[] args){
        String str = "Java Programming Java.";
        String newstr = str.replaceFirst("Java", "Do you like");
        System.out.println(newstr); // Do you like Programming Java.
    }
}

//Replacing category into other character.
public class test{
    public static void main(String[] args){
        String str = "Hello 123   Mic    tEsting.";
        String no_v = str.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(no_v); // H*ll* 123   M*c    t*st*ng.
        String no_n = str.replaceAll("\\d", "*");
        System.out.println(no_n); // Hello ***   Mic    tEsting.
        String no_s = str.replaceAll("\\s", "*");
        System.out.println(no_s); // Hello*123***Mic****tEsting.
        String no_sp = str.replaceAll("\\s+", "*");
        System.out.println(no_sp); // Hello*123*Mic*tEsting.
        String no_dp = str.replaceAll("\\d+", "*");
        System.out.println(no_dp); // Hello *   Mic    tEsting.
    }
}

//Replacing the sub-string in the string with other string
public class test{
    public static void main(String[] args){
        String str = "abbababbaa.";
        String ars = str.replace("ab", "[changed]");
        System.out.println(ars); // [changed]b[changed][changed]baa.
    }
}

//Replacing the char in the string with other char
public class test{
    public static void main(String[] args){
        String str = "abbababbaa.";
        String ars = str.replace("b", "*");
        System.out.println(ars); // a**a*a**aa.
    }
}

//Is both substring of same length but different starting index are same ignoring Cases.
public class test{
    public static void main(String[] args){
        String str1 = "abcefg";
        String str2 = "0ABdEfG";
        /*  true: For ignoring Case
            0: Starting index of "ab" at str1
            1: Starting index of "ab" at str2
            2: Length of "ab"   */
        boolean is_ab = str1.regionMatches(false, 0, str2, 1, 2);
        if(is_ab) System.out.println("Matched: ab.");
        else System.out.println("Not Matched: ab.");
        /*  3: Starting index of "efg" at str1
            4: Starting index of "efg" at str2
            3: Length of "ab"   */
        boolean is_efg = str1.regionMatches(true, 3, str2, 4, 3);
        if(is_efg) System.out.println("Matched: efg.");
    }
    /*Output:
    Not Matched: ab.
    Matched: efg.
    */
}

//Is both substring of same length but different starting index are same.
public class test{
    public static void main(String[] args){
        String str1 = "abcefg";
        String str2 = "0abdefg";
        /*  0: Starting index of "ab" at str1
            1: Starting index of "ab" at str2
            2: Length of "ab"   */
        boolean is_ab = str1.regionMatches(0, str2, 1, 2);
        if(is_ab) System.out.println("Matched: ab.");
        /*  3: Starting index of "efg" at str1
            4: Starting index of "efg" at str2
            3: Length of "ab"   */
        boolean is_efg = str1.regionMatches(3, str2, 4, 3);
        if(is_efg) System.out.println("Matched: efg.");
    }
    /*Output:
    Matched: ab.
    Matched: efg.
    */
}

/*Find last subString index*/
public class test{
    public static void main(String[] args){
        String str = "ab cab";
        int inx = str.lastIndexOf("ab");
        System.out.println(inx); // 4
    }
}

/*To check String is Empty*/
public class test{
    public static void main(String[] args){
        String str = "";
        if(str.isEmpty()) System.out.println("Yes, its Empty"); // Yes, its Empty
    }
}

/*Intern to get the Correct value*/
public class test{
    public static void main(String[] args){
        char[] carr = {'h', 'e', 'l', 'l', 'o'};
        String str1 = new String(carr);
        String str2 = "hello";
        System.out.println(str1 == str2); // false
        System.out.println(str1.intern() == str2); // true
    }
}

/*Checking String equality and Ignoring Case*/
public class test{
    public static void main(String[] args){
        String str1 = "STR1";
        String str2 = "str1";
        if (str1.equalsIgnoreCase(str2)) System.out.println("Both are equal Ignoring Case.");
    }
}

/*Checking String equality and not equality*/
public class test{
    public static void main(String[] args){
        String str1 = "String1";
        String str2 = "String2";
        String str3 = "String1";
        if(str1.equals(str2)) System.out.println("str1 and str2 are equal!");
        else System.out.println("str1 and str2 are not equal!"); // str1 and str2 are not equal!
        if(str1.equals(str3)) System.out.println("str1 and str3 are equal!"); // str1 and str3 are equal!
        else System.out.println("str1 and str3 are not equal!");
    }
}

/*Checking string ends with "ring"*/
public class test{
    public static void main(String[] args){
        String str = "String";
        boolean endswithRing = str.endsWith("ring");
        if (endswithRing) System.out.println("Condition: " + endswithRing); // Condition: true
    }
}

/*From character array into String with conditions:
offset: Starting index to copying
count: length from starting index
*/
public class test{
    public static void main(String[] args){
        char[] strarr = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String str = String.copyValueOf(strarr, 2,4);
        System.out.println(str); // ring
    }
}

// To covert the list of character into single String
public class test{
    public static void main(String[] args){
        char[] strarr = {'s', 't', 'r', '1'};
        String str = String.copyValueOf(strarr);
        System.out.println(str); // str1
    }
}

// To check both the string are equal
public class test{
    public static void main(String[] args){
        String str1 = "aA";
        String str2 = "aA";
        StringBuffer str3 = new StringBuffer("aA");
        boolean condi1 = str1.contentEquals(str2);
        boolean condi2 = str1.contentEquals(str3);
        System.out.println(condi1); // true
        System.out.println(condi2); // true
    }
}

// To check substring is present in main String
public class test{
    public static void main(String[] args){
        String str1 = "aA";
        String str2 = "A";
        boolean condi = str1.contains(str2);
        System.out.println(condi); // true
        if (str1.contains(str2)) System.out.println("Yes, '" + str1 + "' Contains '" + str2 + "'."); // Yes, 'aA' Contains 'A'.
    }
}

// If its equal shows 0 otherwise many be positive or negative number
public class test{
    public static void main(String[] args){
        String str1 = "a";
        String str2 = "A";
        String str3 = "b";
        int c1 = str1.compareToIgnoreCase(str2);
        int c2 = str1.compareTo(str3);
        int c3 = str2.compareTo(str3);
        System.out.println(c1); // 0
        System.out.println(c2); // -1
        System.out.println(c3); // -33
    }
}

// If its equal shows 0 otherwise many be positive or negative number
public class test{
    public static void main(String[] args){
        String str1 = "a";
        String str2 = "a";
        String str3 = "b";
        int c1 = str1.compareTo(str2);
        int c2 = str1.compareTo(str3);
        int c3 = str2.compareTo(str3);
        System.out.println(c1); // 0
        System.out.println(c2); // -1
        System.out.println(c3); // -1
    }
}

// Print the Current and 
public class test{
    public static void main(String[] args){
        String str = "_09azAZ";
        int now;
        int bef;
        String res = new String() + "'";
        for (int i = 1; i < str.length(); i ++){
            now = str.codePointAt(i);
            bef = str.codePointBefore(i);
            res = res.concat("Character -> " + Character.toString(str.charAt(i)) + ", [codePointAt: " + Integer.toString(str.codePointAt(i)) + ", codePointBefore : " + Integer.toString(str.codePointBefore(i)) + "]. ");  
        }
        System.out.println(res + "'"); // 'Character -> 0, [codePointAt: 48, codePointBefore : 95]. Character -> 9, [codePointAt: 57, codePointBefore : 48]. Character -> a, [codePointAt: 97, codePointBefore : 57]. Character -> z, [codePointAt: 122, codePointBefore : 97]. Character -> A, [codePointAt: 65, codePointBefore : 122]. Character -> Z, [codePointAt: 90, codePointBefore : 65]. '
    }
}

public class test{
    public static void main(String[] args){
        String str = "DsdfA1$%@2545dFDA``as";
        String sma = new String();
        String num = new String();
        String lar = new String();
        String oth = new String();
        int cod;
        for(int i = 0; i < str.length(); i ++){
            cod = str.codePointAt(i);
            if (cod >= 48 && cod <= 57) num = num.concat(Character.toString(str.charAt(i)));
            else if (cod >= 97 && cod <= 122) sma = sma.concat(Character.toString(str.charAt(i)));
            else if (cod >= 65 && cod <= 90) lar = lar.concat(Character.toString(str.charAt(i)));
            else oth = oth.concat(Character.toString(str.charAt(i)));
        }
        System.out.println("Given String: " + str);     // Given String: DsdfA1$%@2545dFDA``as
        System.out.println("Numbers: " + num);          // Numbers: 12545
        System.out.println("Small Letters: " + sma);    // Small Letters: sdfdas
        System.out.println("Capital Letters: " + lar);  // Capital Letters: DAFDA
        System.out.println("Other: " + oth);            // Other: $%@``

        str = "09azAZ";
        String res = new String() + "'";
        for (int i = 0; i < str.length(); i++){
            res = res.concat(Character.toString(str.charAt(i)) + " -> " + Integer.toString(str.codePointAt(i)) + ", ");
        }
        System.out.println(res + "'");  // '0 -> 48, 9 -> 57, a -> 97, z -> 122, A -> 65, Z -> 90, '
    }
}

// Seperate the Characters based on the index and store it in String type
public class test{
    public static void main(String[] args){
        String str = "abbabbbaaaaca";
        char[] sr = str.toCharArray();
        String oddixstr = new String();
        String evnixstr = new String();
        for (int i = 0; i < sr.length; i++){
            if (i % 2 == 0){
                evnixstr = evnixstr.concat(Character.toString(str.charAt(i)));
            }else oddixstr = oddixstr.concat(Character.toString(str.charAt(i)));
        }
        System.out.println(oddixstr); // babaac
        System.out.println(evnixstr); // abbbaaa
    }
}

// Print all index of sub-String available in String
public class test{
    public static void main(String[] args){
        String str = "abbabbbaaaaca";
        String sr = "ab";
        int aix = str.indexOf(sr);
        System.out.print("'");
        while(aix >= 0){
            System.out.print(aix + " ");
            aix = str.indexOf(sr, aix + 1);
        }
        System.out.print("'");
    }
    // Output: '0 3 '
}

// Print all index of character available in String
public class test{
    public static void main(String[] args){
        String str = "abbabbbaaaaca";
        char c = 'a';
        int aix = str.indexOf(c);
        System.out.print("'");
        while(aix >= 0){
            System.out.print(aix + " ");
            aix = str.indexOf(c, aix + 1);
        }
        System.out.print("'");
    }
    // Output: '0 3 7 8 9 10 12 '
}

// Reverse a String
public class test{
    public static void main(String[] args){
        String str = "Programming";
        String nstr = "";
        for(int i = str.length() - 1; i > -1; i--){
            nstr = nstr.concat(Character.toString(str.charAt(i)));
        }
        System.out.println(nstr); // gnimmargorP
    }
}

//Count a Specific Character in a String
public class test{
    public static void main(String[] args){
        String str = "Programming";
        char c = 'm';
        int n = 0;
        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == c){
                n += 1;
            }
        }
        System.out.println(c + " appears " + n + " times."); // m appears 2 times.
    }
}