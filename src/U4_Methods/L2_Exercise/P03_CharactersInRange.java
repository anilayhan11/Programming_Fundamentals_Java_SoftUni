package U4_Methods.L2_Exercise;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input1 = scanner.nextLine().charAt(0);
        char input2 = scanner.nextLine().charAt(0);

        printAsciiInterval(input1, input2);
    }

    private static void printAsciiInterval(char char1, char char2) {

        if (char2 > char1) {
            for (int i = char1 + 1; i <= char2 - 1; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = char2 + 1; i <= char1 - 1; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}
