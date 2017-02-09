package java.core.part1;

/**
 * Created by innopolis on 13.01.2017.
 * Инициализация статических полей осуществляется в том порядке, в котором они записаны.
 В этом примере первым будет проинициализировано поле instance, а уже затем - BASE.
 Поэтому в момент вызова конструктора Tasks() поле BASE ещё содержит 0.
 Поле DELTA является переменной-константой, поэтому компилятор сразу подставляет в выражение вместо DELTA его значение.
 В итоге получаем: x = 0 + 5;
 */
public class Tasks {
    public static Tasks instance = new Tasks();
    private static final int DELTA = 5;
    private static int BASE = 7;
    private int x;

    public Tasks() {
        x = BASE + DELTA;
    }
    public static int getBASE() {
        return BASE;
    }
    public static void main(String[] args) {
        System.out.println(Tasks.instance.x);
    }
}
