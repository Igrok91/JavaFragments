package java.core.part1;

/**
 * Created by innopolis on 13.01.2017.
 * юбой N-мерный массив это одномерный массив, элементами которого являются >>ссылки<< на массивы размерности N-1.
 System.arraycopy копирует как раз эти ссылки.
 */
public class ArrayTest {
    public static void main(String[] args){
        int[][] x  = new int[2][5];
        int[][] y = new int[2][5];
        System.out.println(x[1][3]);
        System.arraycopy(x, 0, y, 0, x.length);
        x[1][3] = 55;
        System.out.println(y[1][3]);
    }
    /*
    0
    55
     */
}
