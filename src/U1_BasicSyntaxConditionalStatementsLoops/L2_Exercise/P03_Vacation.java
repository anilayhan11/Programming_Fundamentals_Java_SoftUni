package U1_BasicSyntaxConditionalStatementsLoops.L2_Exercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.00;


        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45;
                } else if (day.equals("Saturday")) {
                    price = 9.80;
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90;
                } else if (day.equals("Saturday")) {
                    price = 15.60;
                } else if (day.equals("Sunday")) {
                    price = 16.00;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15.00;
                } else if (day.equals("Saturday")) {
                    price = 20.00;
                } else if (day.equals("Sunday")) {
                    price = 22.50;
                }
                break;

        }
        if (type.equals("Students") && numPeople >= 30) {
            price = price * 0.85;
        }
        if (type.equals("Business") && numPeople >= 100) {
            numPeople -= 10;
        }
        if (type.equals("Regular") && numPeople >= 10 && numPeople <= 20) {
            price = price * 0.95;
        }
        double totalPrice = price * numPeople;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
