package U4_Methods.L2_Exercise;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        checkValidity(input);
    }

    private static boolean checkLength(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;

        } else {
            return false;
        }
    }

    private static boolean checkContent(String password) {

        for (int i = 0; i <= password.length() - 1; i++) {
            char currentChar = password.charAt(i);

            if (currentChar < 48 || currentChar > 57 && currentChar < 65 ||
                    currentChar > 90 && currentChar < 97 || currentChar > 122) {

                return false;

            }
        }

        return true;
    }

    private static boolean checkDigitCount(String password) {
        int counter = 0;

        for (int i = 0; i <= password.length() - 1; i++) {
            char currentChar = password.charAt(i);

            if (currentChar >= 48 && currentChar <= 57) {
                counter++;
            }
        }

        if (counter >= 2) {
            return true;

        } else {
            return false;
        }
    }

    private static void checkValidity(String password) {
        if (!checkLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!checkContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!checkDigitCount(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (checkLength(password) && checkContent(password) && checkDigitCount(password)) {
            System.out.println("Password is valid");
        }
    }
}
