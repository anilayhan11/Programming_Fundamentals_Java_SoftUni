package U3_Arrays.L2_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        boolean isTopNum = false;

        for (int i = 0; i < numbersArr.length - 1; i++) {
            int currentNum = numbersArr[i];

            for (int j = i + 1; j <= numbersArr.length - 1; j++) {
                if (currentNum <= numbersArr[j]) {
                    isTopNum = false;
                    break;
                } else {
                    isTopNum = true;
                }
            }
            if (isTopNum) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.print(numbersArr[numbersArr.length - 1]);

    }
}
