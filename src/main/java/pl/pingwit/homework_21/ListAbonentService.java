package pl.pingwit.homework_21;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ListAbonentService {
    /* Task 1
     Напишите сервис с несколькими методами для работы со списком абонентов:
             -  метод должен принять список абонентов и город, а вернуть true есть ли в этом городе хоть один вип-абонент (иначе вернуть false) (anyMatch)
             -  метод должен принять список обонентов и дату, а вернуть true если все аюоненты в списке подключились до этой даты (allMatch)
             -  метод должен принять список абонентов и город, и вернуть любого абонента из этого города, а если из этого города абонентов нет - выбросить исключение (findAny, optional)*/
    public boolean isVip(List<Abonent> abonents, String city) {
        return abonents.stream()
                .anyMatch(abonent -> abonent.getVip().equals(true) && abonent.getCity().equals(city));
    }

    public boolean isAllowedDate(List<Abonent> abonents, LocalDate contractDate) {
        return abonents.stream()
                .allMatch(abonent -> abonent.getContractDate().isBefore(contractDate));
    }

    public Optional<Abonent> getAnyAbonent(List<Abonent> abonents, String city) {
        Abonent abonent = abonents.stream()
                .findAny()
                .filter(anyAbonent -> anyAbonent.getCity().equals(city))
                .orElseThrow(() -> new RuntimeException("В данном городе абонентов нет!"));
        return Optional.ofNullable(abonent);
    }
}


