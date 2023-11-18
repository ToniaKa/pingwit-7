package pl.pingwit.homework_12.router;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;

public class Router {
    private String name;
    private String networkName;

    private GameConsole gameConsole;

    public Router(String name, String networkName) {
        this.name = name;
        this.networkName = networkName;

    }

    public String connectWiFi(String deviceName) throws IOException { // deviceName передается в метод, но не используется.
        // его нужно использовать в строке 24 вместо gameConsole
        if (RandomUtils.nextBoolean()) {
            throw new IOException("Ошибка подключения, попробуйте повторить попытку чуть позже!");
        }
        return "Устройство " + deviceName + " подключено к сети " + networkName;
    }
}
