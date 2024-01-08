package pl.pingwit.homework_19.chekOfGoods;

import java.math.BigDecimal;
import java.util.Objects;

public class Receipt { // предпочтительно использовать перевод, в данном случае, Receipt

    // который будет хранить пары товар - количество
    // здесь недостаточно только цифры.
    private int total;
    private BigDecimal amount;
    private String date;

    public Receipt() {
    }
    public Receipt(int total, BigDecimal amount, String date) {
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
        Receipt chek = (Receipt) o;
        return total == chek.total && Objects.equals(amount, chek.amount) && Objects.equals(date, chek.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, amount, date);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "total=" + total +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
    // класс Chek - носитель данных, в не нужно помещать сложную логику. Этот метод лучше разместить в отдельном классе
}



