package U7_AssociativeArrays.L2_Exercise;

import java.util.*;

public class P05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> studentsMap = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            studentsMap.putIfAbsent(course, new ArrayList<>());
            studentsMap.get(course).add(student);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : studentsMap.entrySet()) {
            String courseName = entry.getKey();
            List<String> studentNames = entry.getValue();

            System.out.printf("%s: %d\n", courseName, studentNames.size());
            studentNames.forEach(name -> System.out.println("-- " + name));

        }
    }
}
