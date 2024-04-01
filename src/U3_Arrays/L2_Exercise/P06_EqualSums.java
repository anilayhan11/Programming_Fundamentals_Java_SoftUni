package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int index = 0; index <= numbersArr.length - 1; index++) {

            int beforeSum = 0;
            int afterSum = 0;

            // numbers before current num
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                beforeSum += numbersArr[leftIndex];
            }
            // numbers after current num
            for (int rightIndex = index + 1; rightIndex <= numbersArr.length - 1; rightIndex++) {
                afterSum += numbersArr[rightIndex];
            }
            if (beforeSum == afterSum) {
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }
}
