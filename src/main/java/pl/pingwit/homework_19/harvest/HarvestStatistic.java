package pl.pingwit.homework_19.harvest;

import java.math.BigDecimal;

/**
 * @param totalWeight нет повода не сделать поял final :)
 */
public record HarvestStatistic(BigDecimal totalWeight, BigDecimal totalSquare) {

}

