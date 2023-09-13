package pl.pingwit.homework_3;

public class Task_3 {
    //Вычислить: 1+2+4+8+...+256
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}