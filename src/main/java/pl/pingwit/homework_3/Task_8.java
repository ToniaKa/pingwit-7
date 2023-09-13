package pl.pingwit.homework_3;

public class Task_8 {
    /*  Даны числа от 0 до 100.
         - Посчитать сумму четных и вывести на экран
         - Посчитать сумму нечетных и вывести на экран
         - Найти общую сумму всех чисел*/
    public static void main(String[] args) {
        int sumChet = 0;
        int sumNeChet = 0;
        int allSum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sumChet = sumChet + i;
        }
        for (int i = 1; i <= 99; i += 2) {
            sumNeChet = sumNeChet + i;
            allSum = sumChet + sumNeChet;
        }

        System.out.println(sumChet);
        System.out.println(sumNeChet);
        System.out.println(allSum);
    }
}
