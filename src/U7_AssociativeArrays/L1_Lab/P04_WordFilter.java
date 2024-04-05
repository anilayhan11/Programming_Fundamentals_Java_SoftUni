package U7_AssociativeArrays.L1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsInput = scanner.nextLine().split(" ");

        wordsInput = Arrays.stream(wordsInput)
                .filter(word -> word.length() % 2 == 0)
                .toArray(String[]::new);

        Arrays.stream(wordsInput).forEach(word -> System.out.println(word));
    }
}
