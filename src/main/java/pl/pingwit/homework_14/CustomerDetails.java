package pl.pingwit.homework_14;

import java.time.LocalDate;
import java.util.Objects;

public class CustomerDetails {
    @DefaultValue
    String name;
    @DefaultValue
    String surname;
    @DefaultValue
    @Email
    String email;
    @DefaultValue
    @OnlyDigits
    String phone;
    @DefaultValue
    LocalDate registrationDate;
    @DefaultValue
    Integer priorityLevel;

    public CustomerDetails(String name, String surname, String email, String phone, LocalDate registrationDate, Integer priorityLevel) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.registrationDate = registrationDate;
        this.priorityLevel = priorityLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDetails that = (CustomerDetails) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(registrationDate, that.registrationDate) && Objects.equals(priorityLevel, that.priorityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, phone, registrationDate, priorityLevel);
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", registrationDate=" + registrationDate +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
