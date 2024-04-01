//Solution with for loop
package U3_Arrays.L1_Lab;

import java.util.Scanner;

public class P04_ReverseAnArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //read input

        String[] inputArr = input.split(" "); //split input
        for (int i = inputArr.length - 1; i >= 0; i--) {
            System.out.print(inputArr[i] + " ");

        }
    }
}
