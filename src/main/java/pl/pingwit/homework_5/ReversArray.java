package pl.pingwit.homework_5;
import java.util.Arrays;
public class ReversArray {
    // Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]
    public static void main(String[] args) {
        // на таких исходных данных алгоритм не работает, нужно переделать
        // предлагаю не изменять существующий массив, а создать новый массив и в нем хранить элементы в обратном порядке
        // также можно найти решение без доп массива, но надо хранить одно из значений во временной переменной
        int[] myArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};  //    создала массив
        System.out.print(Arrays.toString(myArray)); // распечатала
        System.out.println();  //каретка на новой строке
        int[] new_myArray = new int[myArray.length];  // в именовании переменных применяй camel case, _ не нужно. здесь подошло бы название типа reversedArray
        for (int i = myArray.length - 1; i >= 0; i--) {
            new_myArray[myArray.length - 1 - i] = myArray[i];
        }
        System.out.print(Arrays.toString(new_myArray));
    }
}


