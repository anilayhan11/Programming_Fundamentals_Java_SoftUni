package U2_DataTypesAndVariables.L1_Lab;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int endNum = Integer.parseInt(scanner.nextLine());
        boolean isSpecial = false;

        for (int currentNum = 1; currentNum <= endNum; currentNum++) {

            int firstDigit = currentNum / 10;
            int lastDigit = currentNum % 10;
            int sum = firstDigit + lastDigit;

            if (sum == 5 || sum == 7 || sum == 11) {
                isSpecial = true;
            } else {
                isSpecial = false;
            }

            if (isSpecial) {
                System.out.printf("%d -> True\n", currentNum);
            } else {
                System.out.printf("%d -> False\n", currentNum);
            }
        }
    }
}
