package U4_Methods.MoreExercise;

import java.util.Scanner;

public class P01_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();
        String data = scanner.nextLine();

        switch (dataType) {
            case "int":
                int inputInt = Integer.parseInt(data);
                multiply(inputInt);
                break;
            case "real":
                double inputDouble = Double.parseDouble(data);
                multiplyAndFormat(inputDouble);
                break;

            case "string":
                surround(data);
                break;
        }
    }

    private static void multiply(int num) {
        System.out.println(num * 2);
    }

    private static void multiplyAndFormat(double num) {
        System.out.printf("%.2f", num * 1.5);
    }

    private static void surround(String input) {
        System.out.println("$" + input + "$");
    }
}
