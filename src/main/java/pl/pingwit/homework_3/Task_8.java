package pl.pingwit.homework_3;

public class Task_8 {
    /*  Даны числа от 0 до 100.
         - Посчитать сумму четных и вывести на экран
         - Посчитать сумму нечетных и вывести на экран
         - Найти общую сумму всех чисел*/
    public static void main(String[] args) {
        // по возможности, лучше использовать перевод: oddSum, evenSum, а не транслитерацию
        int sumChet = 0;
        int sumNeChet = 0;
        int allSum = 0;
        // а сможешь написать решение, где обе суммы посчитаются в одном цикле?
        // пригодится if - else и оператор %
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
