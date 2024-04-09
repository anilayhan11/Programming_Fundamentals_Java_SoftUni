package U8_TextProcessing.L1_Lab;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        int index = secondText.indexOf(firstText);

        while (index != -1) {
            secondText = secondText.replace(firstText, "");
            index = secondText.indexOf(firstText);
        }

        System.out.println(secondText);

    }
}
