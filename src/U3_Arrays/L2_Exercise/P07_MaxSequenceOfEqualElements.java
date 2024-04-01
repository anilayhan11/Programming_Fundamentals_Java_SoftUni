package U3_Arrays.L2_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int counter = 0;
        int maxCounter = Integer.MIN_VALUE;
        int maxElementCount = 0;

        for (int i = 0; i < numbersArr.length - 1; i++) {

            if (numbersArr[i] == numbersArr[i + 1]) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                maxElementCount = numbersArr[i];
            }

        }
        if (maxCounter > 0) {
            for (int i = 0; i <= maxCounter; i++) {
                System.out.print(maxElementCount + " ");
            }
        }
    }
}