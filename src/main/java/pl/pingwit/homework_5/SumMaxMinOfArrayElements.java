package pl.pingwit.homework_5;
import java.util.Arrays;
import java.util.Scanner;
public class SumMaxMinOfArrayElements {
/*    Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его.
    Вывести сумму, наименьшее и наибольшее из чисел на экран*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int element = scanner.nextInt(); //длина массива
        int[] numbersArray = new int[element]; //создала массив
        System.out.println("Введите значения в массив "); //заполняю массив
        for (int i = 0; i < element; i++) {
            numbersArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.stream(numbersArray).sum() + " сумма значений массива");
        System.out.println(Arrays.stream(numbersArray).max() + " наибольшее значение массива");
        System.out.println(Arrays.stream(numbersArray).min() + " наименьшее значение массива");
    }
}
