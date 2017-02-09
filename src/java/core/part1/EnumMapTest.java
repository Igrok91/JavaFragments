package java.core.part1;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by innopolis on 13.01.2017.
 * В коллекции EnumMap имеется параметризованный конструктор, который задаёт используемый тип элементов перечисления.
 Этот тип сохраняется в экземпляре коллекции, и используется для контроля значения ключа во время работы программы:
 */
public class EnumMapTest {
    static Integer value;
    public static void main(String args[]) {
        Map<Types, Integer> m = new EnumMap<Types, Integer>(Types.class);
        m.put(Types.A, value);
        System.out.println(m);
    }
    enum Types { A, B, C }
    /*
    {A=null}
     */
}
