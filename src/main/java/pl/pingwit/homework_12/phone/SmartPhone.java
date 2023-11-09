package pl.pingwit.homework_12.phone;

public class SmartPhone extends AbstractPhone {
    private OperatingSystem type;
    private Double screenDiagonal;
    private RandomAccessMemory number;

    public SmartPhone(String model, Integer yearOfRelease, OperatingSystem type, Double screenDiagonal, RandomAccessMemory number) {
        super(model, yearOfRelease);
        this.type = type;
        this.screenDiagonal = screenDiagonal;
        this.number = number;
    }
}
