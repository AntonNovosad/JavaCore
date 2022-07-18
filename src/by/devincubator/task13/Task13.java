package by.devincubator.task13;

import java.util.List;
import java.util.Scanner;

public class Task13 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Integer INITIAL_CAPACITY = 0;

    public static void main(String[] args) {
        completeTaskWithList(new MyArrayList<>(INITIAL_CAPACITY));
        completeTaskWithList(new MyLinkedList<>());
    }

    private static void completeTaskWithList(List<Integer> list) {
        int size = inputNumber("Enter the number of warriors: ");
        int numberOfEachWarrior = inputNumber("Enter the number of each killed warrior: ");
        speedOfProgram(size, numberOfEachWarrior, list);

    }

    private static void speedOfProgram(int size, int numberOfEachWarrior, List<Integer> list) {
        long time = System.currentTimeMillis();
        List<Integer> circle = fillIntegerList(size, list);
        findWarriors(circle, numberOfEachWarrior);
        System.out.println("answer: " + circle.get(0) + " position");
        System.out.println((System.currentTimeMillis() - time) / 1000 + " sec.");
    }

    private static int inputNumber(String message) {
        int number;
        do {
            System.out.println(message);
            number = scanner.nextInt();
        } while (number < 0);
        return number;
    }

    private static List<Integer> fillIntegerList(int size, List<Integer> circle) {
        for (int i = 1; i <= size; i++) {
            circle.add(i);
        }
        return circle;
    }

    private static void findWarriors(List<Integer> circle, int numberWarrior) {
        int counter = 0;
        do {
            for (int i = 0; i < circle.size(); i++) {
                counter++;
                if (counter == numberWarrior) {
                    circle.set(i, 0);
                    counter = 0;
                }
            }
            deleteZeroElements(circle);
        } while (circle.size() > 1);
    }

    private static void deleteZeroElements(List<Integer> circle) {
        for (int i = 0; i < circle.size(); i++) {
            if (circle.get(i) == 0) {
                circle.remove(i);
            }
        }
    }
}

