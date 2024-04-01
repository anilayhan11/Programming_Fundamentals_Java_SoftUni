package U4_Methods.L2_Exercise;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        countVowels(input);
    }

    private static void countVowels(String word) {
        int counter = 0;

        for (int i = 0; i <= word.length() - 1; i++) {
            char currentLetter = word.charAt(i);

            if (currentLetter == 'a' || currentLetter == 'o' || currentLetter == 'u' || currentLetter == 'e' || currentLetter == 'i' ||
                    currentLetter == 'A' || currentLetter == 'O' || currentLetter == 'U' || currentLetter == 'E' || currentLetter == 'I') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
