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
}
