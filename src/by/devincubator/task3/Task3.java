package by.devincubator.task3;

import java.util.Scanner;

public class Task3 {

    private static final String HELLO_USER_HOW_ARE_YOU = "Hello, user! How are you?";

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        String string;
        Scanner scanner = new Scanner(System.in);

        textEditor.printMessage(HELLO_USER_HOW_ARE_YOU, "append", "Fine!");
        string = textEditor.append(HELLO_USER_HOW_ARE_YOU, scanner.nextLine());
        System.out.println(string);

        textEditor.printMessage(HELLO_USER_HOW_ARE_YOU, "insert", "dear");
        string = textEditor.insert(HELLO_USER_HOW_ARE_YOU, 5, scanner.nextLine());
        System.out.println(string);

        textEditor.printMessage(HELLO_USER_HOW_ARE_YOU, "delete", "!");
        string = textEditor.delete(HELLO_USER_HOW_ARE_YOU, scanner.nextLine());
        System.out.println(string);

        textEditor.printMessage(HELLO_USER_HOW_ARE_YOU, "replace", "user");
        string = textEditor.replace(HELLO_USER_HOW_ARE_YOU, "user", scanner.nextLine());
        System.out.println(string);
    }
}
