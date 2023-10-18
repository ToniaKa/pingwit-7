package pl.pingwit.homework_10.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {  // этот класс валидирует пользователя, поэтому лучше подойдет UserValidator
    private static final Pattern NAME_SURNAME_LETTERS_ONLY = Pattern.compile("[a-zA-Z]*");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private static final Pattern PHONE_DIGIT_ONLY = Pattern.compile("^\\d*");

    public boolean isVallid(UserData person) {  // такой рода методы как правило называют isValid
        if ((person.userName().isEmpty())) {
            System.out.println("Username не может быть пустой строкой");
            return false;
        }

        Matcher nameMatcher = NAME_SURNAME_LETTERS_ONLY.matcher(person.name()); // matcherName -> nameMatcher
        if (!nameMatcher.matches()) {
            System.out.printf("Имя может содержать только буквы.Вы ввели некорректное имя:%s %n", person.name());
            return false;
        }

        // эту проверку нужно доработать по аналогии с проверкой имени
        Matcher surnameMatcher = NAME_SURNAME_LETTERS_ONLY.matcher(person.surname());
        if (!surnameMatcher.matches()) {
            System.out.printf("Фамилия может содержать только буквы.Вы ввели некорректную фамилию:%s ", person.surname());
            return false;
        }

        // эту проверку нужно доработать по аналогии с проверкой имени
        Matcher emailMatcher = EMAIL_PATTERN.matcher(person.email());
        if (!emailMatcher.matches()) {
            System.out.printf("Вы ввели неккоректный email %s ", person.email());
            return false;
        }

        // эту проверку нужно доработать по аналогии с проверкой имени
        Matcher phoneMatcher = PHONE_DIGIT_ONLY.matcher(person.phoneNumber());
        if (!phoneMatcher.matches()) {
            System.out.printf("Номер телефона может содержать только цифры.Вы ввели некорректный номер: %s", person.phoneNumber());
            return false;
        }

        if ((person.password().isEmpty())) {
            System.out.println("Password не может быть пустой строкой");
            return false;
        }

        return true; // делаем return true; тк если код дошел до этой строки, значит все данные пользователя в порядке
        //return isVerifiedPerson;
    }
}

















