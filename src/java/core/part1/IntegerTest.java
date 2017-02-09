package java.core.part1;

/**
 * Created by innopolis on 13.01.2017.
 * При преобразовании значения 1000 в объект-оболочку каждый раз создаётся новый экземпляр Integer.
 * Поэтому в первом сравнении получаем false.

 Если в операции == сравниваются примитивы и объекты-оболочки, то объекты-оболочки преобразовываются в
 примитивы. Поэтому во втором сравнении получаем true.
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1 == i2);
        System.out.println(i1 == 1000);
    }
}
