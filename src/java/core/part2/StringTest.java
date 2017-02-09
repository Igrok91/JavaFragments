package java.core.part2;

/**
 * Created by innopolis on 15.01.2017.
 * s.concat() не изменит значения s, так как String это
 * "immutable"(неизменяемый) объект, в отличии от StringBuffer, который реализует изменяемые строки
 */
public class StringTest {
    public static void main(String[] args) {
        String s = new String("ssssss");
        StringBuffer sb = new StringBuffer("bbbbbb");
        s.concat("-aaa");
        sb.append("-aaa");
        System.out.println(s);
        System.out.println(sb);
    }
    /*
    ssssss
bbbbbb-aaa
     */
}
