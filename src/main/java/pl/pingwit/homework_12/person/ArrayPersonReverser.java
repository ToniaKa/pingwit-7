package pl.pingwit.homework_12.person;

public class ArrayPersonReverser implements PersonReverser {
    @Override
    public Person reversPerson(Person person) {
        char[] charName = person.name().toCharArray();
        char[] charSurname = person.surname().toCharArray();

        // сейчас результат работы не совсем ожидаемый: Person{name='[я, н, о, Т]', surname='[я, а, к, с, в, о, л, з, а, К]'}
        // я в комментах добавил альтернативное решение

        StringBuilder newName = new StringBuilder();
        for (int i = charName.length - 1; i >= 0; i--) {
            newName.append(charName[i]);
        }
        StringBuilder newSurname = new StringBuilder();
        for (int i = charSurname.length - 1; i >= 0; i--) {
            newSurname.append(charSurname[i]);
        }
        return new Person(newName.toString(), newSurname.toString());
    }
}
