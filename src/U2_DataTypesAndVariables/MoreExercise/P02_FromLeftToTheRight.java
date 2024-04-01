package U2_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            long leftNum = Long.parseLong(scanner.next());
            long rightNum = Long.parseLong(scanner.next());
            int sum = 0;

            if (leftNum > rightNum) {
                long leftCurrent = leftNum;
                while (leftCurrent != 0) {
                    sum += Math.abs(leftCurrent % 10);
                    leftCurrent = Math.abs(leftCurrent / 10);
                }
            } else {
                long rightCurrent = rightNum;
                while (rightCurrent != 0) {
                    sum += Math.abs(rightCurrent % 10);
                    rightCurrent = Math.abs(rightCurrent / 10);
                }
            }

            System.out.println(Math.abs(sum));

        }
    }
}
