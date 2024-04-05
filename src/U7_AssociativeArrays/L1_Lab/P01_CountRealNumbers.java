package U7_AssociativeArrays.L1_Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01_CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersInputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        TreeMap<Integer, Integer> numberReadMap = new TreeMap<>();

        for (int num : numbersInputArr) {
            if (!numberReadMap.containsKey(num)) {
                numberReadMap.put(num, 1);

            } else {
                int currentCount = numberReadMap.get(num);
                numberReadMap.replace(num, currentCount + 1);
            }
        }
        for (Map.Entry<Integer, Integer> pair : numberReadMap.entrySet()) {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }
}
