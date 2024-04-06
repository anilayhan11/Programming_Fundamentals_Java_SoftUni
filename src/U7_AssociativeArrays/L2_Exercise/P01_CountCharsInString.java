package U7_AssociativeArrays.L2_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        String[] charactersArr = inputString.replaceAll("\\s+", "").split("");

        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String letter : charactersArr) {
            if (!countMap.containsKey(letter)) {
                countMap.put(letter, 1);

            } else {
                int currentCount = countMap.get(letter) + 1;
                countMap.put(letter, currentCount);
            }
        }

        countMap.entrySet().forEach(letter -> System.out.printf("%s -> %d\n", letter.getKey(), letter.getValue()));
    }
}
