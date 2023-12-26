package pl.pingwit.homework_19.harvest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HarvestStatisticService {
    public Map<String, HarvestStatistic> getStatistic(Harvest[] harvests) {
        Map<String, HarvestStatistic> statistics = new HashMap<>(); // идея подсказывает, что statistics будет более правильно
        for (Harvest harvest : harvests) { // по возможности, используй цикл forEach, как подсказывает идея
            if (statistics.containsKey(harvest.getPlant())) {
                BigDecimal weight = harvest.getWeight();
                BigDecimal square = harvest.getSquare();
                statistics.put(harvest.getPlant(), new HarvestStatistic(
                        harvest.getWeight().add(weight), harvest.getSquare().add(square)));
            } else {
                statistics.put(harvest.getPlant(),
                        new HarvestStatistic(harvest.getWeight(), harvest.getSquare()));
            }
        }
        return statistics;
    }
}
