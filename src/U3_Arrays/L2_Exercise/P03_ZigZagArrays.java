package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[rows];
        int[] secondArr = new int[rows];

        for (int i = 0; i < rows; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                firstArr[i] = Integer.parseInt(input[0]);
                secondArr[i] = Integer.parseInt(input[1]);

            } else {
                firstArr[i] = Integer.parseInt(input[1]);
                secondArr[i] = Integer.parseInt(input[0]);
            }
        }
        for (int first : firstArr) {
            System.out.print(first + " ");
        }
        System.out.println();
        for (int second : secondArr) {
            System.out.print(second + " ");
        }
    }
}
