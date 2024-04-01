package U2_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        int openCount = 0;
        int closeCount = 0;

        for (int lines = 0; lines < inputCount; lines++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                openCount++;
            } else if (input.equals(")")) {
                closeCount++;
            }

            // Check for cases where ")" is the first bracket
            if (closeCount > openCount) {
                System.out.println("UNBALANCED");
                return;
            }
        }

        // Check if the number of opening and closing brackets is equal or not
        if (closeCount == openCount) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
