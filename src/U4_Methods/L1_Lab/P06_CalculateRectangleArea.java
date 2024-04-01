package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthInput = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());
        int areaPrint = rectangleArea(widthInput, lengthInput);

        System.out.println(areaPrint);
    }

    public static int rectangleArea(int width, int length) {
        return width * length;
    }
}
