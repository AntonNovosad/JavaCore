package by.devincubator.task9.action;

public interface Starveble {
    default void isHungry() {
        System.out.println("not hungry");
    }
}
