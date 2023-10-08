package pl.pingwit.homework_8;

public class FerryInspector {
    public static final int TOTAL_WEIGHT = 15000; // к этим константам я бы добавил префикс ALLOWED_,  чтобы подчеркнуть, что это разрешенные максимальные параметры
    public static final int TOTAL_PEOPLE_ON_BORD = 50;
    public boolean checkFerry(Vehicle[] vehicles) { // тк метод возвращает boolean, рекомендую выбрать более уточняющее имя методу: isDepartureAllowed, isLoadOK ....

        int allPeople = 0;
        int totalMass = 0;
        boolean reis;  // эту переменную лучше объявить в строке 16, имя для нее подойдет по схеме departureAllowed, checkPassed ...

        for (Vehicle vehicle : vehicles) {
            allPeople += vehicle.getNumberOfPeopleOnBoard();
            totalMass += vehicle.getWeight();
        }
        reis = totalMass < TOTAL_WEIGHT & allPeople < TOTAL_PEOPLE_ON_BORD;
        System.out.println("Проверка допуска парома к рейсу:" + reis);
        return reis;
    }
}

