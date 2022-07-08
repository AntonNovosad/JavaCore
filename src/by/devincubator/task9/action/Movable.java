package by.devincubator.task9.action;

public interface Movable {
    default void move() {
        System.out.println("movement");
    }
}
