package pl.pingwit.homework_7;
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

        int sumTenants = 0;
        for (int i = 0; i < houses.length; i++) {
            switch (houses[i].getType()) {
                case "Multi-storey building":
                    System.out.println(houses[i]);
                    for (int j = 0; j < houses[i].getTenants(); j++) {
                        sumTenants++;
                    }
                    break;
            }
        }
        System.out.println("Общее число жителей многоэтажных домов составляет:" + sumTenants);
        for (int i = 0; i < houses.length; i++) {
            switch (houses[i].getType()) {
                case "Individual":
                    System.out.println(houses[i]);
            }
        }
        for (int i = 0; i < houses.length; i++) {
            switch (houses[i].getType()) {
                case "Multi-storey building":
                    if (houses[i].getFloors() > 5) {
                        houses[i].setHeating(true);
                        System.out.println("Отопление включено: " + houses[i]);
                    }
            }
        }
    }
}



