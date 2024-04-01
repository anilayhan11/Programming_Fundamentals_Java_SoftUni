package U3_Arrays.L1_Lab;

import java.util.Scanner;

public class P02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        int[] intArr = new int[inputCount];

        for (int i = 0; i <= intArr.length - 1; i++) {
            intArr[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.printf("%d ", intArr[i]);
        }
    }
}
