package java.core.part3;

/**
 * Created by innopolis on 12.01.2017.
 * Деление: 4/2 → 2
 Приведение типов: 2 → "2"
 Конкатенация: "4/2=" + "2" → "4/2=2"
 Сравнение: "4/2=2" == "4/2=2" → true
 Всё это происходит на этапе компиляции - в скомпилированном байт-коде строк нет.
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println("4/2=" + 4/2 == "4/2=2");
    }
    /*
    true
     */
}
