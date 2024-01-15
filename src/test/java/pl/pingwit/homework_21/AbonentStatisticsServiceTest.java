package pl.pingwit.homework_21;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AbonentStatisticsServiceTest {
    AbonentStatisticsService abonentStatisticsService = new AbonentStatisticsService();

    @Test
    void shouldCountAgeAbonents() {
        //given
        Abonent abonent1 = new Abonent("Ivan", "Petrov", "1234", LocalDate.of(2000, 10, 17), LocalDate.of(2019, 10, 10), false, "Minsk");
        Abonent abonent2 = new Abonent("Ivana", "Petrova", "12345", LocalDate.of(2005, 10, 27), LocalDate.of(2021, 7, 15), true, "Minsk");
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        String expected = "Количество абонентов: 2; cамый юный: 18 лет;  самый возрастной: 23 лет;  средний возраст: 20.5 лет.";

        //when
        String actual = abonentStatisticsService.getAgeStatistic(abonents);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}