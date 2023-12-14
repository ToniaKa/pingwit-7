package pl.pingwit.homework_18;

import java.util.ArrayList;
import java.util.List;

public class RetainCollections {
    public static void main(String[] args) {
      /*  Task 5
        Есть две коллекции, нужно оставить в первой только те, которые есть во второй*/

        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Inna");
        names.add("Antanina");
        names.add("Vika");
        names.add("Vera");

        List<String> names2 = new ArrayList<>();
        names2.add("Anna");
        names2.add("Valentina");
        names2.add("Marina");
        names2.add("Maria");
        names2.add("Inna");
        names2.add("Alla");

        for (int i = 0; i < names.size(); i++) {
            if (names.retainAll(names2)) {
                System.out.println(names);
            }
        }
    }
}
