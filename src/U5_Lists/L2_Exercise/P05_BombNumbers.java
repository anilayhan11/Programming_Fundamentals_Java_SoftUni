package U5_Lists.L2_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] bombNumbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int bombNumber = bombNumbers[0];
        int bombPower = bombNumbers[1];

        while (numbersList.contains(bombNumber)) {
            int bombNumberIndex = numbersList.indexOf(bombNumber);

            int left = Math.max(0, bombNumberIndex - bombPower);
            int right = Math.min(bombNumberIndex + bombPower, numbersList.size() - 1);

            for (int i = right; i >= left; i--) {
                numbersList.remove(i);
            }
        }

        int sum = 0;
        for (int number : numbersList) {
            sum += number;
        }
        System.out.println(sum);
    }
}

