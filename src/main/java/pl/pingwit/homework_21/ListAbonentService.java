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
    public boolean cityHasAnyVip(List<Abonent> abonents, String city) { // название для метода можно выбрать поточнее: cityHasAnyVip...
        return abonents.stream()
                .anyMatch(abonent -> abonent.getVip().equals(true) && abonent.getCity().equals(city)); // проверка abonent.getVip().equals(true) избыточна, abonent.getVip() уже вернет true или false. достаточно abonent.getVip() && abonent.getCity().equals(city)
    }

    public boolean allContractedBefore(List<Abonent> abonents, LocalDate contractDate) {// название для метода можно выбрать поточнее: allContractedBefore ..
        return abonents.stream()
                .allMatch(abonent -> abonent.getContractDate().isBefore(contractDate));
    }

    public Optional<Abonent> getAnyAbonentFromCity(List<Abonent> abonents, String city) { // название для метода можно выбрать поточнее: getAnyAbonentFromCity
        Abonent abonent = abonents.stream()
                .filter(anyAbonent -> anyAbonent.getCity().equals(city))
                .findAny() // здесь надо поменять местами findAny vs filter. сейчас, даже если у тебя в списке есть абонент из этого города, но он идет не первым, метод бросит ошибку
                .orElseThrow(() -> new RuntimeException("В данном городе абонентов нет!"));
        return Optional.ofNullable(abonent);
    }
}


