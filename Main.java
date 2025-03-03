import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", 3.5));
        students.add(new Student(102, "Bob", 3.8));
        students.add(new Student(103, "Charlie", 3.2));
        students.add(new Student(104, "David", 3.8));
        students.add(new Student(105, "Eve", 3.0));

        // Sorting
        Collections.sort(students);

        // Printing sorted students
        System.out.println("Sorted Students by GPA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
