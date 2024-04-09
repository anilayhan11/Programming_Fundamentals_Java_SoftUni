package U8_TextProcessing.L2_Exercise;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            // 'A' -> 'D'
            char encryptedSymbol = (char) (symbol + 3);
            encryptedText.append(encryptedSymbol);
        }

        System.out.println(encryptedText);
    }
}
