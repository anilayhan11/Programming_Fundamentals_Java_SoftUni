package U5_Lists.L1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] numbersArr2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        for (int i = 0; i <= numbersArr1.length - 1; i++) {
            if (numbersArr1[i] != numbersArr2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            } else {
                sum += numbersArr1[i];
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
