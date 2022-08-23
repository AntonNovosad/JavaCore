package by.devincubator.task20;

public class Singleton {
    private int one;
    private int two;
    private int three;
    private static Singleton mySingleton;

    private Singleton() {
        this.one = 1;
        this.two = 2;
        this.three = 3;
    }

    static Singleton instance() {
        Singleton localInstance = mySingleton;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = mySingleton;
                if (localInstance == null) {
                    mySingleton = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }

    @Override
    public String toString() {
        return "MySingleton{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                ", hash=" + hashCode() +
                '}';
    }
}
