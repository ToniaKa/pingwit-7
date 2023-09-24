package pl.pingwit.homework_5;
public class AverageOfArrayElements {
    //Есть массив чисел. Найти среднее арифметическое число элементов массива
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        myIntArray[0] = 60;
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        myIntArray[3] = 40;
        myIntArray[4] = 50;
        int sum = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            sum = sum + myIntArray[i];
        }
        int average = sum / myIntArray.length; //среднее арифметическое
        System.out.println("Среднее арифметическое число элементов массива равно " + average);
    }
}
