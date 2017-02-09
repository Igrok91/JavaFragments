package java.core.thread;

import java.util.concurrent.Callable;

/**
 * Created by innopolis on 29.01.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Callable<String> t = new CallableTest();
        System.out.println(t.call());
    }
}
