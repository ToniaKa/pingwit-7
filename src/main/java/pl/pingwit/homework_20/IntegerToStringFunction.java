package pl.pingwit.homework_20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class IntegerToStringFunction {
    public static void main(String[] args) {
         /* Task 8
        Написать функцию перевода числа в строку с добавлением денежной единицы. Например, 5 -> 5 рублей.
        Если получится, то учесть правильность окончаний, если нет, то можно сократить до "руб".*/

        Function<Integer, String> integerStringFunction = integer -> integer.toString().concat(" руб.");

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(5);

        List<String> strings = integers.stream()
                .map(integerStringFunction)
                .toList();
        System.out.println(strings);
    }
}
