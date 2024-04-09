package U9_RegularExpressions.L1_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_MatchFullName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

// String where the regex is stored in text form.
        String regex = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)";
// Working pattern of the text above, which can sift through input.
        Pattern pattern = Pattern.compile(regex);
// Where the valid instances are stored
        Matcher matcher = pattern.matcher(text);

//matcher.find() -> Returns true if a match is found, and false otherwise.
        while (matcher.find()){
//take instance, print, delete, check again.
            System.out.print(matcher.group() + " ");
        }
    }
}