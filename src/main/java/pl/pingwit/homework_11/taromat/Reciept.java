package pl.pingwit.homework_11.taromat;

import java.math.BigDecimal;
import java.util.Objects;

public class Reciept {
    private String message;
    private BigDecimal amount;

    public Reciept(String message, BigDecimal amount) {
        this.message = message;
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reciept reciept = (Reciept) o;
        return Objects.equals(message, reciept.message) && Objects.equals(amount, reciept.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, amount);
    }

    @Override
    public String toString() {
        return "Reciept{" +
                "message='" + message + '\'' +
                ", amount=" + amount +
                '}';
    }
}
