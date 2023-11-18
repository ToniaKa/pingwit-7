package pl.pingwit.homework_13.person;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private DayOfWeek day;
    private LocalDate dateOfBirthDay;

    public Person(String name, String surname, DayOfWeek day, LocalDate datefBirthDay) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.dateOfBirthDay = datefBirthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public LocalDate getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(LocalDate dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", day=" + day +
                ", datefBirthDay=" + dateOfBirthDay +
                '}';
    }
}
