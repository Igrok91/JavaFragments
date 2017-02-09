package java.core.algorithm;

import java.util.Scanner;

/**
 * Created by innopolis on 30.01.2017.
 * Выведите на экран первые 11 членов последовательности Фибоначчи.
 * Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */
public class Фибоначи {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        System.out.println(фибоначи(num));

    }

    private static int фибоначи(int num) {
        int a = 1;
        int b = 1;
        int sum = 0;
        for(int i = 0; i < num; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
        return sum;
    }
}
