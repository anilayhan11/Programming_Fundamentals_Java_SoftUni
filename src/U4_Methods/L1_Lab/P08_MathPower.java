package U4_Methods.L1_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNum = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(mathPower(inputNum, power)));
    }

    public static double mathPower(double number, int pow) {
        return Math.pow(number, pow);
    }
}
