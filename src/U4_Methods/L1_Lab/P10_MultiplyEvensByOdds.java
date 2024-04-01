package U4_Methods.L1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multipleOfSums(input));
    }

    public static int evenSum(int num) {

        String intToString = Integer.toString(num);

        int[] numbersArr = Arrays
                .stream(intToString.split(""))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;

        for (int e : numbersArr) {
            if (e % 2 == 0) {
                sum += e;
            }
        }

        return sum;
    }

    public static int oddSum(int num) {

        String intToString = Integer.toString(num);

        int[] numbersArr = Arrays
                .stream(intToString.split(""))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;

        for (int e : numbersArr) {
            if (e % 2 != 0) {
                sum += e;
            }
        }

        return sum;
    }

    public static int multipleOfSums(int n) {
        return oddSum(n) * evenSum(n);
    }
}
