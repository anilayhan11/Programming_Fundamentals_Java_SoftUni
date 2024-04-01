//Solution with String method;
package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P07_RepeatString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        System.out.println(output(input, repeatCount));
    }

    public static String output(String str, int count) {
        String result = "";
        for (int i = 0; i <= count - 1; i++) {
            result += str;
        }
        return result;
    }
}
