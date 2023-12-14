package pl.pingwit.homework_18;

import java.util.Objects;

public class FootballClass {
    private String title;
    private String country;
    private String city;

    public FootballClass(String title, String country, String city) {
        this.title = title;
        this.country = country;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClass that = (FootballClass) o;
        return Objects.equals(title, that.title) && Objects.equals(country, that.country) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, country, city);
    }


    @Override
    public String toString() {
        return "FootballClass{" +
                "title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
