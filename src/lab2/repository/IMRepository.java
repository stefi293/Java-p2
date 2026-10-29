package lab2.repository;

import lab2.model.Vehicle;

public class IMRepository implements Repository {
    private final Vehicle[] elements;
    private int size;

    public IMRepository(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Repository capacity must be greater than 0.");
        }
        elements = new Vehicle[capacity];
        size = 0;
    }

    @Override
    public void add(Vehicle vehicle) throws Exception {
        if (size >= elements.length) {
            throw new Exception("Repository is full. Cannot add more items.");
        }
        elements[size] = vehicle;
        size++;
    }

    @Override
    public void remove(Vehicle vehicle) throws Exception {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(vehicle)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new Exception("Vehicle not found in the repository.");
        }

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    @Override
    public Vehicle[] getAll() {
        Vehicle[] currentElements = new Vehicle[size];
        System.arraycopy(elements, 0, currentElements, 0, size);
        return currentElements;
    }
}