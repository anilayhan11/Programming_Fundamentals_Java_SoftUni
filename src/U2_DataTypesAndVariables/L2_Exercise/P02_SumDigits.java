package U2_DataTypesAndVariables.L2_Exercise;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (input > 0) {
            int digit = input % 10;
            sum += digit;
            input /= 10;
        }
        System.out.println(sum);

    }
}
