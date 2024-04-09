package U8_TextProcessing.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03_TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] keyArr = Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        while (!input.equals("find")) {

            StringBuilder sequence = new StringBuilder(input);
            for (int i = 0; i <= sequence.length() - 1; i++) {
                for (int key : keyArr) {
                    char currentChar = sequence.charAt(i);
                    currentChar -= key;

                    sequence.setCharAt(i, Character.valueOf(currentChar));
                    i++;
                    if (i == sequence.length()) {
                        break;
                    }
                }
                i--;
            }
            System.out.printf("Found %s at %s%n",
                    sequence.substring(sequence.indexOf("&") + 1, sequence.lastIndexOf("&")),
                    sequence.substring(sequence.indexOf("<") + 1, sequence.lastIndexOf(">")));
            input = scanner.nextLine();
        }
    }
}