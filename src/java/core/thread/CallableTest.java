package java.core.thread;

import java.util.concurrent.Callable;

/**
 * Created by innopolis on 29.01.2017.
 */
public class CallableTest implements Callable<String>{
    @Override
    public String call() throws Exception {
        return "succes";
    }
}
