package by.devincubator.task3;

public class TextEditor {

    public void printMessage(String text, String addition, String word) {
        System.out.format("'%s' %s '%s'\n", text, addition, word);
    }

    public String append(String text, String input) {
        return text + input;
    }

    public String insert(String text, int position, String input) {
        return text.substring(0, position - 1) + input + text.substring(position - 1);
    }

    public String delete(String text, String input) {
        return text.substring(0, text.indexOf(input)) + text.substring(text.indexOf(input) + input.length());
    }

    public String replace(String text, String word, String input) {
        String first = text.substring(0, text.indexOf(word));
        String second = text.substring(text.indexOf(word) + word.length());
        return first + input + second;
    }

    public String reverseText(String text) {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return reverse;
    }

    public String deleteSpaces(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                newText += text.charAt(i);
            }
        }
        return newText;
    }

    public String findUpperCase(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                stringBuilder.append(text.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public String upperCase(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length() - 1; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(text.charAt(i + 1));
            }
        }
        return stringBuilder.toString().toUpperCase();
    }

    public String fillEmpty(String string) {
        return (string.equals("") ? "String is empty" : string);
    }
}
