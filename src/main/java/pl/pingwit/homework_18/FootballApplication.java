package pl.pingwit.homework_18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FootballApplication {
    public static void main(String[] args) {
        List<FootballClub> footballList = new ArrayList<>();

        FootballClub footballClub1 = new FootballClub("Manchester", "Great Britain", "Manchester");
        FootballClub footballClub2 = new FootballClub("Chelsi", "Italy", "Rim");
        FootballClub footballClub3 = new FootballClub("Dinamo", "Belarus", "Minsk");
        FootballClub footballClub4 = new FootballClub("Real Madrid", "Spain", "Madrid");
        FootballClub footballClub5 = new FootballClub("Barcelona", "Spain", "Barcelona");
        FootballClub footballClub6 = new FootballClub("Inter", "Italy", "Venecia");

        footballList.add(footballClub1);
        footballList.add(footballClub2);
        footballList.add(footballClub3);
        footballList.add(footballClub4);
        footballList.add(footballClub5);
        footballList.add(footballClub6);

        Set<String> country = findCountry(footballList);
        System.out.println(country);

    }

    public static Set<String> findCountry(List<FootballClub> footballClubList) {
        Set<String> countries = new HashSet<>(); // в этой переменной хранится много стран, нужно использовать множественное число
        for (FootballClub footballClass : footballClubList) {
            String country = footballClass.country(); // в переменной хранится одна страна, лучше переименовать
            countries.add(country);
        }
        return countries;
    }
}
