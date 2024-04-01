package U3_Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (long rows = 1; rows <= input; rows++) {
            long newNumber = 1;

            for (long columns = 1; columns <= rows; columns++) {
                System.out.print(newNumber + " ");
                newNumber = newNumber * (rows - columns) / columns;
            }
            System.out.println();
        }
    }
}