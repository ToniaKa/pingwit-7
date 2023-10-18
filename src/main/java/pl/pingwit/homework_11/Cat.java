package pl.pingwit.homework_11;

import java.util.Objects;

public class Cat extends Pet {
    private final String breed; //порода
    private final Double temperature;

    public Cat(Long id, String name, Owner owner, String breed, Double temperature) {
        super(id, name, owner);
        this.breed = breed;
        this.temperature = temperature;
    }

    public String getBreed() {
        return breed;
    }

    public Double getTemperature() {
        return temperature;
    }

    public final String toOtherInformation() {
        return String.format("Питомец %s породы %s, с температурой %s", getName(), breed, temperature);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed) && Objects.equals(temperature, cat.temperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed, temperature);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}



