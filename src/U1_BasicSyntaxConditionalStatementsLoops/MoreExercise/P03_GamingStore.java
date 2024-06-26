package U1_BasicSyntaxConditionalStatementsLoops.MoreExercise;

import java.util.Scanner;

public class P03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double totalPrice = 0;

        while (!input.equals("Game Time")) {
            boolean isFound = true;
            double price = 0;

            switch (input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    isFound = false;
                    System.out.println("Not Found");
                    break;
            }
            if (!isFound) {
                input = scanner.nextLine();
                continue;
            }
            if (totalPrice + price > currentBalance) {
                System.out.println("Too Expensive");
            } else {
                System.out.printf("Bought %s%n", input);
                totalPrice += price;
            }
            if (totalPrice == currentBalance) {
                System.out.println("Out of money!");
                break;
            }
            input = scanner.nextLine();
        }
        if (totalPrice != currentBalance) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalPrice, currentBalance - totalPrice);
        }
    }
}

