package pl.pingwit.homework_12.router;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        // уточню задание: при создании объекта роутера, в конструктор не нужно передавать консоль
        Router router = new Router("ATRM-45", "WiFi_01");
        // а здесь передать строку:
         GameConsole gameConsole = new GameConsole("Playstation", "Sony PS4");
         System.out.println(router.connectWiFi(gameConsole.toString()));

    }
}
