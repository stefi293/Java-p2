package lab2.model;

public class Bicycle implements  Vehicle{
    private String brand;
    private String color;

    public Bicycle(String brand, String color) {
        this.brand = brand;
        this.color = color;

    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String getType() {
        return "Bicycle";
    }

    @Override
    public String getColor() {
        return color;
    }
}