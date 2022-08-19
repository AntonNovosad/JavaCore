package by.devincubator.task19;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Поток Thread запустился");
        System.out.println("Поток Thread закончил свою работу");
    }
}
