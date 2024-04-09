package FinalExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String skill = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder textForManipulation = new StringBuilder(skill);

        while (!command.equals("For Azeroth")) {
            String[] inputArr = command.split("\\s");

            if (inputArr[0].equals("GladiatorStance")) {

                String upperCase = textForManipulation.toString().toUpperCase();
                textForManipulation.replace(0, textForManipulation.length(), upperCase);

                System.out.println(textForManipulation);

            } else if (inputArr[0].equals("DefensiveStance")) {
                String lowerCase = textForManipulation.toString().toLowerCase();
                textForManipulation.replace(0, textForManipulation.length(), lowerCase);

                System.out.println(textForManipulation);

            } else if (inputArr[0].equals("Dispel")) {
                int index = Integer.parseInt(inputArr[1]);
                char letter = inputArr[2].charAt(0);

                if (index >= 0 && index <= textForManipulation.length() - 1) {
                    textForManipulation.setCharAt(index, letter);
                    System.out.println("Success!");

                } else {
                    System.out.println("Dispel too weak.");

                }

            } else if (inputArr[0].equals("Target") && inputArr[1].equals("Change")) {
                String firstSubstring = inputArr[2];
                String secondSubstring = inputArr[3];

                String stringText = textForManipulation.toString();

                int matchResult = stringText.indexOf(firstSubstring);

                while (matchResult != -1) {
                    stringText = stringText.replace(firstSubstring, secondSubstring);
                    matchResult = stringText.indexOf(firstSubstring);

                }

                textForManipulation.delete(0, textForManipulation.length());
                textForManipulation.append(stringText);
                System.out.println(textForManipulation);

            } else if (inputArr[0].equals("Target") && inputArr[1].equals("Remove")) {
                String substring = inputArr[2];

                String stringText = textForManipulation.toString();

                int matchResult = stringText.indexOf(substring);

                while (matchResult != -1) {
                    stringText = stringText.replace(substring, "");
                    matchResult = stringText.indexOf(substring);

                }

                textForManipulation.replace(0, textForManipulation.length(), stringText);
                System.out.println(textForManipulation);

            } else {
                System.out.println("Command doesn't exist!");
            }

            command = scanner.nextLine();
        }
    }
}
