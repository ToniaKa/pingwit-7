package pl.pingwit.homework_21;

import java.time.LocalDate;
import java.util.Objects;

public class Abonent {
    private final String name;
    private final String surname;
    private final String contractId;// (номер договора)
    private final LocalDate dateOfBirth;
    private final LocalDate contractDate;// (дата заключения контракта)
    private final Boolean isVip; //(пометка, что клиент премиальный)
    private final String city;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getContractId() {
        return contractId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public Boolean getVip() {
        return isVip;
    }

    public String getCity() {
        return city;
    }

    public Abonent(String name, String surname, String contractId, LocalDate dateOfBirth, LocalDate contractDate, Boolean isVip, String city) {
        this.name = name;
        this.surname = surname;
        this.contractId = contractId;
        this.dateOfBirth = dateOfBirth;
        this.contractDate = contractDate;
        this.isVip = isVip;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonent abonent = (Abonent) o;
        return Objects.equals(name, abonent.name) && Objects.equals(surname, abonent.surname) && Objects.equals(contractId, abonent.contractId) && Objects.equals(dateOfBirth, abonent.dateOfBirth) && Objects.equals(contractDate, abonent.contractDate) && Objects.equals(isVip, abonent.isVip) && Objects.equals(city, abonent.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, contractId, dateOfBirth, contractDate, isVip, city);
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractId='" + contractId + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", contractDate=" + contractDate +
                ", isVip=" + isVip +
                ", city='" + city + '\'' +
                '}';
    }
}

