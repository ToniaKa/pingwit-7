package pl.pingwit.homework_5;
public class MultiplicationTable {
    //При помощи двумерного массива вывести на экран таблицу умножения
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10];         // квадрат 10х10
        for (int i = 0; i < multiplicationTable.length; i++) {
            int[] myStringArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};                 // строчки
            for (int j = 0; j < multiplicationTable.length; j++) {
                int[] myColumnArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};              //столбики
                int multTable = myStringArray[i] * myColumnArray[j];
                System.out.print(multTable + " ");
            }
            System.out.println();
        }
    }
}


