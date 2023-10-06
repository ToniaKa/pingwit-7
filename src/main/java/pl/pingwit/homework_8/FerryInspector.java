package pl.pingwit.homework_8;

public class FerryInspector {
    public static final int TOTAL_WEIGHT = 15000;
    public static final int TOTAL_PEOPLE_ON_BORD = 50;
    public boolean checkFerry(Vehicle[] vehicles) {

        int allPeople = 0;
        int totalMass = 0;
        boolean reis;

        for (Vehicle vehicle : vehicles) {
            allPeople += vehicle.getNumberOfPeopleOnBoard();
            totalMass += vehicle.getWeight();
        }
        reis = totalMass < TOTAL_WEIGHT & allPeople < TOTAL_PEOPLE_ON_BORD;
        System.out.println("Проверка допуска парома к рейсу:" + reis);
        return reis;
    }
}

