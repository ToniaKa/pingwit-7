package pl.pingwit.homework_4;
public class HalfOfaDiamond {
    /*Нарисуйте оставшиеся 2 треугольника.
            Опционально: можете нарисовать все 4 фигуры, чтобы у вас получился ромб
           *     (1)
           **
           ***
           ****

           ****  (2)
           ***
           **
           *
           */
    public static void main(String[] args) {
        int number = 4;
        // верхняя фигура
        for (int i = 0; i <= number; i += 1) {
            for (int j = 0; j < 4 - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        // нижняя фигура
        for (int i = 0; i <= number; i += 1) {
            for (int j = 0; j < i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4 - i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


