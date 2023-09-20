package pl.pingwit.homework_4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class СurrencyСonverter_bigDecimal {

    public static final BigDecimal EURO_RATE = new BigDecimal("40.2");

    /*   Написать программу-конвертер валют. (гривна <-> евро в обе стороны)
            Пользователь вводит валюту первым шагом, вторым вводит сумму, на выходе получает сумму в другой валюте.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите валюту: ");
        String currency = scanner.next(); //валюта
        System.out.println("Введите сумму:");
        BigDecimal sum = new BigDecimal(scanner.next());  // опечатка в названии переменной: sum


        BigDecimal resultUah = new BigDecimal(EURO_RATE.multiply(sum).toString());
        BigDecimal resultEuro = new BigDecimal(sum.divide(EURO_RATE, RoundingMode.HALF_EVEN).toString());
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