package pl.pingwit.homework_7;

import java.util.Arrays;

public class IntArray {
    /* Создайте массив целых чисел.
     Напишите программу, которая распечатает новый массив, в который поместите элементы первого массива без изменений, если они нечетные,
     а если четные - умножьте их на 5. Пример: исходный массив [4, 6, 10, 7, 1, 0, 2, 2] , результат - [20, 30, 50, 7, 1, 0, 10, 10]*/
    public static void main(String[] args) {
        int[] myIntArray = {10, 12, 5, 8, 45, 98, 5, 14, 4, 17};
        int lengthOfmyIntArray = 0;
        int indexOfNewArray = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            lengthOfmyIntArray++;
        }
        System.out.println(lengthOfmyIntArray);

        int[] myNewArray = new int[myIntArray.length];
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] % 2 != 0) {
                myNewArray[indexOfNewArray] = myIntArray[i];
            }
            if (myIntArray[i] % 2 == 0) {
                myNewArray[indexOfNewArray] = myIntArray[i] * 5;
            }
            indexOfNewArray++;
        }
        System.out.println(Arrays.toString(myNewArray));
    }
}



