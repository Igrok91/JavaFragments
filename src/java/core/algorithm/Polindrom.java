package java.core.algorithm;

/**
 * Created by innopolis on 29.01.2017.
 */
public class Polindrom {
    public static void main(String[] args) {
        String s = "abcgucba";
        boolean t = isPalindromeString(s);
        System.out.println(t);
    }

    private static boolean isPalindromeString(String s) {
        if(s == null){
            return false;
        }
        int length = s.length();
        System.out.println(length);
        for(int i = 0; i < length/2; i++) {
            if(s.charAt(i) != s.charAt(length - i - 1)){
                return false;
            }
        }
        return  true;
    }
}
