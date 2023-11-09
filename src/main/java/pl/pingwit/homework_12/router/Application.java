package pl.pingwit.homework_12.router;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Router router = new Router("ATRM-45", "WiFi_01", new GameConsole("Playstation", "Sony PS4"));

        System.out.println(router.connectWiFi("GameConsole"));
    }
}
