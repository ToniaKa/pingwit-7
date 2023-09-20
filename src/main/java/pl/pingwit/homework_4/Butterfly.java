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
                System.out.print(" ");
            }

            //зеркальные цифры
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
// низ

        for (int i = 1; i < number; i++) { // попробуй переделать этот цикл на убывание. у меня получилось решение, в котором верх и низ отличаются только условиями в строках 9 и 18, а внутри циклы идентичные. попробуй глянуть в эту сторону
            // первый блок цифр
            for (int j = 1; j <= number - i; j++) { // здесь j должно начинаться с 1
                System.out.print(j);
            }
            // пробелы
            for (int j = 18; j > (number * 2) - (i * 2); j--) {
                System.out.print(" ");
            }
            //зеркальные цифры
            for (int j = number - i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

