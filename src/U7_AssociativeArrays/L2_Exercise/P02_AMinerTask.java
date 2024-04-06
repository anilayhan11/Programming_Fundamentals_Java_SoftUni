package U7_AssociativeArrays.L2_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourcesMap.containsKey(resource)) {
                resourcesMap.putIfAbsent(resource, quantity);

            } else {
                int existingQuantity = resourcesMap.get(resource);
                resourcesMap.put(resource, existingQuantity + quantity);
            }

            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> pair : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d\n", pair.getKey(), pair.getValue());
        }

        // Print with lambda
        // resourcesMap.entrySet().forEach(entry -> System.out.printf("%s -> %d\n",entry.getKey(), entry.getValue()));
    }
}
