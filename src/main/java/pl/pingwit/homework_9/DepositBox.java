package pl.pingwit.homework_9;

import java.util.Arrays;
import java.util.Objects;

public final class DepositBox {
    private final Integer cellNumber;
    private final String password;
    private final String[] valuables;

    public Integer getCellNumber() {
        return cellNumber;
    }

    public String getPassword() {
        return password;
    }

    public String[] getValuables() {
        return Arrays.copyOf(valuables, valuables.length);
    }

    public DepositBox(Integer cellNumber, String password, String[] valuables) {
        this.cellNumber = cellNumber;
        this.password = password;
        this.valuables = Arrays.copyOf(valuables, valuables.length);
    }

    public String[] extractValuables(String pass) {
        String[] newValuables = {};
        if (pass.equals(getPassword())) {
            return getValuables();
        } else {
            return newValuables;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepositBox that = (DepositBox) o;
        return Objects.equals(cellNumber, that.cellNumber) && Objects.equals(password, that.password) && Objects.equals(valuables, that.valuables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cellNumber, password, Arrays.hashCode(valuables));
    }

    @Override
    public String toString() {
        return "DepositBox{" +
                "cellNumber=" + cellNumber +
                ", password='" + password + '\'' +
                ", valuables='" + Arrays.toString(valuables) + '\'' +
                '}';
    }
}
