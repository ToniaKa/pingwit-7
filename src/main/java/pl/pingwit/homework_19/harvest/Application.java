package pl.pingwit.homework_19.harvest;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Harvest[] harvests = objectMapper.readValue(new File("src/main/java/pl/pingwit/homework_19/harvest/harvest.json"), Harvest[].class);
        System.out.println(Arrays.toString(harvests));

        HarvestStatisticService harvestStatisticService = new HarvestStatisticService();
        Map<String, HarvestStatistic> statistic = harvestStatisticService.getStatistic(harvests);
        System.out.println(statistic);
    }
}
