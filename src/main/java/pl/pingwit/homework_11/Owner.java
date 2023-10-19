package pl.pingwit.homework_11;

import java.util.Objects;

public class Owner {
    private final String name;
    private final String surname;
    private final String phoneNumber;
    private final String email;

    public Owner(String name, String surname, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(name, owner.name) && Objects.equals(surname, owner.surname) && Objects.equals(phoneNumber, owner.phoneNumber) && Objects.equals(email, owner.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

