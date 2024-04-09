package U8_TextProcessing.L2_Exercise;

import java.util.Scanner;

public class P08_LettersChangeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String code : codes) {
            double result = calculateCodeResult(code);
            sum += result;
        }

        System.out.printf("%.2f", sum);
    }

    private static double calculateCodeResult(String code) {

        //"A12b"
        char letterBefore = code.charAt(0);
        double number = Double.parseDouble(code.substring(1, code.length() - 1));
        char letterAfter = code.charAt(code.length() - 1);

        // 1. Letter Before Manipulation
        if (Character.isUpperCase(letterBefore)) {
            number /= letterBefore - 64;
        } else {
            number *= letterBefore - 96;
        }

        // 2. Letter After Manipulation
        if (Character.isUpperCase(letterAfter)) {
            number -= letterAfter - 64;
        } else {
            number += letterAfter - 96;
        }

        return number;
    }
}
