package pl.pingwit.homework_11.veterinaryClinic;

import java.math.BigDecimal;
import java.util.Objects;

public class Dog extends Pet {
    private final Double taillength; //длина хвоста
    private final BigDecimal weight;

    public Dog(Long id, String name, Owner owner, Double taillength, BigDecimal weight) {
        super(id, name, owner);
        this.taillength = taillength;
        this.weight = weight;
    }

    public Double getTaillength() {
        return taillength;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public final String toSay() {
        return String.format("Питомец %s обучен подавать голос", getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(taillength, dog.taillength) && Objects.equals(weight, dog.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taillength, weight);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "taillength=" + taillength +
                ", weight=" + weight +
                ", owner=" + owner +
                '}';
    }
}

