package pl.pingwit.homework_18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FootballApplication {
    public static void main(String[] args) {
        List<FootballClass> footballList = new ArrayList<>();

        FootballClass footballClass1 = new FootballClass("Manchester", "Great Britain", "Manchester");
        FootballClass footballClass2 = new FootballClass("Chelsi", "Italy", "Rim");
        FootballClass footballClass3 = new FootballClass("Dinamo", "Belarus", "Minsk");
        FootballClass footballClass4 = new FootballClass("Real Madrid", "Spain", "Madrid");
        FootballClass footballClass5 = new FootballClass("Barcelona", "Spain", "Barcelona");
        FootballClass footballClass6 = new FootballClass("Inter", "Italy", "Venecia");

        footballList.add(footballClass1);
        footballList.add(footballClass2);
        footballList.add(footballClass3);
        footballList.add(footballClass4);
        footballList.add(footballClass5);
        footballList.add(footballClass6);

        Set<String> country = findCountry(footballList);
        System.out.println(country);

    }

    public static Set<String> findCountry(List<FootballClass> footballClassList) {
        Set<String> country = new HashSet<>();
        for (FootballClass footballClass : footballClassList) {
            String countries = footballClass.getCountry();
            country.add(countries);
        }
        return country;
    }
}
