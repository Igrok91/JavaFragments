package java.core.part6;

/**
 * Created by innopolis on 12.01.2017.
 * если при создании объекта класса Boolean используется конструктор со строковым параметром,
 *то объект будет содержать значение true (истина) тогда и только тогда, когда строка-параметр
 * совпадает с "true" (без учёта регистра). Т.е. Boolean("true") и Boolean("tRuE") дадут true, а Boolean("test") - даст false.
 */
public class Number1 {
    public static void main(String [] str) {
        Boolean b1 = new Boolean("true");
        System.out.println(b1);
        b1 = new Boolean("tRuE");
        System.out.println(b1);
        b1 = new Boolean("test");
        System.out.println(b1);
        b1 = new Boolean(true);
        System.out.println(b1);
        b1 = true;
        System.out.println(b1);
    }
    /*
true
true
false
true
true
     */
}
