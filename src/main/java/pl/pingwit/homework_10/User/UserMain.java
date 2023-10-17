package pl.pingwit.homework_10.User;

import pl.pingwit.homework_10.User.CheckUser;
import pl.pingwit.homework_10.User.UserData;

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

        CheckUser persona = new CheckUser();
        boolean checkPerson = persona.isCheckPerson(person);
        System.out.println(checkPerson);


    }
}
