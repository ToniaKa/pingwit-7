package pl.pingwit.homework_10.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUser {  // этот класс валидирует пользователя, поэтому лучше подойдет UserValidator
    private static final Pattern NAME_SURNAME_LETTERS_ONLY = Pattern.compile("[a-zA-Z]*");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private static final Pattern PHONE_DIGIT_ONLY = Pattern.compile("^\\d*");

    public boolean isCheckPerson(UserData person) {  // такой рода методы как правило называют isValid
        if ((person.userName().isEmpty())) {
            System.out.println("Username не может быть пустой строкой");
            return false;
        } else {  // блок else здесь не нужен
            person.userName().isEmpty();
        }

        Matcher matcherName = NAME_SURNAME_LETTERS_ONLY.matcher(person.name()); // matcherName -> nameMatcher
        if (matcherName.matches()) {
            // пустой блок if говорит о том, что код можно доработать, см ниже
        } else {
            String messageName = String.format("Имя может содержать только буквы.Вы ввели некорректное имя:%s ", person.name());
            System.out.println(messageName);
            return false;
        }
        /*
        if (!matcherName.matches()) {
            System.out.println(String.format("Имя может содержать только буквы.Вы ввели некорректное имя:%s ", person.name()););
            return false;
        }
         */

        // эту проверку нужно доработать по аналогии с проверкой имени
        Matcher matcherSurname = NAME_SURNAME_LETTERS_ONLY.matcher(person.surname());
        if (matcherSurname.matches()) {

        } else {
            String messageSurname = String.format("Фамилия может содержать только буквы.Вы ввели некорректную фамилию:%s ", person.surname());
            System.out.println(messageSurname);
            return false;
        }

        // эту проверку нужно доработать по аналогии с проверкой имени
        Matcher matcherEmail = EMAIL_PATTERN.matcher(person.email());
        if (matcherEmail.matches()) {
        } else {
            String messageEmail = String.format("Вы ввели неккоректный email %s ", person.email());
            System.out.println(messageEmail);
            return false;
        }

        // эту проверку нужно доработать по аналогии с проверкой имени
        Matcher matcherPhone = PHONE_DIGIT_ONLY.matcher(person.phoneNumber());
        if (matcherPhone.matches()) {
        } else {
            String messagePhone = String.format("Номер телефона может содержать только цифры.Вы ввели некорректный номер: %s", person.phoneNumber());
            System.out.println(messagePhone);
            return false;
        }
        if ((person.password().isEmpty())) {
            System.out.println("Password не может быть пустой строкой");
            return false;
        } else { // блок else не нужен
            person.password().isEmpty();
        }
        boolean isVerifiedPerson = person.equals(person);  // эта проверка излишняя

        return true; // делаем return true; тк если код дошел до этой строки, значит все данные пользователя в порядке
        //return isVerifiedPerson;
    }
}

















