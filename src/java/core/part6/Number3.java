package java.core.part6;

/**
 * Created by innopolis on 12.01.2017.
 *  Метод A.increment() перекрывается в классе B.
 Поэтому, вне зависимости от типа переменной obj,
 будет вызываться метод, соответствующий реальному типу объекта - т.е. B.increment().
 Этот метод будет использовать переменную i, объявленную в том же классе B и имеющую начальное значение 10.
 Результирующее значение - 11.
 */
public class Number3 extends A {
    int i = 10;
    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        A obj = (A) new Number3();
        System.out.println(obj.increment());
    }
}
class A {
    int i = 0;
    public int increment() {
        return ++i;
    }
}
