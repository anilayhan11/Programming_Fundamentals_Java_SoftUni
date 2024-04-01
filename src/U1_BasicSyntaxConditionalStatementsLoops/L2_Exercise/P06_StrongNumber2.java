// Solution using modular division.
package U1_BasicSyntaxConditionalStatementsLoops.L2_Exercise;

import java.util.Scanner;

public class P06_StrongNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

        int sumFact = 0;
        while (number > 0) {
            int lastDigit = number % 10;// Take the last digit.

            // Find the factorial of lastDigit
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            // Sum factorials.
            sumFact += fact;
            // Delete last digit
            number = number / 10;
        }

        // Check if the number is strong.
        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
