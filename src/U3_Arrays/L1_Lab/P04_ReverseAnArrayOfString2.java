//Solution with algorithm
package U3_Arrays.L1_Lab;

import java.util.Scanner;

public class P04_ReverseAnArrayOfString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String originalElement = inputArr[i]; // save original element
            inputArr[i] = inputArr[inputArr.length - 1 - i]; // replace original element
            inputArr[inputArr.length - 1 - i] = originalElement; // save original element at new position

        }

        System.out.println(String.join(" ", inputArr));

    }
}