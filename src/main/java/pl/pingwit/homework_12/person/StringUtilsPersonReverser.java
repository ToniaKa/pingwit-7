package pl.pingwit.homework_12.person;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsPersonReverser implements PersonReverser {
    @Override
    public Person reversPerson(Person person) {

        String name = StringUtils.reverse(person.name());
        String surname = StringUtils.reverse(person.surname());

        return new Person(name, surname);
    }
}
