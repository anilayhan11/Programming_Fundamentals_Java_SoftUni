package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P03_PrintingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linesToMiddle = Integer.parseInt(scanner.nextLine());

        printTriangle(linesToMiddle);
    }

    public static void printTriangle(int lines) {

        for (int i = 1; i <= lines; i++) {
            printLine(1, i);
        }

        for (int i = lines - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    public static void printLine(int start, int end) {
        for (int i = 1; i <= end; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
