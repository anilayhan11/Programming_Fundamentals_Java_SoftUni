package U5_Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04_MixedUpLists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mixedList = new ArrayList<>();

        Collections.reverse(secondList);

        int minListSize = (Math.min(firstList.size(), secondList.size()));
        for (int i = 0; i <= minListSize - 1; i++) {
            mixedList.add(firstList.get(i));
            mixedList.add(secondList.get(i));
        }

        int elementForFrameFirst = 0;
        int elementForFrameSecond = 0;

        if (firstList.size() == minListSize) {
            elementForFrameFirst = secondList.get(minListSize);
            elementForFrameSecond = secondList.get(minListSize + 1);
        } else {
            elementForFrameFirst = firstList.get(minListSize);
            elementForFrameSecond = firstList.get(minListSize + 1);
        }

        int minNumber = Math.min(elementForFrameFirst, elementForFrameSecond);
        int maxNumber = Math.max(elementForFrameFirst, elementForFrameSecond);

        List<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i <= mixedList.size() - 1; i++) {
            int currentNum = mixedList.get(i);
            if (currentNum > minNumber && currentNum < maxNumber) {
                sortedList.add(currentNum);
            }
        }
        Collections.sort(sortedList);
        System.out.print(sortedList.toString().replaceAll("[\\]\\[,]", ""));

    }
}
