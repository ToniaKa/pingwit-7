package pl.pingwit.homework_3;

public class Task_4 {

    //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int res = 0;

        for (int i = 1; i <= a; i++) {
            res = res + b;
        }
        System.out.println(" Результат произведения " + a + " и " + b + " будет равняться: " + res);
    }
}
