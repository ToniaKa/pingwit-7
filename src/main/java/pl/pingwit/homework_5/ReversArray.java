package pl.pingwit.homework_5;
import java.util.Arrays;
public class ReversArray {
    // Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]
    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 3, 4};  //    создала массив
        System.out.print(Arrays.toString(myArray)); // распечатала
        System.out.println();  //каретка на новой строке
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray.length - 1 - i; //записала значения в массив по индексу
        }
        System.out.print(Arrays.toString(myArray));
    }
}


