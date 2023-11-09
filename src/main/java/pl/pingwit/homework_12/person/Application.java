package pl.pingwit.homework_12.person;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("Тоня", "Казловская");
        Person person1 = new Person("Тоня", "Казловская");

        PersonReverser stringUtilsPersonReverser = new StringUtilsPersonReverser();
        PersonReverser arrayPersonReverser = new ArrayPersonReverser();

        System.out.println(stringUtilsPersonReverser.reversPerson(person));
        System.out.println(arrayPersonReverser.reversPerson(person1));

        System.out.println(person.equals(person1));
        System.out.println(stringUtilsPersonReverser.equals(arrayPersonReverser));
    }
}
