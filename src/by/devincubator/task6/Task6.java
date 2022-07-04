package by.devincubator.task6;

public class Task6 {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student[] arrayStudent = studentService.createStudentArray();
        for (int i = 0; i < arrayStudent.length; i++) {
            arrayStudent[i] = studentService.createStudent();
        }
        studentService.displayStudentWithLowerAverageScore(arrayStudent);
    }
}
