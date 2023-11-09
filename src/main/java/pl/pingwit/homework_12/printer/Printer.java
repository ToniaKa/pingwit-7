package pl.pingwit.homework_12.printer;

import org.apache.commons.lang3.RandomUtils;

public class Printer {
    public String turnOn() {
        return "Принтер включен";
    }

    public String print(String document) {
        try {
            if (RandomUtils.nextBoolean()) {
                throw new PingwitException("Извините, возникла техническая неполадка, попробуйте позже!");
            }
            return document;
        } finally {
            turnOff();
        }
    }

    public void turnOff() {
        System.out.println("Принтер выключен");
    }
}
