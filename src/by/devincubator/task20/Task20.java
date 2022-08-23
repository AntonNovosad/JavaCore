package by.devincubator.task20;

public class Task20 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(Singleton.instance());

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread.start();
        thread2.start();
        thread3.start();
    }
}
