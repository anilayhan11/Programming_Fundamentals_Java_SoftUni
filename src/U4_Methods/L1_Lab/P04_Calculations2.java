//Solution with int method;
package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P04_Calculations2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                System.out.println(add(num1, num2));
                break;
            case "multiply":
                System.out.println(multiply(num1, num2));
                break;
            case "subtract":
                System.out.println(subtract(num1, num2));;
                break;
            case "divide":
                System.out.println(divide(num1, num2));
                break;
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
