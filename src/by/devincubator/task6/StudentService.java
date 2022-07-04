package by.devincubator.task6;

import java.util.Scanner;

public class StudentService {
    private final Scanner scanner = new Scanner(System.in);

    public StudentService() {
    }

    public Student[] createStudentArray() {
        System.out.println("Enter number of students: ");
        return new Student[Integer.parseInt(scanner.nextLine())];
    }

    public Student createStudent() {
        String lastName;
        String firstName;
        double gradePointAverage;

        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();

        System.out.println("Enter first name: ");
        firstName = scanner.nextLine();

        do {
            System.out.println("Enter grade point average: ");
            gradePointAverage = Double.parseDouble(scanner.nextLine());
        } while (checkNumber(gradePointAverage));

        return new Student(lastName, firstName, gradePointAverage);
    }

    public void displayStudentWithLowerAverageScore(Student[] array) {
        double averageScore = calculateAverageScore(array);
        System.out.printf("%.2f\n", averageScore);
        for (Student s : array) {
            if (s.getGradePointAverage() < averageScore) {
                System.out.println(s);
            }
        }
    }

    private double calculateAverageScore(Student[] array) {
        double addition = 0;
        for (Student s : array) {
            addition += s.getGradePointAverage();
        }
        double averageScore = addition / array.length;
        return averageScore;
    }

    private boolean checkNumber(double number) {
        return number < 0 || number >= 10;
    }
}
