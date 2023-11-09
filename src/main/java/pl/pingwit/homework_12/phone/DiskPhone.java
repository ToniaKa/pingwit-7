package pl.pingwit.homework_12.phone;

public class DiskPhone extends AbstractPhone {
    private Double cordLength;

    public DiskPhone(String model, Integer yearOfRelease, Double cordLength) {
        super(model, yearOfRelease);
        this.cordLength = cordLength;
    }

    @Override
    public boolean makeCall() {
        return false;
    }

    @Override
    public boolean recieveCall() {
        return super.recieveCall();
    }
}

