package java.core.part6;

/**
 * Created by innopolis on 12.01.2017.
 *  Согласно JLS порядок инициализации объекта следующий:
 1. Инициализация static полей во время загрузки класса
 2. Инициализация суперкласса
 3. Инициализация полей в порядке очередности перед вызовом любого конструктора класса
 4. Конструктор класса
 */
public class Number4 extends C{
    private D objA = new D();
    private static B objB = new B();

    public Number4() { System.out.print("D"); }

    public static void main(String[] args){
        new Number4();
    }
}
class D {
    public D() { System.out.print("A"); }
}
class B {
    public B() { System.out.print("B"); }
}
class C {
    public C() { System.out.print("C"); }
}
