package pl.pingwit.homework_17;

import pl.pingwit.homework_11.veterinaryClinic.Pet;

import java.util.Arrays;

public class GenericPet<T extends Pet> {
    private T[] pets;

    public GenericPet(T[] pets) {
        this.pets = pets;
    }

    public T[] getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "PetBox{" +
                "pets=" + Arrays.toString(pets) +
                '}';
    }
}
