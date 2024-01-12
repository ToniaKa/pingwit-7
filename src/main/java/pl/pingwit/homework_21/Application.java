package pl.pingwit.homework_21;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Abonent abonent1 = new Abonent("Ivan", "Petrov", "1234", LocalDate.of(2000, 10, 17), LocalDate.of(2019, 10, 10), false, "Minsk");
        Abonent abonent2 = new Abonent("Lev", "Ivanov", "567", LocalDate.of(1992, 1, 11), LocalDate.of(2016, 12, 28), true, "Kiev");
        Abonent abonent3 = new Abonent("Egor", "Sidorov", "1234-kk", LocalDate.of(1984, 6, 1), LocalDate.of(2009, 1, 1), true, "Warsaw");
        Abonent abonent4 = new Abonent("Inna", "Petrova", "88012", LocalDate.of(1979, 12, 14), LocalDate.of(2019, 6, 17), false, "Minsk");
        Abonent abonent5 = new Abonent("Irina", "Fedrova", "88-012", LocalDate.of(1974, 12, 14), LocalDate.of(2008, 6, 17), false, "Kiev");
        Abonent abonent6 = new Abonent("Alex", "Alexeev", "128758", LocalDate.of(1989, 12, 14), LocalDate.of(2000, 6, 17), true, "Minsk");
        Abonent abonent7 = new Abonent("Oleg", "Perov", "9854258", LocalDate.of(1999, 12, 14), LocalDate.of(2006, 6, 17), true, "Kiev");
        Abonent abonent8 = new Abonent("Marina", "Perogova", "48844-kk", LocalDate.of(2001, 1, 4), LocalDate.of(2019, 6, 17), false, "Kiev");
        Abonent abonent9 = new Abonent("Igor", "Vileev", "012854", LocalDate.of(1994, 12, 14), LocalDate.of(2018, 6, 17), false, "Vena");
        Abonent abonent10 = new Abonent("Sergey", "Sergeev", "12548", LocalDate.of(1990, 3, 3), LocalDate.of(2015, 12, 12), true, "Kiev");
        Abonent abonent11 = new Abonent("Inna", "Sidorova", "4587/105", LocalDate.of(1981, 12, 14), LocalDate.of(2020, 6, 17), true, "Minsk");

        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        abonents.add(abonent3);
        abonents.add(abonent4);
        abonents.add(abonent5);
        abonents.add(abonent6);
        abonents.add(abonent7);
        abonents.add(abonent8);
        abonents.add(abonent9);
        abonents.add(abonent10);
        abonents.add(abonent11);

        AbonentStatisticsService abonentStatisticsService = new AbonentStatisticsService();
        String abonentAgeStatistic = abonentStatisticsService.getAgeStatistic(abonents);
        System.out.println(abonentAgeStatistic);

        String contractDateStatistic = abonentStatisticsService.getContractDateStatistic(abonents);
        System.out.println(contractDateStatistic);

        MapAbonentService mapAbonentService = new MapAbonentService();
        Map<String, List<Abonent>> abonentsByCity = mapAbonentService.groupByCity(abonents);
        System.out.println(abonentsByCity);

        Map<String, Abonent> contractes = mapAbonentService.mapNonVipByIds(abonents);
        System.out.println(contractes);

        ListAbonentService abonentService = new ListAbonentService();
        boolean isVip = abonentService.cityHasAnyVip(abonents, "Kiev");
        System.out.println(isVip);

        boolean isAllowedDate = abonentService.allContractedBefore(abonents, LocalDate.of(2016, 12, 30));
        System.out.println(isAllowedDate);

        Optional<Abonent> anyAbonent = abonentService.getAnyAbonentFromCity(abonents, "Tomsk");
        System.out.println(anyAbonent);
    }
}
