package U2_DataTypesAndVariables.L1_Lab;

import java.util.Scanner;

public class P07_ReversedChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char input1 = scanner.nextLine().charAt(0);
        char input2 = scanner.nextLine().charAt(0);
        char input3 = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", input3, input2, input1);
    }
}
