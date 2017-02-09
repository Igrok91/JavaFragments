package java.core.part6;

/**
 * Created by innopolis on 12.01.2017.
 */
public class Static extends AB{
    {
        System.out.print("2");
    }

    static {
        System.out.print("6");
    }

    public Static() {
        System.out.print("1");
    }

    public static void main(String[] args) {
        new Static();


    }
}
class AB
{
    {
        System.out.print("5");
    }

    static {
        System.out.print("3");
    }

    public AB() {
        System.out.print("4");
    }
}
