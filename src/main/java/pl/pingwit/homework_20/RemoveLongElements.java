package pl.pingwit.homework_20;

import java.util.ArrayList;
import java.util.List;

public class RemoveLongElements {
    public static void main(String[] args) {
        /*Task 1. (filter)
        Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов*/

        List<String> capitals = new ArrayList<>();
        capitals.add("Minsk");
        capitals.add("Bratislava");
        capitals.add("Vena");
        capitals.add("Madrid");
        capitals.add("Warsaw");
        capitals.add("Kiev");

        List<String> capitalsStream = capitals.stream()
                .filter(word -> word.length() <= 5)
                .toList();
        System.out.println(capitalsStream);

    }
}
