package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class P05_PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int indexStart = Integer.parseInt(scanner.nextLine());
        int indexEnd = Integer.parseInt(scanner.nextLine());

        for (int i = indexStart; i <= indexEnd; i++) {

            System.out.printf("%c ", i);
        }
    }
}
