package pl.pingwit.homework_12.arrayException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Application {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 9, 21, 14, 15};
        BigDecimal var100 = new BigDecimal("100");
        BigDecimal var9 = new BigDecimal("9");
        for (int i = 0; i < numbers.length; i++) {
            try {
                BigDecimal var1 = new BigDecimal(numbers[i]);
                BigDecimal result = var100.divide(var1.subtract(var9), 2, RoundingMode.HALF_EVEN);
                System.out.println(result);
            } catch (ArithmeticException exception) {
                System.out.println("При обработке элемента № " + numbers[i] + " возникла ошибка:" + exception.getMessage());
            }
        }
    }
}
