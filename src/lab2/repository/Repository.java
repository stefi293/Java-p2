package lab2.repository;
import lab2.model.Vehicle;

public interface Repository {
    void add(Vehicle vehicle) throws Exception;
    void remove(Vehicle vehicle) throws Exception;
    Vehicle[] getAll();
}
