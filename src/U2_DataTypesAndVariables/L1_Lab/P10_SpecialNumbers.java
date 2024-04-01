package U2_DataTypesAndVariables.L1_Lab;

import java.util.Scanner;

public class P10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        boolean isSpecial = false;

        for (int i = 1; i <= input; i++) {
            if (i <= 9) {
                if (i == 5 || i == 7) {
                    isSpecial = true;
                } else {
                    isSpecial = false;
                }
            } else {
                int firstDigit = i / 10;
                int secondDigit = i % 10;
                int addDigits = firstDigit + secondDigit;

                if (addDigits == 5 || addDigits == 7 || addDigits == 11) {
                    isSpecial = true;
                } else {
                    isSpecial = false;
                }
            }
            if (isSpecial) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
