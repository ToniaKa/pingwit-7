package pl.pingwit.homework_4;

public class Diamond {
    public static void main(String[] args) {
        int number = 4;
        // верхняя фигура
        for (int i = 1; i <= number; i += 1) {

            for (int j = 0; j < number - i; ++j) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // нижняя фигура
        for (int i = 1; i <= number; i += 1) {

            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = number; k >= i; k--) {
                System.out.print("*");
            }

            for (int k = number; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

