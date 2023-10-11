package pl.pingwit.homework_9;

import java.util.Arrays;

public class DepositMain {
    public static void main(String[] args) {
        DepositBox depositBox1 = new DepositBox(1, "12345nn", new String[]{"beads, watches, earrings"});
        DepositBox depositBox2 = new DepositBox(2, "54321nn", new String[]{"book, notepad, pen"});
        DepositBox depositBox3 = new DepositBox(3, "11145nn", new String[]{"service, floor lamp, samovar"});
        DepositBox depositBox4 = new DepositBox(4, "nn12345", new String[]{"guitar, drum, violin"});
        DepositBox depositBox5 = new DepositBox(5, "12311nn", new String[]{"vase, candlestick, jug"});

        DepositBox[] depositBoxes = {depositBox1, depositBox2, depositBox3, depositBox4, depositBox5};

        System.out.println(Arrays.toString(depositBox2.extractValuables("54321nn")));

        BankWarehouse bankWarehouse = new BankWarehouse("StorageFirst", depositBoxes);

        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
    }
}
