package pl.pingwit.homework_11;

import java.util.Objects;

public class Parrot extends Pet {
    private final String color;
    private final Double beakLength; //длина клюва

    public Parrot(Long id, String name, Owner owner, String color, Double beakLength) {
        super(id, name, owner);
        this.color = color;
        this.beakLength = beakLength;
    }

    public String getColor() {
        return color;
    }

    public Double getBeakLength() {
        return beakLength;
    }

    public final boolean isSay() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(color, parrot.color) && Objects.equals(beakLength, parrot.beakLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, beakLength);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "color='" + color + '\'' +
                ", beakLength=" + beakLength +
                '}';
    }
}

