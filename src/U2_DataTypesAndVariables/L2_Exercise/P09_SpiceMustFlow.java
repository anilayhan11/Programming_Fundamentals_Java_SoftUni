package U2_DataTypesAndVariables.L2_Exercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yieldDaily = Integer.parseInt(scanner.nextLine());
        int yieldTotal = 0;
        int days = 0;

        while (yieldDaily >= 100) {
            yieldTotal += yieldDaily;

            if (yieldTotal >= 26) {
                yieldTotal -= 26;
            } else {
                yieldTotal = 0;
            }

            yieldDaily -= 10;
            days++;
        }

        if (yieldTotal >= 26) {
            yieldTotal -= 26;
        } else {
            yieldTotal = 0;
        }

        System.out.println(days);
        System.out.println(yieldTotal);
    }
}
