package by.devincubator.task15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Task15 {
    private static final Integer[] ARRAY_INTEGER = {12, 42, 54, 76, 989, 324, 657, 2, 23, 234};

    public static void main(String[] args) {
        Filter<Integer> integerFilter = integer -> integer > 100;
        Integer[] filterTestArray = filterTest(ARRAY_INTEGER, integerFilter);
        displayArray(filterTestArray);

        Predicate<Integer> predicateFilter = integer -> integer > 100;
        Integer[] predicateTestArray = filterTest(ARRAY_INTEGER, predicateFilter::test);
        displayArray(predicateTestArray);

        Function<Integer, Integer> function = integer -> integer * integer;
        Integer[] functionTestArray = fill(ARRAY_INTEGER, function);
        displayArray(functionTestArray);

        Converter<Dog, Cat> converter = dog -> new Cat(dog.getName(), dog.getAge(), dog.getWeight());
        Dog dog = new Dog("jack", 2, 10);
        Cat cat = converter.convert(dog);
        System.out.println(cat);

        Predicate<Integer> integerPredicate = integer -> integer % 2 == 0;
        System.out.println(integerPredicate.test(1));
        System.out.println(integerPredicate.test(2));

        Consumer<String> consumer = s -> System.out.println("Hello, " + s);
        greeting(consumer, "Alex");

        List<String> nameList = createList();
        Supplier<Integer> supplier = () -> {
            return (int) (Math.random() * nameList.size());
        };
        randomName(supplier, nameList);

        Function<String, Integer> stringIntegerFunction = s -> Integer.parseInt(s);
        System.out.println("Converter: " + stringToIntConverter("8", stringIntegerFunction));

        UnaryOperator<Integer> unaryOperator = integer -> (int) Math.pow(integer, 2);
        System.out.println(squareNumber(8, unaryOperator));
    }

    private static Integer[] createArray(Integer[] array, int count, Integer integer) {
        array = Arrays.copyOf(array, count);
        array[array.length - 1] = integer;
        return array;
    }

    private static List<String> createList() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("John");
        nameList.add("Alex");
        nameList.add("Jim");
        nameList.add("Sara");
        return nameList;
    }

    private static <T> boolean filter(T element, Filter<T> filter) {
        return filter.apply(element);
    }

    private static Integer[] filterTest(Integer[] array, Filter<Integer> filter) {
        int count = 0;
        Integer[] newArray = new Integer[count];
        for (Integer integer : array) {
            if (filter(integer, filter)) {
                count++;
                newArray = createArray(newArray, count, integer);
            }
        }
        return newArray;
    }

    private static Integer[] fill(Integer[] array, Function<Integer, Integer> function) {
        for (int i = 0; i < array.length; i++) {
            array[i] = function.apply(array[i]);
        }
        return array;
    }

    private static void greeting(Consumer<String> consumer, String string) {
        consumer.accept(string);
    }

    private static void randomName(Supplier<Integer> supplier, List<String> list) {
        System.out.println(list.get(supplier.get()));
    }

    private static int stringToIntConverter(String string, Function<String, Integer> function) {
        return function.apply(string);
    }

    private static int squareNumber(Integer integer, UnaryOperator<Integer> unaryOperator) {
        return unaryOperator.apply(integer);
    }

    private static void displayArray(Integer[] array) {
        for (Integer integer : array) {
            System.out.print(integer + ",");
        }
        System.out.println();
    }
}
