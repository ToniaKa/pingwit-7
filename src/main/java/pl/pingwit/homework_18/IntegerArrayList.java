package pl.pingwit.homework_18;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {

       /* Task 3
        Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент в начало списка
        и выведите на экран.
        Затем удалите из него все четные элементы. И снова выведите на экран*/

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        insertToStartNumbers(integerArrayList);
        removeEvenNumbers(integerArrayList);
    }

    private static void insertToStartNumbers(ArrayList<Integer> list) {

        for (int i = 0; i <= 100; i++) {
            list.add(0, i);
            System.out.println(list);
        }
    }

    private static void removeEvenNumbers(ArrayList<Integer> list) {

        for (int j = list.size(); j-- > 0; ) {
            if ((list.get(j) % 2) == 0) {
                list.remove(j);
            }
        }
        System.out.println(list);
    }
}







