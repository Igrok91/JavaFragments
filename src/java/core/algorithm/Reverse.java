package java.core.algorithm;

/**
 * Created by innopolis on 29.01.2017.
 */
public class Reverse {
    public static void main(String[] args) {
        String s = "success";
        String reverse = reverse(s);
        System.out.println(reverse);
    }

    private static String reverse(String s) {
        StringBuilder reverse = new StringBuilder();
        int length = s.length();
        for(int i = 0; i < length; i ++) {
            reverse.append(s.charAt(length - i - 1));
        }
        return reverse.toString();
    }
}
