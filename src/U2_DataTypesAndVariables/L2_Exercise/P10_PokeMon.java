package U2_DataTypesAndVariables.L2_Exercise;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        double pokePowerHalf = pokePower * 0.5;
        int targetDistance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokes = 0;

        while (pokePower >= targetDistance) {
            pokePower -= targetDistance;
            pokes ++;

            if (pokePower == pokePowerHalf && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokes);
    }
}