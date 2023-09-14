package pl.pingwit.homework_3;

public class SumOfNumbersIfElse {
    /*  Даны числа от 0 до 100.
         - Посчитать сумму четных и вывести на экран
         - Посчитать сумму нечетных и вывести на экран
         - Найти общую сумму всех чисел*/
    public static void main(String[] args) {
        int evenSum = 0; //четные
        int oddSum = 0; //нечетные
        int allSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + i;
            }
            allSum = evenSum + oddSum;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(allSum);
    }
}
