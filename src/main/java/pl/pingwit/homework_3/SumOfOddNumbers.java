package pl.pingwit.homework_3;

public class SumOfOddNumbers {
    //Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
    public static void main(String[] args) {
        // по возможности, лучше использовать перевод: oddSum, evenSum, а не транслитерацию
        int oddSum = 0;
        for (int i = 1; i <= 99; i += 2) {
            oddSum = oddSum + i;
        }
        System.out.println(oddSum);
// пустые строки в концах методов не нужны
    }
}
