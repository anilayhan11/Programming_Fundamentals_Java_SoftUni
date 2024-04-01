package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputType = scanner.nextLine();

        switch (inputType) {

            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());

                System.out.println(getMax(num1, num2));
                break;

            case "char":
                char char1 = scanner.nextLine().charAt(0);
                char char2 = scanner.nextLine().charAt(0);

                System.out.println(getMax(char1, char2));
                break;

            case "string":
                String string1 = scanner.nextLine();
                String string2 = scanner.nextLine();

                System.out.println(getMax(string1, string2));
                break;
        }
    }

    public static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        } else {
            return second;
        }
    }
}