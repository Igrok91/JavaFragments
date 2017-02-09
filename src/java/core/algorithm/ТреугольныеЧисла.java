package java.core.algorithm;

import java.util.Scanner;

/**
 * Created by innopolis on 30.01.2017.
 */
public class ТреугольныеЧисла {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        System.out.println(треугольноеЧисло(num));

    }

    private static int треугольноеЧисло(int num) {
        if (num == 1) return 1;
        return треугольноеЧисло(num -1) + num;
    }
}
