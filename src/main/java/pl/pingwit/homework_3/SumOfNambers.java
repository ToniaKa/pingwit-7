package pl.pingwit.homework_3;

public class SumOfNambers {
    /*  Даны числа от 0 до 100.
         - Посчитать сумму четных и вывести на экран
         - Посчитать сумму нечетных и вывести на экран
         - Найти общую сумму всех чисел*/
    public static void main(String[] args) {
        // по возможности, лучше использовать перевод: oddSum, evenSum, а не транслитерацию
        int evenSum = 0; //четные
        int oddSum = 0; //нечетные
        int allSum = 0; // сумма
        // а сможешь написать решение, где обе суммы посчитаются в одном цикле?
        // пригодится if - else и оператор %
        for (int i = 0; i <= 100; i += 2) {
            evenSum = evenSum + i;
        }
        for (int i = 1; i <= 99; i += 2) {
            oddSum = oddSum + i;
            allSum = evenSum + oddSum;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(allSum);
    }
}
