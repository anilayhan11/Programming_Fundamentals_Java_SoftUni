package U5_Lists.L1_Lab.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[] resultsArr = new int[rows];

        for (int i = 0; i <= rows - 1; i++) {

            String input = scanner.nextLine();
            int result = 0;

            for (int j = 0; j <= input.length() - 1; j++) {
                char letter = input.charAt(j);

                switch (letter) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        result += letter * input.length();
                        break;
                    default:
                        result += letter / input.length();
                        break;
                }
                resultsArr[i] = result;
            }
        }
        Arrays.sort(resultsArr);
        for (int elements : resultsArr) {
            System.out.println(elements);
        }
    }
}

