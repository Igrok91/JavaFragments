package java.core.part6;

/**
 * Created by innopolis on 12.01.2017.
 * Результат выражения i++ при i=1 будет все равно 1, так как это постфиксный оператор.
 После выполнения постфиксного оператора, значение i станет равным 2,
 но i пере запишется единицей в результате выполнения оператора присваивания i = i++
 */
public class Number2 {
    public static void main(String[] args) {
        int i = 0;
        i++;
        System.out.print(i);
        i = i++;
        System.out.println(i);
    }
}
