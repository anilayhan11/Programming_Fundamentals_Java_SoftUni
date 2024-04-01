package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        int currentLiters = 0;
        int capacity = 255;

        for (int i = 0; i <= inputCount - 1; i++) {
            int waterLiters = Integer.parseInt(scanner.nextLine());

            if (capacity - waterLiters >= 0) {
                currentLiters += waterLiters;
                capacity -= waterLiters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.printf("%d", currentLiters);
    }
}
