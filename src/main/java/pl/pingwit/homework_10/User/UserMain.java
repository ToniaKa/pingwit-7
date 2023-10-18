package pl.pingwit.homework_10.User;

import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш username");
        String userName = scanner.nextLine();

        System.out.println("Введите вашe Имя");
        String name = scanner.nextLine();

        System.out.println("Введите вашу Фамилию");
        String surname = scanner.nextLine();

        System.out.println("Введите ваш email");
        String email = scanner.nextLine();

        System.out.println("Введите ваш телефон");
        String phone = scanner.nextLine();

        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        UserData person = new UserData(userName, name, surname, email, phone, password);
        System.out.println(person);

        UserValidator userValidator = new UserValidator();  // переменной подошло бы имя userValidator
        boolean checkPerson = userValidator.isVallid(person);
        System.out.println(checkPerson);
    }
}
