package java.core.part2;

/**
 * Created by innopolis on 15.01.2017.
 * Инициализация всех статических полей и блоки статической инициализации выполняются друг за другом,
 * в том порядке, в котором они записаны.
 Поэтому в классе A поле i будет иметь значение 1, а в классе B — 2.
 */
public class StaticTest {
    public static void main(String[] args) {
        System.out.print(A.i);
        System.out.print(B.i);
    }

}
class A {
    static {
        i = 2;
    }
    static int i = 1;
};

class B {
    static int i = 1;

    static {
        i = 2;
    }
}
