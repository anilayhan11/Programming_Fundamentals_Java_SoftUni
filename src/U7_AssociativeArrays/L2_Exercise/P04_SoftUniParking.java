package U7_AssociativeArrays.L2_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> licensePlatesMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n - 1; i++) {
            String input = scanner.nextLine();

            String command = input.split(" ")[0];
            String username = input.split(" ")[1];

            switch (command) {
                case "register":
                    String licensePlate = input.split(" ")[2];

                    if (licensePlatesMap.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s\n", licensePlate);

                    } else {

                        licensePlatesMap.put(username, licensePlate);
                        System.out.printf("%s registered %s successfully\n", username, licensePlate);
                    }
                    break;

                case "unregister":
                    if (!licensePlatesMap.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found\n", username);

                    } else {
                        licensePlatesMap.remove(username);
                        System.out.printf("%s unregistered successfully\n", username);
                    }
                    break;
            }
        }

        licensePlatesMap.entrySet().forEach(user -> System.out.printf("%s => %s\n", user.getKey(), user.getValue()));
    }
}
