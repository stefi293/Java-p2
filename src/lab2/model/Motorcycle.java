package lab2.model;

public class Motorcycle implements Vehicle {
    private String brand;
    private String color;

    public Motorcycle(String brand, String color) {
        this.brand = brand;
        this.color = color;

    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

    @Override
    public String getColor() {
        return color;
    }
}