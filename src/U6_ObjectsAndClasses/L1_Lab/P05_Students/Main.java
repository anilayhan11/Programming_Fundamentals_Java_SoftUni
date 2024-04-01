package U6_ObjectsAndClasses.L1_Lab.P05_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // List of students
        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            // Create new object STUDENT
            Student student = new Student(firstName, lastName, age, hometown);

            // Add student to list of students.
            studentList.add(student);

            input = scanner.nextLine();
        }

        // Get full list of entered students
        String enteredTown = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getHometown().equals(enteredTown)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());

            }
        }
    }
}
