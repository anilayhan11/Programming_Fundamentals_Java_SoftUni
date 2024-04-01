package U1_BasicSyntaxConditionalStatementsLoops.L2_Exercise;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double money = 0.00;
        double costProduct = 0.00;
        double costTotal = 0.00;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1.0 && coins != 2.0) {
                System.out.printf("Cannot accept %.2f\n", coins);
            } else {
                money += coins;
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            boolean hasMoney = true;

            switch (product) {
                case "Nuts":
                    if (money < 2.00) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        money -= 2.00;
                    }
                    break;
                case "Water":
                    if (money < 0.70) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        money -= 0.70;
                    }
                    break;
                case "Crisps":
                    if (money < 1.50) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        money -= 1.50;
                    }
                    break;
                case "Soda":
                    if (money < 0.80) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        money -= 0.80;
                    }

                    break;
                case "Coke":
                    if (money < 1.00) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        money -= 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;
            }
            if (!hasMoney) {
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);


            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", money);
    }
}

