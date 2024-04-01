package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = people / capacity;

        if (people % capacity != 0) {
            courses += 1;
        }

        //Alternative solution
        //int courses = (int) Math.ceil((double) people / capacity);

        System.out.println(courses);
    }
}