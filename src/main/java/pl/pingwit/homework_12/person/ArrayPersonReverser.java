package pl.pingwit.homework_12.person;

import java.util.Arrays;

public class ArrayPersonReverser implements PersonReverser {
    @Override
    public Person reversPerson(Person person) {
        char[] charName = person.getName().toCharArray();
        char[] charSurname = person.getSurname().toCharArray();

        char[] newCharName = new char[charName.length];
        char[] newCharSurname2 = new char[charSurname.length];

        for (int i = charName.length - 1; i >= 0; i--) {
            newCharName[charName.length - 1 - i] = charName[i];
        }
        for (int i = charSurname.length - 1; i >= 0; i--) {
            newCharSurname2[charSurname.length - 1 - i] = charSurname[i];
        }
        String name = Arrays.toString(newCharName);
        String surname = Arrays.toString(newCharSurname2);

        return new Person(name, surname);
    }
}
