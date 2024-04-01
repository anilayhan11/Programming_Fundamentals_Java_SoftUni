package U2_DataTypesAndVariables.L1_Lab;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input1 = scanner.nextLine().charAt(0);
        char input2 = scanner.nextLine().charAt(0);
        char input3 = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", input1, input2, input3);

    }
}

