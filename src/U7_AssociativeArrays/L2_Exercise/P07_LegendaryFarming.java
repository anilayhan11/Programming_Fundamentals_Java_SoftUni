package U7_AssociativeArrays.L2_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        Map<String, Integer> junkMap = new LinkedHashMap<>();

        boolean isLegendaryItemBought = false;
        while (!isLegendaryItemBought) {

            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i <= input.length - 1; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {

                    int existingQuantity = materialsMap.get(material);
                    materialsMap.put(material, existingQuantity + quantity);

                } else {
                    if (junkMap.containsKey(material)) {
                        int existingQuantity = junkMap.get(material);
                        junkMap.put(material, existingQuantity + quantity);

                    } else {
                        junkMap.put(material, quantity);

                    }
                }
                for (Map.Entry<String, Integer> entry : materialsMap.entrySet()) {
                    if (entry.getValue() >= 250) {
                        isLegendaryItemBought = true;

                        if (entry.getKey().equals("shards")) {
                            System.out.println("Shadowmourne obtained!");

                        } else if (entry.getKey().equals("fragments")) {
                            System.out.println("Valanyr obtained!");

                        } else if (entry.getKey().equals("motes")) {
                            System.out.println("Dragonwrath obtained!");

                        }

                        int newQuantity = entry.getValue() - 250;
                        materialsMap.put(material, newQuantity);
                    }
                }

                if (isLegendaryItemBought) {
                    break;
                }
            }
        }

        materialsMap.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
    }
}
