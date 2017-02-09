package java.core.algorithm;

import java.util.Scanner;

/**
 * Created by innopolis on 30.01.2017.
 * Факториа́л числа n (лат. factorialis — действующий, производящий, умножающий; обозначается n!, произносится эн факториа́л) —
 * произведение всех натуральных чисел от 1 до n включительно:
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        System.out.println(factorial(num));

    }

    private static int factorial(int num) {
            if(num == 1)return 1;
            return factorial(num-1) * num;
    }
}
