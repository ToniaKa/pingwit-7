package pl.pingwit.homework_16;

import java.io.Serializable;

public class Motorcycle implements Serializable {
    private String brand;
    private String model;
    private Double engineVolume;
    private transient String condition;

    public Motorcycle(String brand, String model, Double engineVolume, String condition) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.condition = condition;
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

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", condition='" + condition + '\'' +
                '}';
    }
}
