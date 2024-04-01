package U3_Arrays.L1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i <= numbersArr.length - 1; i++) {
            if (numbersArr[i] % 2 == 0) {
                evenSum += numbersArr[i];
            } else {
                oddSum += numbersArr[i];
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
