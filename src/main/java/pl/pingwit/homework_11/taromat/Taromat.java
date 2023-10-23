package pl.pingwit.homework_11.taromat;

import java.math.BigDecimal;

public class Taromat {

    public static final BigDecimal PLASTIC_PRICE = new BigDecimal("0.10");
    public static final BigDecimal GLASS_PRICE = new BigDecimal("0.15");
    public static final BigDecimal ALUMINUM_PRICE = new BigDecimal("0.15");

    // методам лучше давать глагольные имена. в данном случае таромат принимает тару: acceptTare, calculateReceipt...
    public Reciept tareCalculator(Tare[] tares) { // нужно изменить тип возвращаемого значения на Reciept
        // эти поля лучше объявить там, где они используются - в строках 39, 40, 41 соответственно
        BigDecimal costPlastic;
        BigDecimal costGlass;
        BigDecimal costAluminum;

        int quantityPlastic = 0;
        int quantityGlass = 0;
        int quantityAluminum = 0;

        for (Tare tare : tares) {
            // здесь бы и обновленный Switch красиво смотрелся бы
            /*switch (tare.getMaterial()) {
                case ALUMINUM -> quantityAluminum++;
                case GLASS -> quantityGlass++;
                case PLASTIC -> quantityPlastic++;
            }*/
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

        BigDecimal amount = costPlastic.add(costGlass).add(costAluminum); // эту переменную лучше объявить в строке 36: BigDecimal amount = costPlastic.add(costGlass).add(costAluminum);

        // здесь не нужно выводить это сообщение в консоль. Нужно просто "собрать" строку
        String message = String.format("Вы сдали %d пластиковых бутылок, %d стеклянных бутылок, %d алюминиевых банок", quantityPlastic, quantityGlass, quantityAluminum);

        // потом нужно создать объект чека и вернуть его:
        return new Reciept(message, amount);
    }
}



