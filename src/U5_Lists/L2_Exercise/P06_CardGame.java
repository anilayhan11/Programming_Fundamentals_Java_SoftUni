package U5_Lists.L2_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeckList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDeckList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstDeckList.size() != 0 && secondDeckList.size() != 0) {
            int firstPlayerCard = firstDeckList.get(0);
            int secondPlayerCard = secondDeckList.get(0);

            firstDeckList.remove(0);
            secondDeckList.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstDeckList.add(firstPlayerCard);
                firstDeckList.add(secondPlayerCard);

            } else if (secondPlayerCard > firstPlayerCard) {
                secondDeckList.add(secondPlayerCard);
                secondDeckList.add(firstPlayerCard);

            }
        }

        if (firstDeckList.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", getCardsSum(secondDeckList));
        }
        //2. ако на втория му свършат картите
        else if (secondDeckList.size() == 0) {
            //първия печели
            System.out.printf("First player wins! Sum: %d", getCardsSum(firstDeckList));
        }
    }

    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }

        return sum;
    }
}

