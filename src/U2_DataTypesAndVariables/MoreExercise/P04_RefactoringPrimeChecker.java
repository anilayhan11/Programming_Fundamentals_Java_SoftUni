package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class P04_RefactoringPrimeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int limit = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b\n", i, isPrime);
        }
    }
}
