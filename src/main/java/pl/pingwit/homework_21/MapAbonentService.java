package pl.pingwit.homework_21;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapAbonentService {
    /*  Task 3
      Напишите сервис с методами:
              -  метод принимает список абонентов, оставляет только не vip и возвращает Map<String, Abonent> - ключ - номер договора, значение - абонент
              -  метод принимает список абонентов и группирует их по городам*/
    public Map<String, List<Abonent>> groupByCityService(List<Abonent> abonents) {
        Map<String, List<Abonent>> abonentByCity = abonents.stream()
                .collect(Collectors.groupingBy(Abonent::getCity));
        return abonentByCity;
    }

    public Map<String, Abonent> contractIdService(List<Abonent> abonents) {
        Map<String, Abonent> abonentsContracts = abonents.stream()
                .filter(abonent -> abonent.getVip().equals(false))
                .collect(Collectors.toMap(Abonent::getContractId, Function.identity()));
        return abonentsContracts;
    }
}
