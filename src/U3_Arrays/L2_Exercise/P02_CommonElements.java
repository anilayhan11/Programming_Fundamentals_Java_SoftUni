package U3_Arrays.L2_Exercise;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr1 = scanner.nextLine().split(" ");
        String[] inputArr2 = scanner.nextLine().split(" ");
        String[] commonElements = new String[inputArr1.length];

        for (String element1 : inputArr2) {
            for (String element2 : inputArr1) {
                if (element2.equals(element1)) {
                    System.out.print(element1 + " ");
                }
            }
        }
    }
}
