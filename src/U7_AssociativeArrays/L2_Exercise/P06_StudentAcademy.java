package U7_AssociativeArrays.L2_Exercise;

import java.util.*;

public class P06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> gradesMap = new LinkedHashMap<>();

        for (int i = 0; i <= n - 1; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!gradesMap.containsKey(name)) {
                gradesMap.put(name, new ArrayList<>());
                gradesMap.get(name).add(grade);

            } else {
                gradesMap.get(name).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : gradesMap.entrySet()) {
            String studentName = entry.getKey();
            List<Double> studentGrades = entry.getValue();

            double sumGrades = studentGrades.stream().mapToDouble(Double::doubleValue).sum();

            double averageGrade = sumGrades / studentGrades.size();

            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f\n", studentName, averageGrade);
            }
        }
    }
}

