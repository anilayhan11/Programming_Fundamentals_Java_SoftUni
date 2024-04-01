package U1_BasicSyntaxConditionalStatementsLoops.L1_Lab;

import java.util.Scanner;

public class P06_ForeignLanguages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Mexico":
            case "Argentina":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");

        }
    }
}
