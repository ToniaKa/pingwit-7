package pl.pingwit.homework_7.car;

import pl.pingwit.homework_7.house.House;
import pl.pingwit.homework_7.house.HouseCatalog;

import java.util.Arrays;

public class CatalogHouseInformation {
    public static void main(String[] args) {
        House[] housesList = {
                new House("Multi-storey building", 9, 144, false),
                new House("Multi-storey building", 9, 144, false),
                new House("Individual", 2, 4, true),
                new House("Individual", 1, 2, true),
                new House("Multi-storey building", 20, 160, false)};

        System.out.println(Arrays.toString(housesList));

        HouseCatalog catalogHouse = new HouseCatalog("Minsk", "Sovetski", housesList);
        System.out.println(catalogHouse);
    }
}
