package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());

        printTotalSum(productInput, quantityInput);
    }

    public static double getProductPrice(String product) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2;
                break;
        }

        return price;
    }

    public static double getTotalSum(String product, int quantity) {
        double price = getProductPrice(product);
        return price * quantity;
    }

    public static void printTotalSum(String product, int quantity) {
        double sum = getTotalSum(product, quantity);
        System.out.printf("%.2f", sum);
    }
}
