package U6_ObjectsAndClasses.L2_Exercise.P06_OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String name = input.split(" ")[0];
            String ID = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            Person person = new Person(name, ID, age);
            personList.add(person);

            input = scanner.nextLine();
        }

        Collections.sort(personList, Comparator.comparingInt(Person::getAge));

        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.\n", person.getName(), person.getID(), person.getAge());
        }
    }
}
