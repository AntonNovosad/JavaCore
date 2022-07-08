package by.devincubator.task10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task10 {
    private static final String FILE_PATH = "./src/by/devincubator/task10/input.txt";
    private static final String INCORRECT_FILE_PATH = "./input1.txt";
    private static final String EMPTY_FILE_PATH = "./src/by/devincubator/task10/empty.txt";

    public static void main(String[] args) {
        try {
            readFile(INCORRECT_FILE_PATH);
            readFile(FILE_PATH);
            readFile(EMPTY_FILE_PATH);
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }

    private static void readFile(String path) throws EmptyFileException {
        File file = new File(path);
        try (FileInputStream fileInputStream = new FileInputStream(file);
             Scanner scanner = new Scanner(fileInputStream);
        ) {
            String fileLine = scanner.nextLine();
            System.out.printf("'%s' read from file '%s'%n", fileLine, path);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound exception '" + path + "'");
        } catch (IOException e) {
            System.out.println("I/O exception '" + path + "'");
            throw new EmptyFileException("File is empty '" + path + "'", path);
        } catch (NoSuchElementException e) {
            throw new EmptyFileException("File is empty '" + path + "'", e, path);
        } finally {
            System.out.println("finally method for '" + path + "'");
        }
    }
}
