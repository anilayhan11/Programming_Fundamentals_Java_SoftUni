package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double priceTotal = 0.00;

        for (int i = 1; i <= orders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());
            double priceOrder = (days * capsules) * pricePerCapsule;
            priceTotal += priceOrder;

            System.out.printf("The price for the coffee is: $%.2f\n", priceOrder);
        }
        System.out.printf("Total: $%.2f\n", priceTotal);
    }
}
