package by.devincubator.task12;

import java.util.*;

public class Task12 {

    public static void main(String[] args) {
        System.out.println(checkSameBrackets(inputText()));
    }

    private static boolean checkSameBrackets(String text) {
        char[] charsFromInputText = createCharArray(text);
        List<Character> openBrackets = createListCharacter('[', '{', '<', '(');
        List<Character> closeBrackets = createListCharacter(']', '}', '>', ')');
        Deque<Character> deque = new ArrayDeque<>();
        int arrayIndex;

        for (char c : charsFromInputText) {
            if (openBrackets.contains(c)) {
                deque.add(c);
            } else if (closeBrackets.contains(c)) {
                arrayIndex = closeBrackets.indexOf(c);
                if (openBrackets.get(arrayIndex) != deque.pollLast()) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }

    private static String inputText() {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static char[] createCharArray(String text) {
        return text.toCharArray();
    }

    private static List<Character> createListCharacter(Character... chars) {
        return Arrays.asList(chars);
    }
}