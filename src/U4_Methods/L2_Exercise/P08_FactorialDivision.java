package U4_Methods.L2_Exercise;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long factNum1 = calculateFactorial(num1);

        long factNum2 = calculateFactorial(num2);

        double result = factNum1 * 1.0 / factNum2;
        System.out.printf("%.2f", result);
    }

    private static long calculateFactorial(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }
}
