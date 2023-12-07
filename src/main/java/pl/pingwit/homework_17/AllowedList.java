package pl.pingwit.homework_17;

import java.util.ArrayList;
import java.util.Scanner;

public class AllowedList {
    public static void main(String[] args) {
        /*Task 1
        Вход на вечеринку только по списку.
        Создайте список имен (коллекция). Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
        после чего говорит может он пройти или нет*/

        ArrayList<String> names = new ArrayList<>();
        names.add("Antanina");
        names.add("Nina");
        names.add("Vika");
        names.add("Victor");
        names.add("Daniil");
        names.add("Ivan");
        names.add("Lev");
        System.out.println(names);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите ваше имя");

        if ((names.contains(scanner.nextLine()))) {
            System.out.println("Ваше имя в списке, пожалуйста проходите!");
        } else {
            System.out.println("К сожалению вашего имени нету в списке, до свидания!");
        }
    }
}
