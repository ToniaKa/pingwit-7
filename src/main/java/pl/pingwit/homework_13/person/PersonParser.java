package pl.pingwit.homework_13.person;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonParser {
    public Person[] personParser(String text) {
        String[] item = text.split(";");
        Person[] splitOfPerson = new Person[item.length];
        for (int i = 0; i < item.length; i++) {
            splitOfPerson[i] = itemParser(item[i]);
        }
        return splitOfPerson;
    }

    private Person itemParser(String text) {

        String[] strings = text.split(",");
        String name = strings[0].trim();
        String surname = strings[1].trim();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        LocalDate dayOfBirth = LocalDate.parse(strings[3].trim(), dateTimeFormatter);
        DayOfWeek dayOfWeek=null;

       try {
            dayOfWeek = DayOfWeek.of(Integer.parseInt(strings[2].trim()));
       }catch (DateTimeException e){
           System.out.println(e.getMessage());
       }
        return new Person (name,surname,dayOfBirth,dayOfWeek);
    }
}
