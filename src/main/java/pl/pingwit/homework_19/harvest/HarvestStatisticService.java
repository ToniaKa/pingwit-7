package pl.pingwit.homework_19.harvest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HarvestStatisticService {
    public Map<String, HarvestStatistic> getStatistic(Harvest[] harvests) {
        Map<String, HarvestStatistic> statistica = new HashMap<>();
        for (int i = 0; i < harvests.length; i++) {
            if (statistica.containsKey(harvests[i].getPlant())) {
                BigDecimal weight = harvests[i].getWeight();
                BigDecimal square = harvests[i].getSquare();
                statistica.put(harvests[i].getPlant(), new HarvestStatistic(
                        harvests[i].getWeight().add(weight), harvests[i].getSquare().add(square)));
            } else {
                statistica.put(harvests[i].getPlant(),
                        new HarvestStatistic(harvests[i].getWeight(), harvests[i].getSquare()));
            }
        }
        return statistica;
    }
}
