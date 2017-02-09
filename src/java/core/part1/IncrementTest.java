package java.core.part1;

/**
 * Created by innopolis on 02.02.2017.
 */
public class IncrementTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a* a++;
        System.out.println(b);
        System.out.println(a);
    }
}
