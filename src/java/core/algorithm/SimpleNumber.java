package java.core.algorithm;

import java.util.Scanner;

/**
 * Created by innopolis on 30.01.2017.
 */
public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        System.out.println(isSimpleNumber(num));

    }

    private static String isSimpleNumber(int num) {
        String result = null;
        if(num <= 1) result =  "Число единица";
        if(num == 2 || num == 3) result = "Число простое";
        else{
            for(int i = 2; i*i < num; i++){
                if(num % i == 0){
                    result =  "Число не простое";
                    break;
                } else {
                    result =  "Число простое";
                }
            }
        }
        return result;

    }
}
