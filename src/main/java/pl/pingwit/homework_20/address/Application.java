package pl.pingwit.homework_20.address;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        /*Task 2.
        Возьмите класс Address и создайте список адресов. (в списке сделайте повторяющиеся адреса, несколько адресов в одном городе,
        несколько адресов на одной улице, улицы с одинаковыми названиями в разных городах)
        Найдите в списке все адреса из города Киев и соберите их в список.*/

        Address address1 = new Address("Kiev", "Shevchenko", 20, 50);
        Address address2 = new Address("Minsk", "Shevchenko", 20, 50);
        Address address3 = new Address("Brest", "Masherova", 15, 12);
        Address address4 = new Address("Brest", "Masherova", 17, 48);
        Address address5 = new Address("Brest", "Varshavskaya", 77, 124);
        Address address6 = new Address("Kiev", "Shevchenko", 20, 50);
        Address address7 = new Address("Kiev", "Pobedy", 14, 85);
        Address address8 = new Address("Brest", "Shevchenko", 24, 24);
        Address address9 = new Address("Warsaw", "Pulavskaya", 5, 89);
        Address address10 = new Address("Warsaw", "Vilyanuvskaya", 115, 4);

        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        addresses.add(address4);
        addresses.add(address5);
        addresses.add(address6);
        addresses.add(address7);
        addresses.add(address8);
        addresses.add(address9);
        addresses.add(address10);

        List<Address> cityKievList = addresses.stream()
                .filter(address -> address.getCity().equals("Kiev"))
                .toList();
        System.out.println(cityKievList);

        /*Task 3.
        Возьмите класс Address и создайте список адресов. (в списке сделайте повторяющиеся адреса, несколько адресов в одном городе,
        несколько адресов на одной улице)
        Найдите в списке все названия улиц и соберите их в список.*/

        List<String> streetsList = addresses.stream()
                .map(Address::getStreet)
                .toList();
        System.out.println(streetsList);

       /* Task 4.
        Возьмите класс Address и создайте список адресов. (в списке сделайте повторяющиеся адреса, несколько адресов в одном городе,
        несколько адресов на одной улице)
        Найдите в списке уникальные города и соберите их в список.*/

        List<String> uniqueCity = addresses.stream()
                .map(city -> city.getCity())
                .distinct()
                .toList();
        System.out.println(uniqueCity);

      /*  Task 5.
        Возьмите класс Address и создайте список адресов. (в списке сделайте повторяющиеся адреса, несколько адресов в одном городе,
        несколько адресов на одной улице)
        Преобразуйте адреса в объекты типа CityStreet, оставьте только те, у которых городе - Варшава и соберите в set.*/

        Set<CityStreet> warsawCity = addresses.stream()
                .map(address -> new CityStreet(address.getCity(), address.getStreet()))
                .filter(cityStreet -> cityStreet.getCity().equals("Warsaw"))
                .collect(Collectors.toSet());
        System.out.println(warsawCity);

        /*Task 6.
        Возьмите класс Address и создайте список адресов. (в списке сделайте повторяющиеся адреса, несколько адресов в одном городе,
        несколько адресов на одной улице)
        Преобразуйте адреса в объекты типа CityStreet, оставьте только те, у которых городе - Киев. Далее для каждой записи
        выведите в консоль: "улица: " + cityStreet*/

        addresses.stream()
                .map(address -> new CityStreet(address.getCity(), address.getStreet()))
                .filter(cityStreet -> cityStreet.getCity().equals("Kiev"))
                .forEach(print -> System.out.println("улица: " + print.getStreet()));
    }
}
