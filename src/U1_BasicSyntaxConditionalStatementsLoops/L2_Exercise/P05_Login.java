package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String input = scanner.nextLine();
        String password = "";
        int counter = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char letter = username.charAt(i);
            password += letter;
        }

        while (!input.equals(password)) {
            counter++;

            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

            input = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
