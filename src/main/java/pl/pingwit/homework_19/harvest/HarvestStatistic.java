package pl.pingwit.homework_19.harvest;

import java.math.BigDecimal;

public class HarvestStatistic {
    private BigDecimal totalWeight; // нет повода не сделать поял final :)
    private BigDecimal totalSquare;

    public HarvestStatistic(BigDecimal totalWeight, BigDecimal totalSquare) {
        this.totalWeight = totalWeight;
        this.totalSquare = totalSquare;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public BigDecimal getTotalSquare() {
        return totalSquare;
    }


    @Override
    public String toString() {
        return "HarvestStatistic{" +
                "totalWeight=" + totalWeight +
                ", totalSquare=" + totalSquare +
                '}';
    }
}

