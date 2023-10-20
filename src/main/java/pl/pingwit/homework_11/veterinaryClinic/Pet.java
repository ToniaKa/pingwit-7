package pl.pingwit.homework_11.veterinaryClinic;

import java.util.Objects;

public class Pet {
    private final Long id;
    private final String name;
    private final Owner owner;

    public Pet(Long id, String name, Owner owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public final String toInformation() { // не хватает лишь одной маленькой детали - нужно запретить классам-наследникам переопределять этот метод

        return String.format("Питомец %s принадлежит %s %s.Контакты хозяина:%s,%s", name, owner.getName(),
                owner.getSurname(), owner.getPhoneNumber(), owner.getEmail());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id) && Objects.equals(name, pet.name) && Objects.equals(owner, pet.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, owner);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}

