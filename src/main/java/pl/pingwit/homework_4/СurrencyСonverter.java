package pl.pingwit.homework_4;

import java.util.Scanner;

public class СurrencyСonverter {

    public static final int EURO_RATE = 40;

    /*   Написать программу-конвертер валют. (гривна <-> евро в обе стороны)
            Пользователь вводит валюту первым шагом, вторым вводит сумму, на выходе получает сумму в другой валюте.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите валюту: ");
        String currency = scanner.next(); //валюта
        System.out.println("Введите сумму:");
        int summa = scanner.nextInt();

        int euroRate = EURO_RATE; //курс евро // эту переменную вводить не нужно. используй константу в строках 19 и 20
        int resultUah = euroRate * summa;
        int resultEuro = summa / euroRate;
        switch (currency) {
            case "euro":
                System.out.println("К выдаче " + resultUah + " гривен");
                break;
            case "uah":
                System.out.println("К выдаче " + resultEuro + " евро");
                break;
            default:
                System.out.println("Валюта не поддерживается");
        }
    }
}
//  В целом все хорошо и решение рабочее. Я хотел бы, чтобы ты сделала второй вариант решения, где использовала бы
// не double, а BigDecimal Вычисления, касающиеся денег,
// в реальном коде не проводят через double - давай плиз попрактикуемся