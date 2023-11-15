package pl.pingwit.homework_12.arrayException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Application {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 9, 21, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
            try {
                BigDecimal var100 = new BigDecimal("100"); // для экономии памяти, эту переменную лучше создавать до цикла. на всех итерациях цикла она имеет одно и то же значение
                BigDecimal var1 = new BigDecimal(numbers[i]);
                BigDecimal var9 = new BigDecimal("9"); // см строку 11

                BigDecimal result = var100.divide(var1.subtract(var9), 2, RoundingMode.HALF_EVEN);

                System.out.println(result);
            } catch (ArithmeticException exception) {
                System.out.println("При обработке элемента № " + numbers[i] + " возникла ошибка:" + exception.getMessage());
            }
        }
    }
}
