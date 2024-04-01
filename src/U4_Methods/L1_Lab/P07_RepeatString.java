//Solution with void method;
package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        output(input, repeatCount);
    }

    public static void output(String str, int count) {
        String result = "";
        for (int i = 0; i <= count - 1; i++) {
            System.out.print(result + str);
        }
    }
}
