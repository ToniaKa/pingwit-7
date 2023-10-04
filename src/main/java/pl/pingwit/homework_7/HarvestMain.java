package pl.pingwit.homework_7;

import java.math.BigDecimal;
import java.util.Arrays;

public class HarvestMain {

    public static void main(String[] args) {

        Harvest harvest1 = new Harvest(14528478L, "Zareche", "Rye", new BigDecimal("1458.48"));
        Harvest harvest2 = new Harvest(14545478L, "Ushod", "Wheat", new BigDecimal("4587.74"));
        Harvest harvest3 = new Harvest(18577478L, "Negoreloe", "Strawberry", new BigDecimal("4578.25"));
        Harvest harvest4 = new Harvest(18545478L, "Zarechee", "Potato", new BigDecimal("12458.01"));
        Harvest harvest5 = new Harvest(18545478L, "Zareche", "Rye", new BigDecimal("34234.01"));
        Harvest harvest6 = new Harvest(18545478L, "Ushod", "Rye", new BigDecimal("35.01"));
        Harvest harvest7 = new Harvest(18545478L, "Negoreloe", "Potato", new BigDecimal("35345.01"));
        Harvest harvest8 = new Harvest(18545478L, "Ushod", "Strawberry", new BigDecimal("8798.01"));

        Harvest[] harvests = {harvest1, harvest2, harvest3, harvest4, harvest5, harvest6, harvest7, harvest8};
        System.out.println(Arrays.toString(harvests));

        HarvestStatisticsService statisticsServis = new HarvestStatisticsService();
        statisticsServis.countHarvest(harvests);

        System.out.println("Статистика урожая по каждой культуре: " + Arrays.toString(statisticsServis.countHarvest(harvests)));
    }

}



