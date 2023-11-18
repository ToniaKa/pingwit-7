package pl.pingwit.homework_13.person;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String person = "Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10; " + "Tonya, Kazlovskaya, 5, 1991-14-04";

        String exceptionPerson = "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";

        PersonParser newPerson = new PersonParser();
        PersonParser anyPerson = new PersonParser();

        Person[] people = anyPerson.personParsing(exceptionPerson);
        Person[] persons = newPerson.personParsing(person);

        Person[][] arrayPeople = {people, persons};
        for (Person[] objectsPeople : arrayPeople) {
            System.out.println(Arrays.toString(objectsPeople));
        }
    }
}
