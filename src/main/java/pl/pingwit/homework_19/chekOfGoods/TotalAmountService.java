package pl.pingwit.homework_19.chekOfGoods;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalAmountService {
    public Map<String, Receipt> getTotalAmount(List<DescriptionOfGood> list) { // этот метод должен получить список, а вернуть только один чек, не Map
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String format = dateTimeFormatter.format(LocalDateTime.now());
        // мап должен хранить в качестве значений не чеки, а количество товаров
        Map<String, Receipt> finalChek = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (finalChek.containsKey(list.get(i).name())) {
                int totalAmount = finalChek.get(list.get(i).name()).getTotal();
                BigDecimal totalPtrice = finalChek.get(list.get(i).name()).getAmount();
                finalChek.put(
                        list.get(i).name(),
                        new Receipt(totalAmount + 1, totalPtrice.add(list.get(i).price()), format));
            } else {
                finalChek.put(
                        list.get(i).name(),
                        new Receipt(1, list.get(i).price(), format));
            }
        }
        return finalChek;
    }
}
