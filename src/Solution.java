import java.util.Arrays;
import java.util.Scanner;

class Solution {
// you can also use imports, for example:
// import java.util.*;

    // you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Read array
        int[] numArr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        // Find min positive number
        int minNum = 1;
        for (int i = 0; i <= numArr.length - 1; i++) {
            if (numArr[i] == minNum) {
                minNum += 1;
                i = 0;
            }
        }
        //Print result
        System.out.println(minNum);
    }
}
