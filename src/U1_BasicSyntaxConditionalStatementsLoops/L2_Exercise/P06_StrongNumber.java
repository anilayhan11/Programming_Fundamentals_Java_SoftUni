// Solution using the ASCII table, and char to int conversion.
package U1_BasicSyntaxConditionalStatementsLoops.L2_Exercise;

import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String inputString = "" + input;
        int factorial = 1;
        int sumFactorials = 0;

        // Take each digit of the number separately.
        for (int i = 0; i <= inputString.length() - 1; i++) {
            char digit = inputString.charAt(i);
            int intDigit = digit - 48;

            // Find the factorial of each digit.
            for (int j = intDigit; j >= 1; j--) {
                factorial *= j;
            }

            // Add each factorial to the sum of factorials.
            sumFactorials += factorial;
            factorial = 1;
        }

        // Check if the number is strong.
        if (sumFactorials == input) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
