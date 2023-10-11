package pl.pingwit.homework_7.car;

public class Car {
    private String brand;
    private String model;
    private Integer numberOfDoors;

    public Car(String brand, String model, Integer numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
