package pl.pingwit.homework_12.person;

import java.util.Arrays;

public class ArrayPersonReverser implements PersonReverser {
    @Override
    public Person reversPerson(Person person) {
        char[] charName = person.getName().toCharArray();
        char[] charSurname = person.getSurname().toCharArray();

        char[] newCharName = new char[charName.length];
        char[] newCharSurname2 = new char[charSurname.length];

        // сейчас результат работы не совсем ожидаемый: Person{name='[я, н, о, Т]', surname='[я, а, к, с, в, о, л, з, а, К]'}
        // я в комментах добавил альтернативное решение
        // StringBuilder newName = new StringBuilder(); -
        for (int i = charName.length - 1; i >= 0; i--) {
            // newName.append(charName[i]);
            newCharName[charName.length - 1 - i] = charName[i];
        }
        // StringBuilder newSurname = new StringBuilder();
        for (int i = charSurname.length - 1; i >= 0; i--) {
            // newSurname.append(charSurname[i]);
            newCharSurname2[charSurname.length - 1 - i] = charSurname[i];
        }
        // return new Person(newName.toString(), newSurname.toString());

        String name = Arrays.toString(newCharName);
        String surname = Arrays.toString(newCharSurname2);
        return new Person(name, surname);
    }
}
