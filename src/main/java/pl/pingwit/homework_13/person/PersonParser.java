package pl.pingwit.homework_13.person;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class PersonParser {
    public Person[] people(String text) {
        String[] item = text.split(";");
        Person[] people = new Person[item.length];
        for (int i = 0; i < item.length; i++) {
            people[i] = pars(item[i]);
        }
        return people;
    }

    private Person pars(String text) {

        String[] g = text.split(",");
        String n = g[0].trim();
        String su = g[1].trim();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        LocalDate b = LocalDate.parse(g[3].trim(), dateTimeFormatter);
        DayOfWeek d=null;

       try {
            d = DayOfWeek.of(Integer.parseInt(g[2].trim()));
       }catch (DateTimeException e){
           System.out.println(e.getMessage());
       }
        return new Person (n,su,b,d);
    }
}
