package java.core.part6;

/**
 * Created by innopolis on 12.01.2017.
 * Ключевы слова case и default могут идти в любом порядке.
 * Если не использовать ключевое слово break, то программа будет идти на следующий по порядку case.
 */
public class Switch {
    public static void main(String[] args) {
        int i = 3;
        switch(i) {
            default:
                System.out.println("default");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }
    }
    /*
     default
1
2
     */
}
