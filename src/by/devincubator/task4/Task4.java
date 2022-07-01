package by.devincubator.task4;

import java.util.Scanner;

public class Task4 {

    private static final String IS_A_WEEKEND = " is a weekend";
    private static final String IS_NOT_A_WEEKEND = " is not a weekend";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Weekdays[] weekdays = createWeekdayArray();
        findDay(weekdays, scanner.nextInt());
    }

    private static Weekdays[] createWeekdayArray() {
        return Weekdays.values();
    }

    private static void findDay(Weekdays[] array, int number) {
        if (checkDay(number) && checkWeekend(number)) {
            System.out.println(array[number - 1] + printAbbreviatedName(number) + IS_A_WEEKEND);
        } else if (checkDay(number) && !checkWeekend(number)) {
            System.out.println(array[number - 1] + printAbbreviatedName(number) + IS_NOT_A_WEEKEND);
        } else {
            System.out.println(number);
        }
    }

    private static boolean checkDay(int number) {
        return number > 0 && number < 8;
    }

    private static boolean checkWeekend(int number) {
        return number > 5 && number < 8;
    }

    private static AbbreviatedName[] createAbbreviatedArray() {
        return AbbreviatedName.values();
    }

    private static String printAbbreviatedName(int number) {
        AbbreviatedName[] array = createAbbreviatedArray();
        return " (" + array[number - 1] + ")";
    }
}