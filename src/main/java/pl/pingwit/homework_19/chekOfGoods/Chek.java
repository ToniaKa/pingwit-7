package pl.pingwit.homework_19.chekOfGoods;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Chek { // предпочтительно использовать перевод, в данном случае, Receipt

    // который будет хранить пары товар - количество
    // здесь недостаточно только цифры.
    private int total;
    private BigDecimal amount;
    private String date;

    public Chek() {
    }

    public Chek(int total, BigDecimal amount, String date) {
        this.total = total;
        this.amount = amount;
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chek chek = (Chek) o;
        return total == chek.total && Objects.equals(amount, chek.amount) && Objects.equals(date, chek.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, amount, date);
    }

    @Override
    public String toString() {
        return "Chek{" +
                "total=" + total +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    // класс Chek - носитель данных, в не нужно помещать сложную логику. Этот метод лучше разместить в отдельном классе
    public Map<String, Chek> getTotalAmount(List<DescriptionOfGood> list) { // этот метод должен получить список, а вернуть только один чек, не Map
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String format = dateTimeFormatter.format(LocalDateTime.now());
        // мап должен хранить в качестве значений не чеки, а количество товаров
        Map<String, Chek> finalChek = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (finalChek.containsKey(list.get(i).name())) {
                int totalAmount = finalChek.get(list.get(i).name()).total;
                BigDecimal totalPtrice = finalChek.get(list.get(i).name()).amount;
                finalChek.put(
                        list.get(i).name(),
                        new Chek(totalAmount + 1, totalPtrice.add(list.get(i).price()), format));
            } else {
                finalChek.put(
                        list.get(i).name(),
                        new Chek(1, list.get(i).price(), format));
            }
        }
        return finalChek;
    }
}



