package pl.pingwit.homework_13.person;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonParser {

    public Person[] personParsing(String stringOfPersons) {
        String[] personsObject = stringOfPersons.split(";");
        Person[] people = new Person[personsObject.length];

        String name = null;
        String surname = null;
        LocalDate datefBirthDay = null;

        for (int i = 0; i < personsObject.length; i++) {
            DayOfWeek day = null;
            String[] varPerson = personsObject[i].split(",");
            for (int j = 0; j < varPerson.length; j++) {
                try {
                    switch (j) {
                        case 0 -> name = varPerson[j].trim();
                        case 1 -> surname = varPerson[j].trim();
                        case 2 -> day = DayOfWeek.of((Integer.parseInt(varPerson[j].trim())));
                        case 3 ->
                                datefBirthDay = LocalDate.parse(varPerson[j].trim(), DateTimeFormatter.ofPattern("yyyy-dd-MM"));
                    }
                } catch (DateTimeException e) {
                    System.out.println("Ошибка :" + varPerson[i] + " " + e.getMessage());
                }
                people[i] = new Person(name, surname, day, datefBirthDay);
            }
        }
        return people;
    }
}
