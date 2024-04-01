package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        int letterValue = 0;

        for (int i = 0; i < inputCount; i++) {
            char letter = scanner.nextLine().charAt(0);

            letterValue += letter;
        }
        System.out.printf("The sum equals: %d",letterValue);
    }
}
