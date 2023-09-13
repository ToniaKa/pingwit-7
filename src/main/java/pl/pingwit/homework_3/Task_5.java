package pl.pingwit.homework_3;

public class Task_5 {
   /* Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
    для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/

    public static void main(String[] args) {
        double inch = 2.54;
        for (int i = 1; i <= 20; i++) {
            double konvertToSant = inch * i;
            System.out.println(konvertToSant);
        }

    }
}
