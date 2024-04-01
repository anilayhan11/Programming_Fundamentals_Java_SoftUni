//Solution with .stream
package U5_Lists.L1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03_SumEvenNumbers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" ")) //read and split
                .mapToInt(e -> Integer.parseInt(e)) //map to int
                .toArray(); // map to array

        int evenSum = 0;
        for (int i = 0; i <= numbersArr.length - 1; i++) {
            if (numbersArr[i] % 2 == 0) {
                evenSum += numbersArr[i];
            }
        }
        System.out.println(evenSum);
    }
}
