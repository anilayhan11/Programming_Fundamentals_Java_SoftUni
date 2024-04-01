package U3_Arrays.L2_Exercise;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scanner.nextLine());
        int passengersTotal = 0;

        for (int i = 1; i <= wagonCount; i++) {
            int passengers = Integer.parseInt(scanner.nextLine());

            System.out.print(passengers + " ");

            passengersTotal += passengers;
        }
        System.out.println();
        System.out.println(passengersTotal);
    }
}

