package U7_AssociativeArrays.L1_Lab;

import java.util.*;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPairs = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordSynonimsMap = new LinkedHashMap<>();

        for (int i = 0; i <= numPairs - 1; i++) {
            String wordKey = scanner.nextLine();
            String synonymValue = scanner.nextLine();

            wordSynonimsMap.putIfAbsent(wordKey, new ArrayList<>());
            wordSynonimsMap.get(wordKey).add(synonymValue);
        }

        for (Map.Entry<String, List<String>> pair : wordSynonimsMap.entrySet()) {
            String word = pair.getKey();
            List<String> synonyms = pair.getValue();

            System.out.println(word + " - " + String.join(", ", synonyms));
        }
    }
}
