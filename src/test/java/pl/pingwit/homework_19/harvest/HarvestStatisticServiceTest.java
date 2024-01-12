package pl.pingwit.homework_19.harvest;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class HarvestStatisticServiceTest {
    HarvestStatisticService harvestStatisticService = new HarvestStatisticService();

    @Test
    void shouldAcceptEmptyArray() {
        //given
        Harvest[] empty = new Harvest[]{};
        Map<String, HarvestStatistic> expected = new HashMap<>();

        //when
        Map<String, HarvestStatistic> actual = harvestStatisticService.getStatistic(empty);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldCountHarvestStatisticWhenNotEmptyArray() { // неправильно считает цифры после запятой: 2,0+2,0=4,0 и тест зеленый, а если 2,0+2,1=4,2 и тест красный
        //given
        Harvest[] harvests = new Harvest[]{new Harvest("first", new BigDecimal("2.0"), "corn", new BigDecimal("2.0")),
                new Harvest("second", new BigDecimal("2.0"), "rye", new BigDecimal("33.0")),
                new Harvest("second", new BigDecimal("2.10"), "rye", new BigDecimal("33.0"))};
        Map<String, HarvestStatistic> expected = new HashMap<>();
        expected.put("corn", new HarvestStatistic(new BigDecimal("2.0"), new BigDecimal("2.0")));
        expected.put("rye", new HarvestStatistic(new BigDecimal("66.0"), new BigDecimal("4.10")));

        //when
        Map<String, HarvestStatistic> actual = harvestStatisticService.getStatistic(harvests);

        //then
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void shouldReturnedEmptyOptional() {
        //given
        Map<String, HarvestStatistic> expected = new HashMap<>();

        //when
        Map<String, HarvestStatistic> actual = harvestStatisticService.getStatistic(null);

        //then
        assertThat(expected).isEqualTo(actual);
    }
}