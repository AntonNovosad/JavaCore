package by.devincubator.task18;

public class Task18 {
    public static void main(String[] args) {
        Apple apple = ObjectFactory.create(Apple.class);

        Initializer.initializer(apple, "weight", 15);
        Initializer.initializer(apple, "color", "red");

        displayClass(apple);

        BadInitializer.initializer(apple, "weight", 10);
        BadInitializer.initializer(apple, "color", "yellow");

        displayClass(apple);
    }

    private static void displayClass(Apple apple) {
        System.out.println(apple.getWeight());
        System.out.println(apple.getColor());
    }
}
