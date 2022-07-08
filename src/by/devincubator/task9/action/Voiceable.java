package by.devincubator.task9.action;

public interface Voiceable {
    default void voice() {
        System.out.println("voice");
    }
}
