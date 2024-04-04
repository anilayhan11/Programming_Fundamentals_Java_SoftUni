package U6_ObjectsAndClasses.L2_Exercise.P05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsePower = Integer.parseInt(input.split(" ")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleList.add(vehicle);

            input = scanner.nextLine();
        }

        String enterModel = scanner.nextLine();
        while (!enterModel.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(enterModel)) {
                    System.out.println(vehicle);
                    break;
                }
            }

            enterModel = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.\n", getAverageHP(vehicleList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHP(vehicleList, "trucks"));
    }

    private static double getAverageHP(List<Vehicle> vehicleList, String type) {
        double sum = 0.00;
        int count = 0;

        if (type.equals("cars")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }

        } else if (type.equals("trucks")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
        }

        if (sum == 0) {
            return 0;
        }

        return sum / count;
    }
}

