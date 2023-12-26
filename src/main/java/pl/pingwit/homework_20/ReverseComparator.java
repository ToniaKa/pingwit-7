package pl.pingwit.homework_20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReverseComparator {
    public static void main(String[] args) {
        /*Task 10
        При помощи лямбда выражения, написать свой компаратор, который бы сортировал лист строк в обратном порядке*/
        List<String> alphabetList = new ArrayList<>();
        alphabetList.add("a");
        alphabetList.add("b");
        alphabetList.add("c");
        alphabetList.add("d");
        alphabetList.add("e");
        alphabetList.add("f");
        alphabetList.add("g");
        alphabetList.add("h");
        alphabetList.add("i");
        alphabetList.add("j");

        Comparator<String> alphabetComparator = Comparator.comparing(String::toString).reversed();

        List<String> reverseAlphabet = alphabetList.stream()
                .sorted(alphabetComparator)
                .toList();
        System.out.println(reverseAlphabet);
    }
}
