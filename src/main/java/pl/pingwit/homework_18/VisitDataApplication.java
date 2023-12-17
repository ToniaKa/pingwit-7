package pl.pingwit.homework_18;

import java.util.*;

public class VisitDataApplication {
    public static void main(String[] args) {
        VisitData visitData1 = new VisitData("Alla", "google.com");
        VisitData visitData8 = new VisitData("Dina", "google.com");
        VisitData visitData2 = new VisitData("Anna", "yandex.ru");
        VisitData visitData7 = new VisitData("Inna", "yandex.ru");
        VisitData visitData3 = new VisitData("Ivan", "kinogo.net");
        VisitData visitData4 = new VisitData("Oleg", "google.com");
        VisitData visitData5 = new VisitData("Marat", "yandex.ru");
        VisitData visitData6 = new VisitData("Ira", "google.com");
        VisitData visitData9 = new VisitData("Ira", "yandex.ru");
        VisitData visitData10 = new VisitData("Ira", "yandex.ru");

        List<VisitData> visitDataArrayList = new ArrayList<>();
        visitDataArrayList.add(visitData1);
        visitDataArrayList.add(visitData2);
        visitDataArrayList.add(visitData3);
        visitDataArrayList.add(visitData4);
        visitDataArrayList.add(visitData5);
        visitDataArrayList.add(visitData6);
        visitDataArrayList.add(visitData7);
        visitDataArrayList.add(visitData8);
        visitDataArrayList.add(visitData9);
        visitDataArrayList.add(visitData10);
        System.out.println(visitDataArrayList);

        Set<String> findName = findUniqueName(visitDataArrayList);
        System.out.println(findName);

        Set<String> findSite = findUniqueSites(visitDataArrayList);
        System.out.println(findSite);

        Map<String, Integer> visitsBySite = countVisitsBySite(visitDataArrayList);
        System.out.println(visitsBySite);

        Map<String, Integer> visitsByUser = countVisitsByUsers(visitDataArrayList);
        System.out.println(visitsByUser);
    }

    public static Set<String> findUniqueName(List<VisitData> webList) { // findUniqueNames подошло бы еще лучше
        SortedSet<String> result = new TreeSet<>();
        for (VisitData web : webList) {
            String name = web.getName();
            result.add(name);
        }
        return result;
    }

    public static Set<String> findUniqueSites(List<VisitData> webList) {
        SortedSet<String> result = new TreeSet<>();
        for (VisitData web : webList) {
            String sites = web.getSite();
            result.add(sites);
        }

        return result;
    }

    public static Map<String, Integer> countVisitsBySite(List<VisitData> webList) {
        SortedMap<String, Integer> visitBySite = new TreeMap<>();
        for (VisitData web : webList) {
            String site = web.getSite();
            if (visitBySite.containsKey(site)) {
                Integer count = visitBySite.get(site);
                visitBySite.put(site, count + 1);
            } else {
                visitBySite.put(site, 1);
            }
        }
        return visitBySite;
    }

    public static Map<String, Integer> countVisitsByUsers(List<VisitData> weblist) {
        Map<String, Integer> visitsByUsers = new HashMap<>();
        for (VisitData web : weblist) {
            String name = web.getName();
            if (visitsByUsers.containsKey(name)) {
                Integer count = visitsByUsers.get(name);
                visitsByUsers.put(name, count + 1);
            } else {
                visitsByUsers.put(name, 1);
            }
        }
        return visitsByUsers;
    }
}



