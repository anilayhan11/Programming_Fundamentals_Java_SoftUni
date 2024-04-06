package U7_AssociativeArrays.L2_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (!quantityMap.containsKey(name)) {
                quantityMap.put(name, quantity);

            } else {
                int updatedQuantity = quantityMap.get(name) + quantity;
                quantityMap.put(name, updatedQuantity);
            }

            double totalPrice = quantityMap.get(name) * price;
            priceMap.put(name, totalPrice);

            input = scanner.nextLine();
        }

        priceMap.entrySet().forEach(pair -> System.out.printf("%s -> %.2f\n", pair.getKey(), pair.getValue()));
    }
}
