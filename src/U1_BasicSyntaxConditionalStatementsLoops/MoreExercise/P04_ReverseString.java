package U1_BasicSyntaxConditionalStatementsLoops.MoreExercise;

import java.util.Scanner;

public class P04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            char currentLetter = input.charAt(i);
            reverse += currentLetter;

        }
        System.out.println(reverse);
    }
}
