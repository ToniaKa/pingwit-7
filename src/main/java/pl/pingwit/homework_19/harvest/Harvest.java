package pl.pingwit.homework_19.harvest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class Harvest {

    @JsonProperty("field_xms")
    private String field;

    @JsonProperty("square_xms")
    private BigDecimal square;
    private String plant;
    private BigDecimal weight;

    public Harvest() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public BigDecimal getSquare() {
        return square;
    }

    public void setSquare(BigDecimal square) {
        this.square = square;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Harvest(String field, BigDecimal square, String plant, BigDecimal weight) {
        this.field = field;
        this.square = square;
        this.plant = plant;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Harvest harvest = (Harvest) o;
        return Objects.equals(field, harvest.field) && Objects.equals(square, harvest.square) && Objects.equals(plant, harvest.plant) && Objects.equals(weight, harvest.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, square, plant, weight);
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "field='" + field + '\'' +
                ", square=" + square +
                ", plant='" + plant + '\'' +
                ", weight=" + weight +
                '}';
    }
}
