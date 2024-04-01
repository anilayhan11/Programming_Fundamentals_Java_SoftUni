package U4_Methods.L2_Exercise;

import java.util.Scanner;

public class P07_NxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printMatrix(input);
    }

    private static void printMatrix(int num) {
        for (int columns = 0; columns <= num - 1; columns++) {
            System.out.println();
            for (int rows = 0; rows <= num - 1; rows++) {
                System.out.print(num + " ");
            }
        }
    }
}
