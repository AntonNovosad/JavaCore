package by.devincubator.task6;

public class Student {
    private static int numberOfStudent;
    private String lastName;
    private String firstName;
    private double gradePointAverage;

    public Student(String lastName, String firstName, double gradePointAverage) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gradePointAverage = gradePointAverage;
        numberOfStudent++;
        System.out.println("Default constructor execution - " + numberOfStudent);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + gradePointAverage;
    }
}
