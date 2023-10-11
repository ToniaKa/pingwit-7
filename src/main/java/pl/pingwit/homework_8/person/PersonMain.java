package pl.pingwit.homework_8.person;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", 1984, Gender.MALE, FamilyStatus.SINGLE);
        Person person2 = new Person("Mariya", "Petrova", 1994, Gender.FEMALE, FamilyStatus.SINGLE);
        Person person3 = new Person("Egor", "Rysov", 2008, Gender.MALE, FamilyStatus.SINGLE);
        Person person4 = new Person("Elena", "Kruglova", 1989, Gender.FEMALE, FamilyStatus.MARRIED);
        Person person5 = new Person("Kristina", "Kruglova", 1989, Gender.FEMALE, FamilyStatus.SINGLE);

        Person[] people = {person1, person2, person3, person4, person5};

       ClientDataProcessor dataProcessor = new ClientDataProcessor();
       dataProcessor.process(people);
    }
}




