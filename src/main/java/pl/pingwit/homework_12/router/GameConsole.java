package pl.pingwit.homework_12.router;

public class GameConsole {
    private String name;
    private String model;

    public GameConsole(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
