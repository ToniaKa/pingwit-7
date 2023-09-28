package pl.pingwit.homework_6;
import java.util.Arrays;
public class ArrayBubbleSort {
    //Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком".
    public static void main(String[] args) {
        int [] myArray = {15,12,-2,78,9,45,10};
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length-1; j++) {
                if(myArray[j]>myArray[j+1]){
                    int x=myArray[j]; //временная переменная
                    myArray[j]=myArray[j+1];
                    myArray[j+1]=x;
            }
            }
        }System.out.println(Arrays.toString(myArray));
    }
}
