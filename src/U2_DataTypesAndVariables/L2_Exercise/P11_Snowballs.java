package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        int snowballSnowMax = Integer.MIN_VALUE;
        int snowballTimeMax = Integer.MIN_VALUE;
        int snowballQualityMax = Integer.MIN_VALUE;
        double snowballValueMax = Integer.MIN_VALUE;

        for (int i = 1; i <= inputCount; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((double) snowballSnow / snowballTime, snowballQuality);

            if (snowballValue >= snowballValueMax) {
                snowballSnowMax = snowballSnow;
                snowballTimeMax = snowballTime;
                snowballQualityMax = snowballQuality;
                snowballValueMax = snowballValue;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMax, snowballTimeMax, snowballValueMax, snowballQualityMax);
    }
}