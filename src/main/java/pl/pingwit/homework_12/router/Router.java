package pl.pingwit.homework_12.router;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;

public class Router {
    private String name;
    private String networkName;

    private final GameConsole gameConsole;

    public Router(String name, String networkName, GameConsole gameConsole) {
        this.name = name;
        this.networkName = networkName;
        this.gameConsole = gameConsole;
    }

    public String connectWiFi(String deviceName) throws IOException {
        if (RandomUtils.nextBoolean()) {
            throw new IOException("Ошибка подключения, попробуйте повторить попытку чуть позже!");
        }
        return "Устройство " + gameConsole + " подключено к сети " + networkName;
    }
}
