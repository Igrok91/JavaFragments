package java.core.part2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by innopolis on 15.01.2017.
 * Метод Arrays.asList() возвращает неизменяемый список – т.е.
 * список, в который нельзя добавить или из которого нельзя удалить элементы.
 Для этого используется внутренняя реализация списка, в которой методы для
 добавления или удаления элементов выбрасывают UnsupportedOperationException:
 */
public class ListTest {
    public static void main(String[] args) {
        String[] str = new String[] { "1", "2", "3" };

        List list = Arrays.asList(str);
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Object object = (Object) iterator.next();
            iterator.remove();
        }
        System.out.println(list.size());
    }
}
