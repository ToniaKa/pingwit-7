package pl.pingwit.homework_5;
import java.util.Arrays;
public class EvenOfArrayElements {
    //Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
    public static void main(String[] args) {
        int[] myFirstArray = {1, 2, 3, 4, 56, 7, 8, 998};
        int lengthOfNewArray = 0;
        int indexOfNewArray = 0;
        for (int i = 0; i < myFirstArray.length; i++) {
            if (myFirstArray[i] % 2 == 0) {
                lengthOfNewArray++;
            }
        }
        int[] mySecondArray = new int[lengthOfNewArray];
        for (int i = 0; i < myFirstArray.length; i++) {
            if (myFirstArray[i] % 2 == 0) {
                mySecondArray[indexOfNewArray] = myFirstArray[i];
                indexOfNewArray++;
            }
        }
        System.out.println(Arrays.toString(mySecondArray));
    }
}
