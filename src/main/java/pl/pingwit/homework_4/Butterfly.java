package pl.pingwit.homework_4;

public class Butterfly {
  /*  Нарисовать на консоли бабочку.
    При запуске программы пользователя просят ввести размер бабочки и затем программа выводит результат на экран.*/

    public static void main(String[] args) {
        int number = 9;
        for (int i = 1; i <= number; i++) {
            // первый блок цифр
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // пробелы
            for (int j = 1; j <= (number * 2) - (i * 2); j++) {
                System.out.print("-");
            }

            //зеркальные цифры
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
// низ

        for (int i = 1; i <= number; i++) {
            // второй блок цифр
            for (int j = number; j >= i; j--) {
                System.out.print(j);
            }
            // пробелы
            for (int j = 15; j >= (number * 2) - (i * 2); --j) {
                System.out.print("-");
            }
            //зеркальные цифры
            for (int j = i; j <= 9; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

