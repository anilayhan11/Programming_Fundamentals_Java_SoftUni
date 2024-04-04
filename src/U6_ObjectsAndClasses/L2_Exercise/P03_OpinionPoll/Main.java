package U6_ObjectsAndClasses.L2_Exercise.P03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3. Develop logic in Main method
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i <= inputCount - 1; i++) {
            String[] personalInfo = scanner.nextLine().split(" ");

            String name = personalInfo[0];
            int age = Integer.parseInt(personalInfo[1]);

            if (age > 30) {
                //Create new object of the class Person using constructor.
                Person person = new Person(name, age);

                peopleList.add(person);
            }
        }

        for (Person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}


