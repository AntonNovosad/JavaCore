package by.devincubator.task7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task7 {
    private Task7 task7 = new Task7();

    public static void main(String[] args) {
        try {
            stackOverFlowRecursion(5);
            stackOverFlowWithObject();
            outOfMemoryList();
            outOfMemoryPermGenSpace();
        } catch (StackOverflowError | OutOfMemoryError e) {
            e.getMessage();
        }
    }

    private static void stackOverFlowRecursion(int i) {
        stackOverFlowRecursion(i);
        System.out.print(i);
    }

    private static void outOfMemoryList() {
        List<Object> list = new LinkedList<>();
        do {
            list.add(new Object[1000]);
        } while (true);
    }

    private static void outOfMemoryPermGenSpace() {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }

    private static void stackOverFlowWithObject() {
        Task7 task7 = new Task7();
    }
}
