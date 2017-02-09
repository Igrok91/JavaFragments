package java.core.part5;

/**
 * Created by innopolis on 18.01.2017.
 */
public class DoubleTest {
    public static void main(String[] args) {
        Double d =  1d;
        Double d1 = 1d;
        System.out.println(d == d1);
        double d2 = 1;
        double d3 = 1d;
        System.out.println(d2 == d3);
        Integer i = 127;
        Integer i2 = 127;
        System.out.println(i == i2);
        Byte b = 127;
        Byte b1 = 127;
        System.out.println(b == b1);
        java.lang.Float f = java.lang.Float.valueOf(1f);
        java.lang.Float f2 = 1f;
        java.lang.Float f3 = 1f;
        System.out.println(f == f2);
        System.out.println(f2 == f3);

    }
    /*
    false
    true
    true
    true
     */
}
