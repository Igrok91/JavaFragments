package java.core.part4;

/**
 * Created by innopolis on 26.01.2017.
 * В качестве аргумента при вызове конструктора
 * суперкласса нельзя передавать нестатические поля класса, результат выполнения нестатического метода или ссылку this.
 */
public class ConstructorTest extends Base {
    private  String Str = "Constructor";

    public ConstructorTest() {
       // super(Str);
        System.out.println("Sub " + Str);
    }

    public static void main(String...args) {
        Base B = new ConstructorTest();
    }
}
class Base {
    public Base(){

    }
    static {
        System.out.println("Static");
    }
    public Base(String s) {
        System.out.println("Base " + s);
    }
}
