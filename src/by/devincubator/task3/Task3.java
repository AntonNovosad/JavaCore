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

        string = textEditor.reverseText(scanner.nextLine());
        System.out.println(string);

        string = textEditor.deleteSpaces(scanner.nextLine());
        System.out.println(string);

        System.out.println(textEditor.findUpperCase("hhh Y m OooO"));
        System.out.println(textEditor.findUpperCase("HellO FrienD"));
        System.out.println(textEditor.findUpperCase("YoU NEveR Be ALONe"));
        System.out.println(textEditor.findUpperCase("New Year Tree"));

        System.out.println(textEditor.upperCase("ahahahah"));
        System.out.println(textEditor.upperCase("hello"));
        System.out.println(textEditor.upperCase("Friends"));
        System.out.println(textEditor.upperCase("Wow"));

        System.out.println("Enter array size");
        int size = Integer.parseInt(scanner.nextLine());
        String[] stringArray = new String[size];
        System.out.println("Fill array");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = textEditor.fillEmpty(scanner.nextLine());
        }
        for (String s : stringArray) {
            System.out.println(s);
        }

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