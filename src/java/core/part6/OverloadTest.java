package java.core.part6;

/**
 * Created by innopolis on 12.01.2017.
 *  При перегрузке(overloading) методов решение о том какой именно метод будет вызван принимается
 *  на этапе компиляции, в отличие от полиморфизма когда это делается в процессе выполнения.
 1: А теперь рассмотрим OverloadTest.foo(a). Компилятор не знает на какой именно объект типа
 A1 будет ссылаться переменная 'a', компилятор только знает тип переменной 'a', а именно A1.
 Исходя из типа переменной компилятор принимает решение вызвать метод foo(A1 a).
 2: OverloadTest.foo((I1) a). В этом случае компилятор получает явное указание,
 что аргумент имеет тип I1, следовательно будет вызван foo(I1 i).

 Отдельный случай это когда аргумент указан как null, т.е. OverloadTest.foo(null).
 В этом случае будет вызван метод с аргументом имеющим тип наиболее высокий в иерархии, т.е. в данном случае foo(B1 b).
 */
public class OverloadTest {
    static public  void foo(A1 a) { System.out.print("A"); }
    static private void foo(B1 b) { System.out.print("B"); }
    static private void foo(I1 i) { System.out.print("I"); }

    public static void main(String[] args) {
        A1 a = new B1();
        OverloadTest.foo(a);
        OverloadTest.foo((I1) a);
    }
}
class A1 {}

interface I1 {}

class B1 extends A1 implements I1 {}
