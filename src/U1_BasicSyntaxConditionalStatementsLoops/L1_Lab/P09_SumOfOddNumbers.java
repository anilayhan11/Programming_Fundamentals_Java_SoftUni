package U1_BasicSyntaxConditionalStatementsLoops.L1_Lab;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumNumbers = 0;

        for (int i = 1; i <= n * 2; i += 2) {
            System.out.println(i);
            sumNumbers += i;
        }
        System.out.printf("Sum: %d", sumNumbers);
    }
}
