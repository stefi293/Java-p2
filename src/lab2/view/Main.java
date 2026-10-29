package lab2.view;

import lab2.controller.Controller;
import lab2.model.Bicycle;
import lab2.model.Car;
import lab2.model.Motorcycle;
import lab2.model.Vehicle;
import lab2.repository.IMRepository;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try {
            IMRepository repo = new IMRepository(20);

            Controller controller = new Controller(repo);

            controller.addVehicle(new Car("Seat", "red"));
            controller.addVehicle(new Car("Ford", "blue"));
            controller.addVehicle(new Motorcycle("Yamaha", "RED"));
            controller.addVehicle(new Motorcycle("Honda", "black"));
            controller.addVehicle(new Bicycle("Canyon", "Red"));
            controller.addVehicle(new Bicycle("Trek", "Purple"));


            System.out.println("Red vehicles:");
            Vehicle[] redVehicles = controller.getRedVehicles();

            for (Vehicle v : redVehicles) {
                System.out.println(v.getType() + " " + v.getBrand() + " " + "Color: " + v.getColor().toLowerCase(Locale.ROOT));
            }

            Car carToRemove = new Car("BMW", "white");
            controller.addVehicle(carToRemove);

            System.out.println("Vehicles in repository before removing BMW:");
            for (Vehicle v : controller.getAllVehicles()) {
                System.out.println(v.getBrand() + " " + v.getType() + " " + v.getColor());
            }

            controller.removeVehicle(carToRemove);
            System.out.println("\nSuccessfully removed the BMW.");

            System.out.println("Vehicles in repository after removing BMW:");
            for (Vehicle v : controller.getAllVehicles()) {
                System.out.println(v.getBrand() + " " + v.getType() + " " + v.getColor());
            }

            ///System.out.println("Trying to remove a non-existent car:");
            ///controller.removeVehicle(new Car("GhostCar", "purple"));

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}