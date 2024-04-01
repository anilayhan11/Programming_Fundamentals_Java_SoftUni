package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class P03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;
        boolean isEqual = Math.abs(firstNum - secondNum) < eps;

        if (isEqual) {
            System.out.println("True");

        } else {
            System.out.println("False");

        }
    }
}
