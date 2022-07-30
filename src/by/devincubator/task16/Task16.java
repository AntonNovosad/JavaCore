package by.devincubator.task16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task16 {
    public static void main(String[] args) {
        List<String> list = createList();
        List<People> peopleList = createPeopleList();

        countOfA1(list);
        findFirstOrElseElementFromCollection(list);
        returnThirdElement(list);
        returnTwoElements(list);
        selectAllElementsByTemplate(list);
        elementIsExist(list);
        checkElement(list);
        deleteFirstElementAndReturnArrayInt(list);
        mergedRow(list);
        sortByAlphabetically(list);

        findMenByAge(peopleList);
        findAverageAgeOfMen(peopleList);
        findAbleBodiedPeople(peopleList);
        findPeopleByMinAge(peopleList);
        sortPeopleByGenderAndAge(peopleList);
    }

    private static List<String> createList() {
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a1");
        return list;
    }

    private static List<People> createPeopleList() {
        return Arrays.asList(new People("Basil", 16, Sex.MAN),
                new People("Peter", 23, Sex.MAN),
                new People("Helen", 42, Sex.WOMAN),
                new People("Ivan", 69, Sex.MAN));
    }

    private static void countOfA1(List<String> list) {
        System.out.println("Count of a1 = " + list
                .stream()
                .filter(s -> s.equals("a1"))
                .count());
    }

    private static void findFirstOrElseElementFromCollection(List<String> list) {
        System.out.println("First element: " + list
                .stream()
                .findFirst()
                .orElse("0"));
    }

    private static void returnThirdElement(List<String> list) {
        System.out.println("Third element: " + list
                .stream()
                .filter(s -> s.equals("a3"))
                .findFirst()
                .get());
    }

    private static void returnTwoElements(List<String> list) {
        System.out.println("Two elements: " + Arrays.toString(list
                .stream()
                .skip(1)
                .limit(2)
                .toArray()));
    }

    private static void selectAllElementsByTemplate(List<String> list) {
        System.out.println("Elements by template: " + list
                .stream()
                .filter(s -> s.equals("a1"))
                .collect(Collectors.toList()));
    }

    private static void elementIsExist(List<String> list) {
        System.out.println("Element a1 is exist: " + list
                .stream()
                .anyMatch(s -> s.equals("a1")));
    }

    private static void checkElement(List<String> list) {
        System.out.println("Element a7 is not exist: " + list
                .stream()
                .noneMatch(s -> s.equals("a7")));
    }

    private static void deleteFirstElementAndReturnArrayInt(List<String> list) {
        System.out.println("Array int: " + Arrays.toString(list
                .stream()
                .mapToInt((s) -> Integer.parseInt(s.substring(1)))
                .toArray()));
    }

    private static void mergedRow(List<String> list) {
        System.out.println("Merge row: " + list
                .stream()
                .reduce((s, s2) -> s + s2)
                .get());
    }

    private static void sortByAlphabetically(List<String> list) {
        System.out.println("Sort by alphabetically: " + list
                .stream()
                .sorted()
                .collect(Collectors.toList()));
    }

    private static void findMenByAge(List<People> peopleList) {
        System.out.println("Men 18-27 years old: " + peopleList
                .stream()
                .filter(people -> people.getSex().equals(Sex.MAN) && people.getAge() >= 18 && people.getAge() <= 27)
                .collect(Collectors.toList()));
    }

    private static void findAverageAgeOfMen(List<People> peopleList) {
        System.out.println("Average age of men =" + peopleList
                .stream()
                .filter(people -> people.getSex().equals(Sex.MAN))
                .mapToInt(people -> people.getAge())
                .average()
                .getAsDouble());
    }

    private static void findAbleBodiedPeople(List<People> peopleList) {
        System.out.println("Able-bodied people: " + peopleList
                .stream()
                .filter((people) -> people.getAge() >= 18)
                .filter((people) -> (people.getSex().equals(Sex.WOMAN) && people.getAge() < 55) || (people.getSex().equals(Sex.MAN) && people.getAge() < 60))
                .count());
    }

    private static void findPeopleByMinAge(List<People> peopleList) {
        System.out.println("People with min age: " + peopleList
                .stream()
                .min((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()))
                .get());
    }

    private static void sortPeopleByGenderAndAge(List<People> peopleList) {
        System.out.println(peopleList.stream()
                .sorted((o1, o2) -> {
                    if (o1.getSex() != o2.getSex()) {
                        return o1.getSex().compareTo(o2.getSex());
                    } else {
                        return Integer.compare(o1.getAge(), o2.getAge());
                    }
                })
                .collect(Collectors.toList()));
    }
}
