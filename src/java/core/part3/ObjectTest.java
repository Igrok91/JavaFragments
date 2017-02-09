package java.core.part3;

/**
 * Created by innopolis on 31.01.2017.
 */
public class ObjectTest {
    public static void main(String[] args) {
        //Object o = "1";
        Object o = new String("1");
        Object o2 = "1";
        System.out.println( o.toString().intern() == o2);
    }
}
