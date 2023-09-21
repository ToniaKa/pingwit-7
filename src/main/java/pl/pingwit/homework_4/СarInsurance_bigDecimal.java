package pl.pingwit.homework_4;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class СarInsurance_bigDecimal {
    public static final BigDecimal RATE = new BigDecimal("0.25");
    public static final BigDecimal CAR_ACCIDENT = new BigDecimal("1.2");
    public static final BigDecimal REGULAR_CUSTOMER = new BigDecimal("0.8");

    /* Написать программу для расчета стоимости страховки на автомобиль. Пользователь вводит объем двигателя в см3, постоянный клиент?
    были ли дтп? Тариф - 0.25 евро за см3, если клиент постоянный - скидка 20% (коэффициент 0.8), если были дтп - надбавка 20% (коэфф 1.2)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем двигателя в см3:");
        BigDecimal engine = new BigDecimal(scanner.next()); // объем двигателя
        System.out.println("Были ДТП за прошлый год?");
        boolean carAccident = scanner.nextBoolean(); //ДТП
        System.out.println("Страховались у нас?");
        boolean regularCustomer = scanner.nextBoolean(); // постоянный клиент
        BigDecimal accidentRate = carAccident ? CAR_ACCIDENT : new BigDecimal("1.0");
        //предлагаю упростить немного строку выше: BigDecimal accidentRate = carAccident ? CAR_ACCIDENT : new BigDecimal("1.0");
        BigDecimal regularCustomerRate = regularCustomer ? REGULAR_CUSTOMER : new BigDecimal("1.0");
        //предлагаю упростить немного строку выше: BigDecimal regularCustomerRate = regularCustomer ? REGULAR_CUSTOMER : new BigDecimal("1.0");
        BigDecimal result = engine.multiply(RATE.multiply(accidentRate).multiply(regularCustomerRate).setScale(2, RoundingMode.CEILING));
        System.out.println("Ваш полис стоит " + result + "евро");
    }
}








