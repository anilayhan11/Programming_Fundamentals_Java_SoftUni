package U4_Methods.MoreExercise;

import java.util.Scanner;

public class P04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printTribonacci(num);
    }

    private static void printTribonacci(int num) {
        int[] numArr = new int[num];

        if (num == 1) {
            numArr[0] = 1;

        } else if (num == 2) {
            numArr[0] = 1;
            numArr[1] = 1;

        } else if (num == 3) {
            numArr[0] = 1;
            numArr[1] = 1;
            numArr[2] = 2;

        } else {
            numArr[0] = 1;
            numArr[1] = 1;
            numArr[2] = 2;

            for (int i = 3; i <= num - 1; i++) {
                numArr[i] = numArr[i - 1] + numArr[i - 2] + numArr[i - 3];
            }
        }

        for (int e : numArr) {
            System.out.print(e + " ");
        }
    }
}