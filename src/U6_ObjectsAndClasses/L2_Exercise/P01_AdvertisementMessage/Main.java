package U6_ObjectsAndClasses.L2_Exercise.P01_AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Message message = new Message();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n - 1; i++) {
            String output = message.randomMessage();
            System.out.println(output);
        }
    }
}
