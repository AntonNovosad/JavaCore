package by.devincubator.task3;

import java.util.Scanner;

public class Task3 {
    private static final String HELLO_USER_HOW_ARE_YOU = "Hello, user! How are you?";
    private static final Scanner scanner = new Scanner(System.in);
    private static final TextEditor textEditor = new TextEditor();
    private static String string;

    public static void main(String[] args) {
        append();
        insert();
        delete();
        replace();

        reverseText();
        deleteSpaces();

        findUpperCase("hhh Y m OooO");
        findUpperCase("HellO FrienD");
        findUpperCase("YoU NEveR Be ALONe");
        findUpperCase("New Year Tree");

        upperCase("ahahahah");
        upperCase("hello");
        upperCase("Friends");
        upperCase("Wow");

        fillEmptyArray();

        stringComparison();
    }

    private static void append() {
        textEditor.printMessage(HELLO_USER_HOW_ARE_YOU, "append", "Fine!");
        string = textEditor.append(HELLO_USER_HOW_ARE_YOU, scanner.nextLine());
        System.out.println(string);
    }

    private static void insert() {
        textEditor.printMessage(HELLO_USER_HOW_ARE_YOU, "insert", "dear");
        string = textEditor.insert(HELLO_USER_HOW_ARE_YOU, 5, scanner.nextLine());
        System.out.println(string);
    }

    private static void delete() {
        textEditor.printMessage(HELLO_USER_HOW_ARE_YOU, "delete", "!");
        string = textEditor.delete(HELLO_USER_HOW_ARE_YOU, scanner.nextLine());
        System.out.println(string);
    }

    private static void replace() {
        textEditor.printMessage(HELLO_USER_HOW_ARE_YOU, "replace", "user");
        string = textEditor.replace(HELLO_USER_HOW_ARE_YOU, "user", scanner.nextLine());
        System.out.println(string);
    }

    private static void reverseText() {
        System.out.println("Enter text for reverse: ");
        string = textEditor.reverseText(scanner.nextLine());
        System.out.println(string);
    }

    private static void deleteSpaces() {
        System.out.println("Enter text with spaces: ");
        string = textEditor.deleteSpaces(scanner.nextLine());
        System.out.println(string);
    }

    private static void findUpperCase(String text) {
        System.out.println(textEditor.findUpperCase(text));
    }

    private static void upperCase(String text) {
        System.out.println(textEditor.upperCase(text));
    }

    private static String[] createArray() {
        System.out.println("Enter array size: ");
        int size = Integer.parseInt(scanner.nextLine());
        return new String[size];
    }

    private static void fillEmptyArray() {
        String[] stringArray = createArray();
        System.out.println("Fill array: ");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = textEditor.fillEmpty(scanner.nextLine());
        }
        for (String s : stringArray) {
            System.out.println(s);
        }
    }

    private static void stringComparison() {
        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "C#";
        String str4 = "Java";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str3.equals(str4));

        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1 == str4);

        str1 = "JavaJava";
        System.out.println(str1.substring(4) == str4);

        System.out.println(str1 == null);

        str1 = null;
        System.out.println(str1 == null);
    }
}