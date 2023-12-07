package pl.pingwit.homework_17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDeleteBenchmark {
    public static void main(String[] args) {
        /* Task 2
        Есть ArrayList и LinkedList на 100К одинаковых элементов.
        Нужно написать бенчмарк, который бы показал скорость удаления из СЕРЕДИНЫ у двух этих листов
        Удалить нужно все элементы*/
        int size = 100000;

        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        deleteInMiddle(arrayList, size);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Remove in Middle: " + (endTime - startTime) + " milliseconds");

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        deleteInMiddle(linkedList, size);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Remove in Middle: " + (endTime - startTime) + " milliseconds");

       /* Task 3
        Есть ArrayList и LinkedList на 100К одинаковых элементов.
        Нужно написать бенчмарк, который бы показал скорость удаления из НАЧАЛА у двух этих листов
        Удалить нужно все элементы*/

        List<Integer> arrayList2 = new LinkedList<>();
        startTime = System.currentTimeMillis();
        deleteInBeginner(arrayList2, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Remove in Beginner: " + (endTime - startTime) + " milliseconds");

        List<Integer> linkedList2 = new LinkedList<>();
        startTime = System.currentTimeMillis();
        deleteInBeginner(linkedList2, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Remove in Beginner: " + (endTime - startTime) + " milliseconds");
    }

    private static void deleteInBeginner(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.clear();
        }
    }

    private static void deleteInMiddle(List<Integer> list, int size) {
        for (int i = size / 2; i < size; i++) {
            list.clear();

        }
    }
}
