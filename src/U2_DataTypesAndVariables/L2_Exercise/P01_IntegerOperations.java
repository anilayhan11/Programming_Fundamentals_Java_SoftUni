package U2_DataTypesAndVariables.L2_Exercise;

import java.util.Scanner;

public class P01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int int1 = Integer.parseInt(scanner.nextLine());
        int int2 = Integer.parseInt(scanner.nextLine());
        int int3 = Integer.parseInt(scanner.nextLine());
        int int4 = Integer.parseInt(scanner.nextLine());

        int output = ((int1 + int2) / int3) * int4;

        System.out.println(output);
    }
}
