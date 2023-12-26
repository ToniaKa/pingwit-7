package pl.pingwit.homework_20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerStream {
    public static void main(String[] args) {
      /*  Task 7.
        С помощью метода  IntStream.range(..., ...) создайте поток чисел от 50 до 150. В потоке оставьте только числа, которые делатся на 7
        и соберите их в список.*/

        IntStream range = IntStream.range(50, 150).filter(i -> i % 7 == 0);
        int[] array = range.toArray();
        System.out.println(Arrays.toString(array));
    }
}
