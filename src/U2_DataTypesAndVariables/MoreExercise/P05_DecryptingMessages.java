package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class P05_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int linesCount = Integer.parseInt(scanner.nextLine());
        String output = "";

        for (int i = 0; i <= linesCount - 1; i++) {
            char input = scanner.nextLine().charAt(0);
            input += key;

            output += input;
        }
        System.out.println(output);
    }
}
