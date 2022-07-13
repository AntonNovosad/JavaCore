package by.devincubator.task11;

import java.util.Arrays;
import java.util.Comparator;

public class Task11 {
    public static void main(String[] args) {
        Person[] persons = createArray();
        displayArray("Created array: ", persons);

        System.out.println();
        Arrays.sort(persons);
        displayArray("Sort with comparable by name: ", persons);

        System.out.println();
        sortPersonsWithAnonymousClass(persons);
        displayArray("Sort with comparator by age: ", persons);
    }

    private static Person[] createArray() {
        Person[] persons = new Person[6];
        persons[0] = new Person("Anton", 22);
        persons[1] = new Person("Alex", 25);
        persons[2] = new Person("Nick", 17);
        persons[3] = new Person("Anton", 44);
        persons[4] = new Person("John", 44);
        persons[5] = new Person("Max", 30);
        return persons;
    }

    private static void displayArray(String str, Person[] array) {
        System.out.println(str);
        for (Person p : array) {
            System.out.println(p);
        }
    }

    private static void sortPersonsWithAnonymousClass(Person[] array) {
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int res = Integer.compare(o1.getAge(), o2.getAge());
                return res == 0 ? o1.getName().compareTo(o2.getName()) : res;
            }
        };
        Arrays.sort(array, comparator);
    }
}
