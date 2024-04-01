package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int result = Integer.parseInt(scanner.nextLine());

        for (int firstNum = 0; firstNum <= numbersArr.length - 1; firstNum++) {
            for (int secondNum = firstNum + 1; secondNum <= numbersArr.length - 1; secondNum++) {

                if (numbersArr[firstNum] + numbersArr[secondNum] == result) {
                    System.out.println(numbersArr[firstNum] + " " + numbersArr[secondNum]);
                }
            }
        }
    }
}
