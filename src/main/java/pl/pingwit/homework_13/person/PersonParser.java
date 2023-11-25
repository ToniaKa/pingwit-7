package pl.pingwit.homework_13.person;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonParser {

    public Person[] personParsing(String stringOfPersons) {
        String[] personsStrings = stringOfPersons.split(";"); // название можно улучшить, personStrings лучше отобразит суть
        Person[] people = new Person[personsStrings.length];

        // эти переменные лучше объявить внутри цикла. их значение меняется с каждой итерацией, поэтому нет смысла их помечать снаружи
        //String name = null;
        //String surname = null;
        //LocalDate datefBirthDay = null;

        for (int i = 0; i < personsStrings.length; i++) {
            // я посмотрел этот код на свежую голову, и мне он видится слишком сложный. предлагаю альтернативу
            String[] personDataStrings = personsStrings[i].split(",");
            String name = personDataStrings[0];
            String surname = personDataStrings[1];
            DayOfWeek day = DayOfWeek.of(Integer.parseInt(personDataStrings[2].trim()));
            LocalDate datefBirthDay = null;
            try {
                datefBirthDay = LocalDate.parse(personDataStrings[3].trim(), DateTimeFormatter.ofPattern("yyyy-dd-MM"));
            } catch (DateTimeException e) {
                System.out.println("Ошибка :" + personDataStrings[i] + " " + e.getMessage());
            }
            people[i] = new Person(name, surname, day, datefBirthDay);

            String[] varPerson = personsStrings[i].split(",");
           /* for (int j = 0; j < varPerson.length; j++) {
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
            }*/
        }
        return people;
    }
}
