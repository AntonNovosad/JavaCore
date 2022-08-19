package by.devincubator.task19;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Поток Runnable запустился");
        System.out.println("Поток Runnable закончил свою работу");
    }
}
