package pl.pingwit.homework_19.harvest;

import org.apache.poi.sl.draw.geom.GuideIf;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HarvestStatisticService {
    public Map<String, HarvestStatistic> getStatistic(Harvest[] harvests) {
        if (harvests != null) {
            Map<String, HarvestStatistic> statistics = new HashMap<>(); // идея подсказывает, что statistics будет более правильно
            for (Harvest harvest : harvests) { // по возможности, используй цикл forEach, как подсказывает идея
                if (statistics.containsKey(harvest.getPlant())) {
                    BigDecimal weight = harvest.getWeight();
                    BigDecimal square = harvest.getSquare();

                    /*statistics.put(harvest.getPlant(), new HarvestStatistic(
                            harvest.getWeight().add(weight), harvest.getSquare().add(square)));*/ // проблема в этом коде,

                    HarvestStatistic existingStats = statistics.get(harvest.getPlant()); // так тест зеленый!!!)
                    statistics.put(harvest.getPlant(), new HarvestStatistic(
                            existingStats.totalWeight().add(weight), existingStats.totalSquare().add(square)));
                } else {
                    statistics.put(harvest.getPlant(),
                            new HarvestStatistic(harvest.getWeight(), harvest.getSquare()));
                }
            }
            return statistics;
        } else {
            return new HashMap<>();
        }
    }

    // попробовал сделать код чуть более читаемым:
    public Map<String, HarvestStatistic> getStatisticRefactored(Harvest[] harvests) {
        if (harvests != null) {
            Map<String, HarvestStatistic> statistics = new HashMap<>();
            for (Harvest harvest : harvests) {
                String plant = harvest.getPlant();

                if (statistics.containsKey(plant)) {
                    HarvestStatistic existingStats = statistics.get(plant);
                    statistics.put(plant, new HarvestStatistic(
                            existingStats.totalWeight().add(harvest.getWeight()),
                            existingStats.totalSquare().add(harvest.getSquare())));
                } else {
                    statistics.put(plant, new HarvestStatistic(
                            harvest.getWeight(),
                            harvest.getSquare()));
                }
            }
            return statistics;
        } else {
            return new HashMap<>();
        }
    }
}
