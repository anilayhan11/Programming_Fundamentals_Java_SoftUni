package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> healthMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> energyMap = new LinkedHashMap<>();

        while (!input.equals("Results")) {
            String command = input.split(":")[0];
            String name = input.split(":")[1];

            if (command.equals("Add")) {
                int health = Integer.parseInt(input.split(":")[2]);
                int energy = Integer.parseInt(input.split(":")[3]);

                if (!healthMap.containsKey(name)) {
                    healthMap.put(name, health);
                    energyMap.put(name, energy);

                } else {
                    int updatedHealth = healthMap.get(name) + health;
                    healthMap.put(name, updatedHealth);
                }

            } else if (command.equals("Attack")) {
                String attacker = input.split(":")[1];
                String defender = input.split(":")[2];
                int damage = Integer.parseInt(input.split(":")[3]);

                if (healthMap.containsKey(attacker) && healthMap.containsKey(defender)) {
                    int updatedHealth = healthMap.get(defender) - damage;
                    int updatedEnergy = energyMap.get(attacker) - 1;

                    healthMap.put(defender, updatedHealth);
                    energyMap.put(attacker, updatedEnergy);

                    if (healthMap.get(defender) <= 0) {
                        healthMap.remove(defender);
                        energyMap.remove(defender);

                        System.out.printf("%s was disqualified!\n", defender);
                    }

                    if (energyMap.get(attacker) <= 0) {
                        healthMap.remove(attacker);
                        energyMap.remove(attacker);

                        System.out.printf("%s was disqualified!\n", attacker);
                    }
                }

            } else if (command.equals("Delete")) {
                String username = input.split(":")[1];
                if (username.equals("All")) {
                    healthMap.clear();
                    energyMap.clear();

                } else {
                    healthMap.remove(username);
                    energyMap.remove(username);

                }
            }

            input = scanner.nextLine();
        }


        System.out.printf("People count: %d\n", healthMap.size());

        for (Map.Entry<String, Integer> entry : healthMap.entrySet()) {
            String name = entry.getKey();
            Integer health = entry.getValue();

            if (energyMap.containsKey(name)) {
                Integer energy = energyMap.get(name);
                System.out.printf("%s - %d - %d\n", name, health, energy);

            }
        }

    }
}
