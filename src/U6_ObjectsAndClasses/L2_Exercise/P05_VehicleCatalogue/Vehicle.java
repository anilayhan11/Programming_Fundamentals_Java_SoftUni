package U6_ObjectsAndClasses.L2_Exercise.P05_VehicleCatalogue;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        String formattedType = "";
        if (this.type.equals("car")) {
            formattedType = "Car";
        } else if (this.type.equals("truck")) {
            formattedType = "Truck";
        }
        return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d", formattedType, this.model, this.color, this.horsePower);
    }
}
