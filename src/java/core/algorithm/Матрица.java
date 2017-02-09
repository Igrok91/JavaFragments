package java.core.algorithm;

/**
 * Created by innopolis on 30.01.2017.
 * Вычислить  сумму чисел диагонали матрицы
 */
public class Матрица {
    public static void main(String[] args) {
        int[][] a = {{ 1, 2, 3 },
                    {  4, 5, 6 },
                    {  7, 8, 9 }};

        int s = 0;
        System.out.println(a[2][1]);

        for(int i = 0 ; i < a.length; i++) {
            for(int j = 0; j < a.length; j++){
                if(i == j){
                    s += a[i][j];
                }
            }
        }
        System.out.println(s);
    }
}
