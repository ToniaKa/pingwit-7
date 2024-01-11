package pl.pingwit.homework_21;

import java.time.LocalDate;
import java.time.Period;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AbonentStatisticsService {
/*    Task 2
    Напишите сервис, который будет собирать статистику об абонентах:
            -  метод должен принять список абонентов, вычислять их возраст, и вычислять IntSummaryStatistics.
               Метод дожен вернуть строку-отчет: “Количество абонентов - хх. Самый юный - хх лет, самый возрастной - хх лет, средний возраст - хх лет
               (см пример в pl.pingwit.lec_25.point_2.StatisticsExample)
             -  метод должен принимать список абонентов, отбирать только премиальных клиентов, вычислять, сколько уже длится их контракт и собирать статистику.
                Метод должен возвращать строку - отчет: Количесвто абонентов - жж, самый долгий контракт - хх, средний срок контрактв - хх*/

    public String getAgeStatistic(List<Abonent> abonents) {
        IntSummaryStatistics collect = abonents.stream()// переменную лучше назвать statistics. collect очень не информативно
                .map(Abonent::getDateOfBirth)
                .map(localDate -> localDate.until(LocalDate.now()))
                .collect(Collectors.summarizingInt(Period::getYears));
        return "Количество абонентов: " + collect.getCount()
                + "; cамый юный: " + collect.getMin() + " лет; "
                + " самый возрастной: " + collect.getMax() + " лет; "
                + " средний возраст: " + collect.getAverage() + " лет.";
    }

    public String getContractDateStatistic(List<Abonent> abonents) {
        IntSummaryStatistics collect = abonents.stream()// переменную лучше назвать statistics. collect очень не информативно
                .filter(abonent -> abonent.getVip().equals(true))
                .map(Abonent::getContractDate)
                .map(localDate -> localDate.until(LocalDate.now()))
                .collect(Collectors.summarizingInt(Period::getYears));
        return "Количество абонентов: " + collect.getCount()
                + "; самый долгий контракт: " + collect.getMax() + " лет; "
                + " средний срок контракт: " + collect.getAverage() + " лет.";
    }
}
