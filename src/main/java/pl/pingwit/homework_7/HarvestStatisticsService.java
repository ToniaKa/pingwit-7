package pl.pingwit.homework_7;

import java.math.BigDecimal;

public class HarvestStatisticsService {
    public HarvestStatistic[] countHarvest(Harvest[] harvests) {
        HarvestStatistic[] sum = {new HarvestStatistic("Rye", new BigDecimal("0")),
                new HarvestStatistic("Wheat", new BigDecimal("0")),
                new HarvestStatistic("Strawberry", new BigDecimal("0")),
                new HarvestStatistic("Potato", new BigDecimal("0"))};

        for (Harvest harvest : harvests) {

            switch (harvest.getPlant()) {
                case "Rye" -> sum[0].setTotalWeight(sum[0].getTotalWeight().add(harvest.getWeight()));
                case "Wheat" -> sum[1].setTotalWeight(sum[1].getTotalWeight().add(harvest.getWeight()));
                case "Strawberry" -> sum[2].setTotalWeight(sum[2].getTotalWeight().add(harvest.getWeight()));
                case "Potato" -> sum[3].setTotalWeight(sum[3].getTotalWeight().add(harvest.getWeight()));
            }

        }

        return sum;
    }
}
