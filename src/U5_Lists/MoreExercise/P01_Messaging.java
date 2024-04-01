package U5_Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Messaging {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String string = scanner.nextLine();
        String message = "";


        for (int i = 0; i <= numbersList.size() - 1; i++) {

            int number = numbersList.get(i);
            int numberSumDigits = 0;

            while (number > 0) {
                numberSumDigits += number % 10;
                number /= 10;
            }
            int index = numberSumDigits;


            while (index > string.length() - 1) {
                index = index - (string.length());
            }

            message += string.charAt(index);
            string = string.replaceFirst(String.valueOf(string.charAt(index)), "");

        }

        System.out.println(message);
    }
}