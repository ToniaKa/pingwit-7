package pl.pingwit.homework_19.chekOfGoods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        DescriptionOfGood good1 = new DescriptionOfGood(1245, "milk", new BigDecimal("10.15"));
        DescriptionOfGood good2 = new DescriptionOfGood(1245, "milk", new BigDecimal("10.15"));
        DescriptionOfGood good3 = new DescriptionOfGood(1243, "bred", new BigDecimal("5.8"));
        DescriptionOfGood good4 = new DescriptionOfGood(1243, "bred", new BigDecimal("5.8"));
        DescriptionOfGood good5 = new DescriptionOfGood(1246, "limon", new BigDecimal("15.2"));
        DescriptionOfGood good6 = new DescriptionOfGood(1247, "banana", new BigDecimal("7.21"));
        DescriptionOfGood good7 = new DescriptionOfGood(1248, "potato", new BigDecimal("4.48"));
        DescriptionOfGood good8 = new DescriptionOfGood(1249, "apple", new BigDecimal("10.18"));

        List<DescriptionOfGood> descriptionOfGoods = new ArrayList<>();
        descriptionOfGoods.add(good1);
        descriptionOfGoods.add(good2);
        descriptionOfGoods.add(good3);
        descriptionOfGoods.add(good4);
        descriptionOfGoods.add(good5);
        descriptionOfGoods.add(good6);
        descriptionOfGoods.add(good7);
        descriptionOfGoods.add(good8);

        Chek chek = new Chek();
        Map<String, Chek> finalChek = chek.getTotalAmount(descriptionOfGoods);
        System.out.println(finalChek);
    }
}
