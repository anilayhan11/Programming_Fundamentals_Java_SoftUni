package U7_AssociativeArrays.L1_Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> countsMap = new LinkedHashMap<>();

        for (String word : inputArr) {
            word = word.toLowerCase();

            if (!countsMap.containsKey(word)) {
                countsMap.put(word, 1);

            } else {
                countsMap.put(word, countsMap.get(word) + 1);
            }

            /*Another way to fill in the map
                wordsMap.putIfAbsent(word, 0);
                wordsMap.put(word, wordsMap.get(word) + 1);
            */
        }

        ArrayList<String> oddsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddsList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddsList));
    }
}
