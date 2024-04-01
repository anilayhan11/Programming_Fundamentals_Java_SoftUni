package U1_BasicSyntaxConditionalStatementsLoops.L1_Lab;

import java.util.Scanner;

public class P10_MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int prod = 0;

        for (int i = 1; i <= 10 ; i++) {
            prod = n * i;

            System.out.printf("%d X %d = %d\n", n, i, prod);

        }
    }
}
