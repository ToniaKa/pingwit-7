package pl.pingwit.homework_21;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListAbonentServiceTest {
    ListAbonentService listAbonentService = new ListAbonentService();

    @Test
    void shoudReturnExceptionWhenCityNull() {
        //given
        Abonent abonent1 = new Abonent("Ivan", "Petrov", "1234", LocalDate.of(2000, 10, 17), LocalDate.of(2019, 10, 10), false, "Minsk");
        Abonent abonent2 = new Abonent("Lev", "Ivanov", "567", LocalDate.of(1992, 1, 11), LocalDate.of(2016, 12, 28), true, "Kiev");
        Abonent abonent3 = new Abonent("Egor", "Sidorov", "1234-kk", LocalDate.of(1984, 6, 1), LocalDate.of(2009, 1, 1), true, "Warsaw");
        Abonent abonent4 = new Abonent("Inna", "Petrova", "88012", LocalDate.of(1979, 12, 14), LocalDate.of(2019, 6, 17), false, "Minsk");
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        abonents.add(abonent3);
        abonents.add(abonent4);
        String expectedMessage = "В данном городе абонентов нет!";

        //when
        RuntimeException exception = assertThrows(RuntimeException.class, () -> listAbonentService.getAnyAbonentFromCity(abonents, null));

        //then
        assertThat(exception.getMessage()).isEqualTo(expectedMessage);
    }

    @Test
    void shoudReturnAbonentFromCityKiev() {
        //given
        Abonent abonent1 = new Abonent("Ivan", "Petrov", "1234", LocalDate.of(2000, 10, 17), LocalDate.of(2019, 10, 10), false, "Minsk");
        Abonent abonent2 = new Abonent("Lev", "Ivanov", "567", LocalDate.of(1992, 1, 11), LocalDate.of(2016, 12, 28), true, "Kiev");
        Abonent abonent3 = new Abonent("Egor", "Sidorov", "1234-kk", LocalDate.of(1984, 6, 1), LocalDate.of(2009, 1, 1), true, "Warsaw");
        Abonent abonent4 = new Abonent("Inna", "Petrova", "88012", LocalDate.of(1979, 12, 14), LocalDate.of(2019, 6, 17), false, "Minsk");
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        abonents.add(abonent3);
        abonents.add(abonent4);
        Optional<Abonent> expected = Optional.of(new Abonent("Lev", "Ivanov", "567", LocalDate.of(1992, 1, 11), LocalDate.of(2016, 12, 28), true, "Kiev"));

        //when
        Optional<Abonent> actual = listAbonentService.getAnyAbonentFromCity(abonents, "Kiev");

        //then
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void shouldReturnFalseWhenAnyAbonentsConnectedLaterContractDate() {
        //given
        Abonent abonent1 = new Abonent("Ivan", "Petrov", "1234", LocalDate.of(2000, 10, 17), LocalDate.of(2009, 10, 10), false, "Minsk");
        Abonent abonent2 = new Abonent("Lev", "Ivanov", "567", LocalDate.of(1992, 1, 11), LocalDate.of(2016, 12, 11), true, "Kiev");
        Abonent abonent3 = new Abonent("Egor", "Sidorov", "1234-kk", LocalDate.of(1984, 6, 1), LocalDate.of(2009, 1, 1), true, "Warsaw");
        Abonent abonent4 = new Abonent("Inna", "Petrova", "88012", LocalDate.of(1979, 12, 14), LocalDate.of(2019, 6, 17), false, "Minsk");
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        abonents.add(abonent3);
        abonents.add(abonent4);

        //when
        boolean actual = listAbonentService.allContractedBefore(abonents, LocalDate.of(2016, 12, 12));

        //then
        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnTrueWhenAllAbonentsConnectedLaterContractDate() {
        //given
        Abonent abonent1 = new Abonent("Ivan", "Petrov", "1234", LocalDate.of(2000, 10, 17), LocalDate.of(2009, 10, 10), false, "Minsk");
        Abonent abonent2 = new Abonent("Lev", "Ivanov", "567", LocalDate.of(1992, 1, 11), LocalDate.of(2016, 12, 11), true, "Kiev");
        Abonent abonent3 = new Abonent("Egor", "Sidorov", "1234-kk", LocalDate.of(1984, 6, 1), LocalDate.of(2009, 1, 1), true, "Warsaw");
        Abonent abonent4 = new Abonent("Inna", "Petrova", "88012", LocalDate.of(1979, 12, 14), LocalDate.of(2009, 6, 17), false, "Minsk");
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        abonents.add(abonent3);
        abonents.add(abonent4);

        //when
        boolean actual = listAbonentService.allContractedBefore(abonents, LocalDate.of(2016, 12, 12));

        //then
        assertThat(actual).isTrue();
    }
}