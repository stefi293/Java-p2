package lab2.model;

public class Car implements Vehicle {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;

    }
    public String getBrand() {
        return brand;
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public String getColor() {
        return color;
    }
}