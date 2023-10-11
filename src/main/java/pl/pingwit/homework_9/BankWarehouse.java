package pl.pingwit.homework_9;

import java.util.Arrays;
import java.util.Objects;

public class BankWarehouse {
    private final String storageName;
    private final DepositBox[] depositBoxes;

    public BankWarehouse(String storageName, DepositBox[] depositBoxes) {
        this.storageName = storageName;
        this.depositBoxes = Arrays.copyOf(depositBoxes, depositBoxes.length);
    }

    public String getStorageName() {
        return storageName;
    }

    public DepositBox[] getDepositBoxes() {
        return Arrays.copyOf(depositBoxes, depositBoxes.length);
    }

    int counter = 0;

    public DepositBox next() {

        if (counter < depositBoxes.length - 1) {
            return depositBoxes[counter++];
        } else {
            counter = 0;
            return depositBoxes[depositBoxes.length - 1];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankWarehouse that = (BankWarehouse) o;
        return Objects.equals(storageName, that.storageName) && Arrays.equals(depositBoxes, that.depositBoxes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(storageName);
        result = 31 * result + Arrays.hashCode(depositBoxes);
        return result;
    }

    @Override
    public String toString() {
        return "BankWarehouse{" +
                "storageName='" + storageName + '\'' +
                ", depositBoxes=" + Arrays.toString(depositBoxes) +
                '}';
    }
}





