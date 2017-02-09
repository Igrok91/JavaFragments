package java.core.part5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by innopolis on 21.01.2017.
 * Исходное состояние списка: (0:"str1"; 1:"str2"; 2:"str3"), size() = 3
 i = 0 → удаляем элемент "str1" → (0:"str2"; 1:"str3"), size() = 2
 i = 1 → удаляем элемент "str3" → (0:"str2"), size() = 1
 i = 2 → конец цикла, т.к. i > size()
 Ответ: size() = 1
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("str1");
        arrayList.add("str2");
        arrayList.add("str3");

        for (int i = 0; i < arrayList.size(); i++)
            arrayList.remove(i);

        System.out.println(arrayList.size());
    }
    /*
    1
     */
}
