package java.core.part5;

/**
 * Created by innopolis on 21.01.2017.
 * Ссылки в метод передаются по значению и изменять их переназначая на новые объекты нельзя.
 */
public class ReferenceTest {
    private String name;

    ReferenceTest(String name) {
        this.name =  name;
    }

    public void test(ReferenceTest test) {
        test = new ReferenceTest("three");
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        ReferenceTest t1 = new ReferenceTest("one");
        ReferenceTest t2 = new ReferenceTest("two");
        t1.test(t2);
        System.out.println(t2);
    }

}
