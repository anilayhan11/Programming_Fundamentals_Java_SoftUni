package U8_TextProcessing.L1_Lab;

import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] texts = scanner.nextLine().split(" ");

        for (String text : texts) {
            int length = text.length();

            /*for (int count = 1; count <= length; count++) {
                System.out.print(text);
            }*/
            System.out.print(text.repeat(length));
        }
    }
}
