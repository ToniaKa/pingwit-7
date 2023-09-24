package pl.pingwit.homework_5;
import java.util.Arrays;
public class OddOfArrayElements {
    //Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 44;
        myArray[2] = 3;
        myArray[3] = 2;
        myArray[4] = 1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {  //если делится с остатком
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
