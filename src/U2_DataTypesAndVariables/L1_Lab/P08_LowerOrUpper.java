package U5_Lists.L1_Lab;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            System.out.println("lower-case");
        } else if (letter >= 'A' && letter <= 'Z') {
            System.out.println("upper-case");
        }
    }
}
