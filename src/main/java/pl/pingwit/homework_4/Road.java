package pl.pingwit.homework_4;

import java.util.Scanner;

public class Road {
    //При старте программы пользователя просят ввести время в пути в секундах.Затем, при помощи цикла while выводить на экран извилистую дорогу.

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время пути в секундах:");
        int time = scanner.nextInt();

// лишняя пустая строка
        while (time > 1) {
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10 - i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|| | ||");
            }
            for (int i = 1; i < 10; i += 1) {
// лишняя пустая строка
                for (int j = 0; j < i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("|| | ||");
            }
            // лишняя пустая строка
            time--;
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Время выполнения программы: " + elapsed + " мс");
    }
}













    /*for (int j = 10; j > 10 - i; j--) {
            System.out.print("555");*/

       /* while (zzz<10) {
            System.out.println("|| | ||");
            time++;
        }*/
//System.out.println("|| | ||");

