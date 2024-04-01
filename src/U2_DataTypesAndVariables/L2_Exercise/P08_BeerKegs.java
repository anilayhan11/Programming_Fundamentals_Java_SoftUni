package U2_DataTypesAndVariables.L2_Exercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        double maxVol = Integer.MIN_VALUE;
        String maxModel = "";

        for (int i = 1; i <= inputCount; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double vol = Math.PI * Math.pow(radius, 2) * height;

            if (vol >= maxVol) {
                maxVol = vol;
                maxModel = model;
            }
        }
        System.out.println(maxModel);
    }
}
