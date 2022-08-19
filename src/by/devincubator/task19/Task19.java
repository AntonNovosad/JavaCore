package by.devincubator.task19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task19 {
    public static void main(String[] args) {
        runnable();
        thread();
        anonymous();
        callable();
        System.out.println("Main завершился");
    }

    private static void thread() {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
    }

    private static void runnable() {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }

    private static void anonymous() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Поток Anonymous запущен");
                System.out.println("Поток Anonymous завершился");
            }
        };
        thread.start();
    }

    private static void callable() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        MyCallable myCallable = new MyCallable();
        Future<String> future = executorService.submit(myCallable);
        executorService.shutdown();
    }
}
