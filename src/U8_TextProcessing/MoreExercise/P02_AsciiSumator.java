package U8_TextProcessing.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02_AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char[] randomTextArr = scanner.nextLine().toCharArray();

        char[] validCharsArr = new char[randomTextArr.length];

        for (char c : randomTextArr) {
            if (c >= firstChar && c <= secondChar) {
                Arrays.fill(validCharsArr, c);
            }
        }

        int sum = 0;
        for (char ch : validCharsArr) {
            sum += ch;
        }

        System.out.println(sum);

    }
}
