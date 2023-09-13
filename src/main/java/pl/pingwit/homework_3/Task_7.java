package pl.pingwit.homework_3;

public class Task_7 {
    //Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
    public static void main(String[] args) {
        int sumNeChet = 0;
        for (int i = 1; i <= 99; i += 2) {
            sumNeChet = sumNeChet + i;
        }
        System.out.println(sumNeChet);


    }


}
