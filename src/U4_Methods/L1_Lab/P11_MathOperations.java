package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(num1, operator, num2));
    }

    private static int calculate(int a, String operator, int b) {
        int result = 0;

        switch (operator) {
            case "/":
                result = a / b;
                break;

            case "*":
                result = a * b;
                break;

            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;
        }

        return result;
    }
}
