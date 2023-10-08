package pl.pingwit.homework_8;

import java.math.BigDecimal;

public class CashRegister {
    public static final BigDecimal PRICE_TRUCK = new BigDecimal("30");
    public static final BigDecimal PRICE_CAR_LESS_THAN_2_PEOPLE = new BigDecimal("10");
    public static final BigDecimal PRICE_CAR_MORE_THAN_2_PEOPLE = new BigDecimal("15");

    public Vehicle[] countCash(Vehicle[] vehicles) {  // метод подсчитывает общую выручку парома и количесвтво пассажиров и распчатывает это все в консоль
        // , значит он не должен возвращать  массив машин, а void
        // массив cash в данном случае лишний, его нужно удалить
        Vehicle[] cash = {new Vehicle("1245NT-25", Type.CAR, 4, 1690),
                new Vehicle("4785TR-3", Type.TRUCK, 2, 3500),
                new Vehicle("3341MM-77", Type.TRUCK, 6, 3550),
                new Vehicle("6665BB-7", Type.CAR, 2, 1990),
                new Vehicle("874544-2", Type.CAR, 3, 2200)};

        BigDecimal pay = new BigDecimal("0");
        int people = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals(Type.TRUCK)) {
                people += vehicle.getNumberOfPeopleOnBoard();
                pay = PRICE_TRUCK.add(pay);
                System.out.println("К оплате 30 евро " + vehicle);

            } else if (vehicle.getType().equals(Type.CAR) & vehicle.getNumberOfPeopleOnBoard() <= 2) {
                people += vehicle.getNumberOfPeopleOnBoard();
                pay = PRICE_CAR_LESS_THAN_2_PEOPLE.add(pay);
                System.out.println("К оплате 10 евро " + vehicle);
            } else if (vehicle.getType().equals(Type.CAR) & vehicle.getNumberOfPeopleOnBoard() > 2) {
                pay = PRICE_CAR_MORE_THAN_2_PEOPLE.add(pay);
                people += vehicle.getNumberOfPeopleOnBoard();
                System.out.println("К оплате 15 евро " + vehicle);
            }
        }
        System.out.println("Количество пассажиров на пароме: " + people);
        System.out.println("Сумма оплат: " + pay + " евро");
        return cash;
    }
}
