package pl.pingwit.homework_13.person;

import java.util.Arrays;

public class Application {
    private static final String text ="Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
    private static final String text2 = "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
    public static void main(String[] args) {

        PersonParser person=new PersonParser();
        PersonParser newPerson=new PersonParser();

        System.out.println(Arrays.toString(person.personParser(text)));
        System.out.println(Arrays.toString(newPerson.personParser(text2)));








    }
}
