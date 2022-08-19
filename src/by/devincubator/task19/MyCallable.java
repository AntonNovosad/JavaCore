package by.devincubator.task19;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Поток Callable начался");
        System.out.println("Поток Callable завершился");
        return null;
    }
}
