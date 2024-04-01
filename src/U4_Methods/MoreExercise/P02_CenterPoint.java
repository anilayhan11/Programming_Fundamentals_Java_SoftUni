package U4_Methods.MoreExercise;

import java.util.Scanner;

public class P02_CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printClosestXYToZero(x1, y1, x2, y2);
    }

    private static void printClosestXYToZero(int x1, int y1, int x2, int y2) {

        // The expression "R= the square root of x^2 + y^2" represents the formula
        // for calculating the distance between a point (x, y) and the origin (0, 0).

        double firstPoint = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double secondPoint = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (firstPoint <= secondPoint) {
            System.out.printf("(%d, %d)", x1, y1);
        } else if (secondPoint < firstPoint) {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
}

