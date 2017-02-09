package java.core.part3;

/**
 * Created by innopolis on 16.01.2017.
 * Число 128 имеет двоичное представление 00000000 00000000 00000000 10000000.
 После преобразования в byte получается 10000000 – но в типе byte это двоичное представление соответствует числу –128.
 –(–128) даёт 128, а 128>>>1 разумеется будет равно 128>>>1.
 */
public class ByteTest2 {
    public static void main(String args[]){
        System.out.println((-(byte)128)>>>1 == 128 >>> 1);
    }
}
