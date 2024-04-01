package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] stringArr = input.split(" ");

            if (input.contains("swap")) {

                int firstIndex = Integer.parseInt(stringArr[1]);
                int secondIndex = Integer.parseInt(stringArr[2]);

                int firstNum = numbersArr[firstIndex];
                int secondNum = numbersArr[secondIndex];

                numbersArr[firstIndex] = secondNum;
                numbersArr[secondIndex] = firstNum;

            } else if (input.contains("multiply")) {
                int firstIndex = Integer.parseInt(stringArr[1]);
                int secondIndex = Integer.parseInt(stringArr[2]);

                int firstNum = numbersArr[firstIndex];
                int secondNum = numbersArr[secondIndex];

                numbersArr[firstIndex] = firstNum * secondNum;

            } else if (input.equals("decrease")) {
                for (int i = 0; i <= numbersArr.length - 1; i++) {
                    numbersArr[i]--;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbersArr).replace("[", "").replace("]", ""));
    }
}

