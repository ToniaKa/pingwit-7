package pl.pingwit.homework_8.person;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private Integer yearOfBirth;
    private Gender gender;
    private FamilyStatus familyStatus;

    public Person(String name, String surname, Integer yearOfBirth, Gender gender, FamilyStatus familyStatus) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.familyStatus = familyStatus;
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

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public FamilyStatus getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(FamilyStatus familyStatus) {
        this.familyStatus = familyStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(yearOfBirth, person.yearOfBirth) && gender == person.gender && familyStatus == person.familyStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfBirth, gender, familyStatus);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender=" + gender +
                ", familyStatus=" + familyStatus +
                '}';
    }
}
