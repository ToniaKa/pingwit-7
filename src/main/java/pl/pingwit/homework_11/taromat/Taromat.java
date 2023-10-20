package pl.pingwit.homework_11.taromat;

import java.math.BigDecimal;

public class Taromat {

    public static final BigDecimal PLASTIC_PRICE = new BigDecimal("0.10");
    public static final BigDecimal GLASS_PRICE = new BigDecimal("0.15");
    public static final BigDecimal ALUMINUM_PRICE = new BigDecimal("0.15");

    public BigDecimal tareCalculator(Tare[] tares) {
        BigDecimal costPlastic;
        BigDecimal costGlass;
        BigDecimal costAluminum;
        BigDecimal amount;

        int quantityPlastic = 0;
        int quantityGlass = 0;
        int quantityAluminum = 0;

        for (Tare tare : tares) {

            if (tare.getMaterial().equals(Material.PLASTIC)) {
                quantityPlastic++;

            }
            if (tare.getMaterial().equals(Material.GLASS)) {
                quantityGlass++;
            }
            if (tare.getMaterial().equals(Material.ALUMINUM)) {
                quantityAluminum++;
            }
        }
        costPlastic = (PLASTIC_PRICE.multiply(BigDecimal.valueOf(quantityPlastic)));
        costGlass = (GLASS_PRICE.multiply(BigDecimal.valueOf(quantityGlass)));
        costAluminum = (ALUMINUM_PRICE.multiply(BigDecimal.valueOf(quantityAluminum)));

        amount = costPlastic.add(costGlass).add(costAluminum);

        System.out.printf("Вы сдали %d пластиковых бутылок, %d стеклянных бутылок, %d алюминиевых банок.Сумма: ", quantityPlastic, quantityGlass, quantityAluminum);

        return amount;

    }
}



