package U2_DataTypesAndVariables.L2_Exercise;

import java.util.Scanner;

public class P06_TripletsOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < 97 + n; i++) {
            for (int j = 97; j < 97 + n; j++) {
                for (int k = 97; k < 97 + n; k++) {
                    System.out.printf("%c%c%c\n", i, j, k);
                }
            }
        }
    }
}
