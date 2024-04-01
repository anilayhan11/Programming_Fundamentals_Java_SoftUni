package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P01_SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printNumberSign(num);
    }

    public static void printNumberSign(int num) {
        String sign = "";
        if (num < 0) {
            sign = "negative";
        } else if (num > 0) {
            sign = "positive";
        } else {
            sign = "zero";
        }
        System.out.printf("The number %d is %s.", num, sign);
    }
}
