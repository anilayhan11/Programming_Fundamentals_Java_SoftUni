package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class P11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double totalExpenses = 0.00;

        int countKeyboard = 0;

        for (int i = 1; i <= lostGames; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                totalExpenses += headsetPrice + mousePrice + keyboardPrice;
                countKeyboard++;

                if (countKeyboard % 2 == 0) {
                    totalExpenses += displayPrice;
                }
            } else if (i % 2 == 0) {
                totalExpenses += headsetPrice;
            } else if (i % 3 == 0) {
                totalExpenses += mousePrice;
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}

