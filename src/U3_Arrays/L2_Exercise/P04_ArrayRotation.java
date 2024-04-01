package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= rotations - 1; i++) {
            int currentFirst = numbersArr[0];

            for (int j = 0; j < numbersArr.length - 1; j++) {
                numbersArr[j] = numbersArr[j + 1];

            }
            numbersArr[numbersArr.length - 1] = currentFirst;
        }
        for (int elements : numbersArr) {
            System.out.print(elements + " ");
        }
    }
}
