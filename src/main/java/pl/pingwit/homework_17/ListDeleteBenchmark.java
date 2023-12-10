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

        List<Integer> arrayList = new ArrayList<>();
        fillList(arrayList, 100000);
        long startTime = System.currentTimeMillis();
        deleteInMiddle(arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Remove in Middle: " + (endTime - startTime) + " milliseconds");

        List<Integer> linkedList = new LinkedList<>();
        fillList(linkedList, 100000);
        startTime = System.currentTimeMillis();
        deleteInMiddle(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Remove in Middle: " + (endTime - startTime) + " milliseconds");

       /* Task 3
        Есть ArrayList и LinkedList на 100К одинаковых элементов.
        Нужно написать бенчмарк, который бы показал скорость удаления из НАЧАЛА у двух этих листов
        Удалить нужно все элементы*/

        List<Integer> arrayList2 = new LinkedList<>();
        fillList(arrayList2, 100000);
        startTime = System.currentTimeMillis();
        deleteInBeginner(arrayList2);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Remove in Beginner: " + (endTime - startTime) + " milliseconds");

        List<Integer> linkedList2 = new LinkedList<>();
        fillList(linkedList2, 100000);
        startTime = System.currentTimeMillis();
        deleteInBeginner(linkedList2);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Remove in Beginner: " + (endTime - startTime) + " milliseconds");
    }

    // рекомендация по неймингу: deleteFromBeginning
    private static void deleteInBeginner(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }

    // рекомендация по неймингу: deleteFromMiddle
    private static void deleteInMiddle(List<Integer> list) {
        for (int i = list.size() / 2; i <= list.size(); i++) {
            list.remove(i);
        }
    }

    private static void fillList(List<Integer> list, int size) {
        for (int i = 0; i <= size; i++) {
            list.add(i);
        }
    }
}
