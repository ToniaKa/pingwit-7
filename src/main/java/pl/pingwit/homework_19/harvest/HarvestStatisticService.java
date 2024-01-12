package pl.pingwit.homework_19.harvest;

import org.apache.poi.sl.draw.geom.GuideIf;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HarvestStatisticService {
    public Map<String, HarvestStatistic> getStatistic(Harvest[] harvests) {
        if (harvests!=null){
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
    }else {
             return new HashMap<>();
        }
    }
}
