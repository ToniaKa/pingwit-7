package pl.pingwit.homework_12.phone;

public class RadioPhone extends AbstractPhone {
    private Integer rangeOfAction;

    public RadioPhone(String model, Integer yearOfRelease, Integer rangeOfAction) {
        super(model, yearOfRelease);
        this.rangeOfAction = rangeOfAction;
    }

    @Override
    public boolean makeCall() {
        return super.makeCall();
    }

    @Override
    public boolean recieveCall() {
        return false;
    }
}
