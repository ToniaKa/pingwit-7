package pl.pingwit.homework_12.phone;

public abstract class AbstractPhone implements Phone {
    private String model;
    private Integer yearOfRelease;

    public AbstractPhone(String model, Integer yearOfRelease) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean makeCall() {
        return true;
    }

    @Override
    public boolean recieveCall() {
        return true;
    }
}
