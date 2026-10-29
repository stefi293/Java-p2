package lab2.controller;

import lab2.model.Vehicle;
import lab2.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    public void addVehicle(Vehicle vehicle) throws Exception {
        repository.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) throws Exception {
        repository.remove(vehicle);
    }

    public Vehicle[] getRedVehicles() {
        Vehicle[] allVehicles = repository.getAll();

        List<Vehicle> redList = new ArrayList<>();

        for (Vehicle v : allVehicles) {
            if (v != null && "red".equalsIgnoreCase(v.getColor())) {
                redList.add(v);
            }
        }

        return redList.toArray(new Vehicle[0]);
    }

    public Vehicle[] getAllVehicles() { return repository.getAll(); }
}