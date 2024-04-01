package U1_BasicSyntaxConditionalStatementsLoops.L1_Lab;

import java.util.Scanner;

public class P07_TheatrePromotions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    System.out.printf("12$");
                } else if (age > 18 && age <= 64) {
                    System.out.printf("18$");
                } else if (age > 64 && age <= 122) {
                    System.out.printf("12$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    System.out.printf("15$");
                } else if (age > 18 && age <= 64) {
                    System.out.printf("20$");
                } else if (age > 64 && age <= 122) {
                    System.out.printf("15$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    System.out.printf("5$");
                } else if (age > 18 && age <= 64) {
                    System.out.printf("12$");
                } else if (age > 64 && age <= 122) {
                    System.out.printf("10$");
                } else {
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Error!");
        }
    }
}
