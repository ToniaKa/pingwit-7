package pl.pingwit.homework_4;
import java.util.Scanner;
public class СarInsurance {
    public static final double RATE = 0.25;
    public static final double CAR_ACCIDENT = 1.2;
    public static final double REGULAR_CUSTOMER = 0.8;
    /* Написать программу для расчета стоимости страховки на автомобиль. Пользователь вводит объем двигателя в см3, постоянный клиент?
    были ли дтп? Тариф - 0.25 евро за см3, если клиент постоянный - скидка 20% (коэффициент 0.8), если были дтп - надбавка 20% (коэфф 1.2)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем двигателя в см3:");
        int engine = scanner.nextInt(); // объем двигателя
        System.out.println("Были ДТП за прошлый год?");
        boolean carAccident = scanner.nextBoolean(); //ДТП
        System.out.println("Страховались у нас?");
        boolean regularCustomer = scanner.nextBoolean(); // постоянный клиент
        double rate = RATE; // тариф   // я бы даже не вводил эту переменную, а использовал бы в строке 24 константу
        double res_1 = carAccident ? CAR_ACCIDENT : 1.0;
        double res_2 = regularCustomer ? REGULAR_CUSTOMER : 1.0;
        double result = engine * rate * res_1 * res_2;
        System.out.println("Ваш полис стоит " + result + "евро");
    }
}
//  В целом все хорошо и решение рабочее. Я хотел бы, чтобы ты сделала второй вариант решения, где использовала бы
// не double, а BigDecimal Вычисления, касающиеся денег,
// в реальном коде не проводят через double - давай плиз попрактикуемся








