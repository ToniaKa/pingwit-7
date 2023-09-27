package pl.pingwit.homework_5;
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
        int sumOfElements = 0;
        int maxElement = numbersArray[0];
        int minElement = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++) {
            sumOfElements = sumOfElements + numbersArray[i];
            if (numbersArray[i] > maxElement) {
                maxElement = numbersArray[i];
            }
            if (numbersArray[i] < minElement) {
                minElement = numbersArray[i];
            }
        }
        System.out.println(maxElement + " наибольшее значение массива");
        System.out.println(minElement + " наименьшее значение массива");
        System.out.println(sumOfElements + " сумма значений массива");
        // Задача решена, зачет. Но я хотел бы видеть здесь решение без использования Arrays.stream()
        // предлагаю переделать решение после занятия 6
    }
}
