package U7_AssociativeArrays.L2_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> pointsMap = new LinkedHashMap<>();
        Map<String, Integer> submissionsMap = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String username = input.split("-")[0];

            if (input.contains("banned")) {
                pointsMap.remove(username);
                break;
            }

            String language = input.split("-")[1];
            int points = Integer.parseInt(input.split("-")[2]);

            // Store usernames and points
            if (!pointsMap.containsKey(username)) {
                pointsMap.put(username, points);

            } else {
                int currentPoints = pointsMap.get(username);

                if (currentPoints < points) {
                    pointsMap.put(username, points);
                }
            }

            // Store language and submissions
            submissionsMap.putIfAbsent(language, 0);
            int updatedSubmissions = submissionsMap.get(language) + 1;
            submissionsMap.put(language, updatedSubmissions);

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        pointsMap.forEach((key, value) -> System.out.printf("%s | %d\n", key, value));

        System.out.println("Submissions:");
        submissionsMap.forEach((key, value) -> System.out.printf("%s - %d\n", key, value));

    }
}
