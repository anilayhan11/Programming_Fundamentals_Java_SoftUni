//Solution with for loop.
package U3_Arrays.L1_Lab;

import java.util.Scanner;

public class P03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //read input

        String[] inputArr = input.split(" "); //split input
        int[] numbersArr = new int[inputArr.length]; //make empty integer array with input length
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(inputArr[i]); // fill-in the integer array
        }

        int evenSum = 0;
        for (int i = 0; i <= numbersArr.length - 1; i++) {
            int currentNum = numbersArr[i];
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            }
        }
        System.out.println(evenSum);
    }
}