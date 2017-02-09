package java.core.part4;

/**
 * Created by innopolis on 26.01.2017.
 * Метод printX выводит на экран значение переменной Parent.x,
 * а не Child.x, вот если бы этот метод был переопределен в классе Child, тогда бы он вывел "-1"
 */
public class ShadowingTest extends Parent{
    int x = -1;
    public static void main(String... args) {
        new ShadowingTest().printX();
    }
}

class Parent {
    int x = 0;
    public void printX() {
        System.out.println(x);
    }
}