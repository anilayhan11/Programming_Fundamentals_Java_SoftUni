package U5_Lists.L1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < numArr.length - 1; i++) {

            for (int j = 0; j < numArr.length - 1; j++) {
                numArr[j] += numArr[j + 1];
            }
        }
        System.out.println(numArr[0]);
    }
}