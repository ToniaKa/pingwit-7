package pl.pingwit.homework_11.veterinaryClinic;

import java.util.Objects;

public class Hamster extends Pet {
    private final Double cheekVolume; //объем щек
    private final Double pawLength;

    public Hamster(Long id, String name, Owner owner, Double cheekVolume, Double pawLength) {
        super(id, name, owner);
        this.cheekVolume = cheekVolume;
        this.pawLength = pawLength;
    }

    public Double getCheekVolume() {
        return cheekVolume;
    }

    public Double getPawLength() {
        return pawLength;
    }

    public final boolean isRodent() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hamster hamster = (Hamster) o;
        return Objects.equals(cheekVolume, hamster.cheekVolume) && Objects.equals(pawLength, hamster.pawLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cheekVolume, pawLength);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "cheekVolume=" + cheekVolume +
                ", pawLength=" + pawLength +
                '}';
    }
}

