package U6_ObjectsAndClasses.L2_Exercise.P04_Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i <= countStudents - 1; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");

            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
