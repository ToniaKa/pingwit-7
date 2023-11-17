package pl.pingwit.homework_13.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Application {
    private static final String text ="Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
    private static final String text2 = "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
    public static void main(String[] args) {

        PersonParser pop=new PersonParser();

        PersonParser pop2=new PersonParser();

        System.out.println(Arrays.toString(pop.people(text)));
        System.out.println(Arrays.toString(pop2.people(text2)));








    }
}
