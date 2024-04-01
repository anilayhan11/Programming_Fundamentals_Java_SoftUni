package U2_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String type = "";
        // Integer
        // Floating point
        // Characters
        // Boolean
        // Strings
        while (!input.equals("END")) {

            // Check for boolean
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                type = "boolean";

            } else if (input.length() == 1) {

                // Check for character
                char symbol = input.charAt(0);
                if (symbol <= 47 || symbol >= 58) {
                    type = "character";

                    // Check for one-digit integer
                } else {
                    type = "integer";
                }

            } else {
                boolean isString = false;
                boolean isFloat = false;

                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);

                    // Check for string
                    if (currentSymbol < 45 || currentSymbol > 57) {
                        isString = true;
                    }
                    if (currentSymbol == 46) {
                        isFloat = true;
                    }
                }
                if (isString) {
                    type = "string";
                } else {

                    // Check for floating or multi-digit integer
                    if (isFloat) {
                        type = "floating point";
                    } else {
                        type = "integer";
                    }
                }

            }
            System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();
        }
    }
}
