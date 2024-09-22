package org.example;

public class Truck {
    private int id;
    private String name;
    private String model;
    private String driver_name;
    private int capacity;

    Truck()
    {

    }

    public Truck(String name, String model, int capacity, String driver_name) {
        this.name = name;
        this.model = model;
        this.driver_name = driver_name;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", driver_name='" + driver_name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
