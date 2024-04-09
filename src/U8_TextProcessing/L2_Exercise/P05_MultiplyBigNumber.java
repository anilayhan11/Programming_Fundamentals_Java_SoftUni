package U8_TextProcessing.L2_Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05_MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();

        BigInteger number1 = new BigInteger(firstNumber);
        BigInteger number2 = new BigInteger(secondNumber);

        // Multiply
        System.out.println(number1.multiply(number2));

//        // Add
//        System.out.println(number1.add(number2));
//        // Subtract
//        System.out.println(number1.subtract(number2));
//        // Divide
//        System.out.println(number1.divide(number2));
    }
}
