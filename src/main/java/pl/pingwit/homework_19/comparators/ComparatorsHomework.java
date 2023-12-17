package pl.pingwit.homework_19.comparators;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

/**
 * @author Pavel Radkevich
 */
/*
Отсортируйте список данных по имени и фамлии пользователя, выведите в консоль
Отсортируйте список данных по дате рождения в порядке убывания, выведите в консоль
Отсортируйте список данных по имени, фамилии, дате рождения, выведите в консоль
 */

public class ComparatorsHomework {

    public static void main(String[] args) {
        List<AccountInfo> accountInfos = new java.util.ArrayList<>(List.of(
                new AccountInfo("Ivan", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Fedor", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(1990, 10, 11)),
                new AccountInfo("Anna", "Ivanova", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 15)),
                new AccountInfo("Egor", "Egorov", "607499636tr", "ivan@tu.by", LocalDate.of(1989, 2, 3)),
                new AccountInfo("Andy23", "Aity", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Pavel", "Pavlov23", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11))));

        Comparator<AccountInfo> sortByName = Comparator.comparing(AccountInfo::getName);
        Comparator<AccountInfo> sortBySurname = Comparator.comparing(AccountInfo::getSurname);
        Comparator<AccountInfo> accountInfoComparator = sortByName.thenComparing(sortBySurname);

        accountInfos.sort(accountInfoComparator);
        System.out.println(accountInfos);

        Comparator<AccountInfo> sortByBirthDay = Comparator.comparing(AccountInfo::getDateOfBirth).reversed();
        accountInfos.sort(sortByBirthDay);
        System.out.println(accountInfos);

        Comparator<AccountInfo> sortByNameSurnameBirthDay = Comparator.comparing(AccountInfo::getName).thenComparing(sortBySurname).thenComparing(sortByBirthDay);
        accountInfos.sort(sortByNameSurnameBirthDay);
        System.out.println(accountInfos);
    }
}
