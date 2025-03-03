import java.util.*;

class Student implements Comparable<Student> {
    private int studentId;
    private String name;
    private double gpa;

    // Constructor
    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Implementing Comparable
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa); // Ascending order
    }

    // ToString method for easy printing
    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", GPA: " + gpa;
    }
}
