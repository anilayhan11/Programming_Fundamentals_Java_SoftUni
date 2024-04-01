package U4_Methods.MoreExercise;

import java.util.Scanner;

public class P03_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L1x1 = Integer.parseInt(scanner.nextLine());
        int L1y1 = Integer.parseInt(scanner.nextLine());
        int L1x2 = Integer.parseInt(scanner.nextLine());
        int L1y2 = Integer.parseInt(scanner.nextLine());
        int L2x1 = Integer.parseInt(scanner.nextLine());
        int L2y1 = Integer.parseInt(scanner.nextLine());
        int L2x2 = Integer.parseInt(scanner.nextLine());
        int L2y2 = Integer.parseInt(scanner.nextLine());

        findLongerLine(L1x1, L1y1, L1x2, L1y2, L2x1, L2y1, L2x2, L2y2);
    }


    private static void findLongerLine(
            int L1x1, int L1y1, int L1x2, int L1y2,
            int L2x1, int L2y1, int L2x2, int L2y2) {

        //Given two points (x1, y1) and (x2, y2), the distance formula is:
        //d = sqrt {(x2 - x1)^2 + (y2 - y1)^2}

        double line1 = Math.sqrt(Math.pow((L1x2 - L1x1), 2) + Math.pow((L1y2 - L1y1), 2));
        double line2 = Math.sqrt(Math.pow((L2x2 - L2x1), 2) + Math.pow((L2y2 - L2y1), 2));

        // The expression "R= the square root of x^2 + y^2" represents the formula
        // for calculating the distance between a point (x, y) and the origin (0, 0).

        double firstPointL1 = Math.sqrt(Math.pow(L1x1, 2) + Math.pow(L1y1, 2));
        double secondPointL1 = Math.sqrt(Math.pow(L1x2, 2) + Math.pow(L1y2, 2));
        double firstPointL2 = Math.sqrt(Math.pow(L2x1, 2) + Math.pow(L2y1, 2));
        double secondPointL2 = Math.sqrt(Math.pow(L2x2, 2) + Math.pow(L2y2, 2));

        if (line1 >= line2) {
            if (firstPointL1 <= secondPointL1) {
                System.out.printf("(%d, %d)(%d, %d)", L1x1, L1y1, L1x2, L1y2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", L1x2, L1y2, L1x1, L1y1);
            }

        } else {
            if (firstPointL2 <= secondPointL2) {
                System.out.printf("(%d, %d)(%d, %d)", L2x1, L2y1, L2x2, L2y2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", L2x2, L2y2, L2x1, L2y1);
            }
        }
    }
}