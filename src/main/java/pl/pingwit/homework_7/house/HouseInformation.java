package pl.pingwit.homework_7.house;

import java.util.Arrays;

public class HouseInformation {
    public static void main(String[] args) {
        House house1 = new House("Multi-storey building", 9, 144, false);
        House house2 = new House("Multi-storey building", 9, 144, false);
        House house3 = new House("Individual", 2, 4, true);
        House house4 = new House("Individual", 1, 2, true);
        House house5 = new House("Multi-storey building", 20, 160, false);

        House[] houses = {house1, house2, house3, house4, house5};
        System.out.println(Arrays.toString(houses));

        HouseStatisticsCalculator statisticsCalculator = new HouseStatisticsCalculator();
        int sumRezidents = statisticsCalculator.countMultyBilding(houses);
        System.out.println("Общее число жителей многоэтажных домов составляет:" + sumRezidents);

        printIndividualHouses(houses);
        heatingTurn(houses);

        // три блока вынеси плиз в private static методы
    }

    private static void printIndividualHouses(House[] houses) {
        for (House house : houses) {
            // здесь только один case - в таких случаях принято использовать if(): он проще и в чтении и в написании.
            if (house.getType().equals("Individual")) {
                System.out.println(house);
            }
        }
    }

    private static void heatingTurn(House[] multiHouses) {
        for (House house : multiHouses) {
            if (house.getType().equals("Multi-storey building")) {// здесь только один case - в таких случаях принято использовать if(): он проще и в чтении и в написании.
                if (house.getFloors() > 5) {
                    house.setHeating(true);
                    System.out.println("Отопление включено: " + house);
                }
            }

        }
    }
}