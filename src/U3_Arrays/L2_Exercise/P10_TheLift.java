package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());

        int[] liftArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        boolean isFull = true;
        for (int i = 0; i <= liftArr.length - 1; i++) {

            while (liftArr[i] < 4) {

                if (peopleWaiting == 0) {
                    isFull = false;
                    break;
                } else {
                    liftArr[i]++;
                    peopleWaiting--;
                }
            }
        }

        if (isFull && peopleWaiting == 0) {
            System.out.println(Arrays.toString(liftArr)
                    .replace("[", "")
                    .replace(",", "")
                    .replace("]", ""));
        } else if (!isFull) {
            System.out.println("The lift has empty spots!");
            System.out.println(Arrays.toString(liftArr)
                    .replace("[", "")
                    .replace(",", "")
                    .replace("]", ""));
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleWaiting);
            System.out.println(Arrays.toString(liftArr)
                    .replace("[", "")
                    .replace(",", "")
                    .replace("]", ""));
        }
    }
}

