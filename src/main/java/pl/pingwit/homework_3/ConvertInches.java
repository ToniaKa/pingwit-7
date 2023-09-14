package pl.pingwit.homework_3;

public class ConvertInches {
    public static final double INCH = 2.54;

    /* Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
    для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/
    public static void main(String[] args) {
        // можно вынести 2.54 в константу
        for (int i = 1; i <= 20; i++) {
            double convertToSant = INCH * i;
            System.out.println(convertToSant);
        }
    }
}
