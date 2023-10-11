package pl.pingwit.homework_8.vehicle;

public class FerryInspector {
    public static final int ALLOWED_TOTAL_WEIGHT = 15000; // к этим константам я бы добавил префикс ALLOWED_,  чтобы подчеркнуть, что это разрешенные максимальные параметры
    public static final int ALLOWED_TOTAL_PEOPLE_ON_BORD = 50;

    public boolean isLoadOk(Vehicle[] vehicles) { // тк метод возвращает boolean, рекомендую выбрать более уточняющее имя методу: isDepartureAllowed, isLoadOK ....

        int allPeople = 0;
        int totalMass = 0;

        for (Vehicle vehicle : vehicles) {
            allPeople += vehicle.getNumberOfPeopleOnBoard();
            totalMass += vehicle.getWeight();
        }
        boolean departureAllowed = totalMass < ALLOWED_TOTAL_WEIGHT & allPeople < ALLOWED_TOTAL_PEOPLE_ON_BORD;// эту переменную лучше объявить в строке 16, имя для нее подойдет по схеме departureAllowed, checkPassed ...
        return departureAllowed;
    }
}

