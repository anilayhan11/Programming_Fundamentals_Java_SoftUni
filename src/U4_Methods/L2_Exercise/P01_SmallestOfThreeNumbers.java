package U4_Methods.L2_Exercise;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNum(num1, num2, num3));
    }

    private static int getSmallestNum(int num1, int num2, int num3) {
        int[] numArr = {num1, num2, num3};
        int numMin = Integer.MAX_VALUE;

        for (int e : numArr) {
            if (e < numMin) {
                numMin = e;
            }
        }
        return numMin;
    }
}
