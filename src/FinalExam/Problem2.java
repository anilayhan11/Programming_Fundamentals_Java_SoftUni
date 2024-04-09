package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = "U\\$(?<username>[A-Z][a-z]{2,})U\\SP\\@\\$(?<password>[A-Za-z]{5,}\\d+)P\\@\\$";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());

        int successfulCount = 0;

        for (int i = 0; i <= n - 1; i++) {
            String userData = scanner.nextLine();

            Matcher matcher = pattern.matcher(userData);

            if (matcher.find()) {
                successfulCount++;

                String username = matcher.group("username");
                String password = matcher.group("password");

                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s\n", username, password);

            } else {
                System.out.println("Invalid username or password");

            }
        }

        System.out.printf("Successful registrations: %d", successfulCount);
    }
}
