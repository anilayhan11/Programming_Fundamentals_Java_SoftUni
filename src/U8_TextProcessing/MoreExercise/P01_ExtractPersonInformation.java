package U8_TextProcessing.MoreExercise;

import java.util.Scanner;

public class P01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n - 1; i++) {
            String input = scanner.nextLine();;

            String name = input.split("@")[1].split("\\|")[0];
            String age = input.split("#")[1].split("\\*")[0];

            System.out.printf("%s is %s years old.\n", name, age);
        }
    }
}
