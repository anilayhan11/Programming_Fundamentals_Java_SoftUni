package U1_BasicSyntaxConditionalStatementsLoops.L1_Lab;

import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sumMinutes = hour * 60 + minutes + 30;

        int resultHour = sumMinutes / 60;
        int resultMinutes = sumMinutes % 60;

        if (resultHour > 23) {
            resultHour = 0;
        }

        System.out.printf("%d:%02d", resultHour, resultMinutes);

    }
}
