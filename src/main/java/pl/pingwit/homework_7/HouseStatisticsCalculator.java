package pl.pingwit.homework_7;

public class HouseStatisticsCalculator {
    public int countMultyBilding(House[] differentHouses) {
        int sumTenants = 0;
        for (House house : differentHouses) {
            // здесь только один case - в таких случаях принято использовать if(): он проще и в чтении и в написании.
            if (house.getType().equals("Multi-storey building")) {
                System.out.println(house);
                for (int j = 0; j < house.getTenants(); j++) {
                    sumTenants++;
                }
            }
        }
        return sumTenants;
    }
}
