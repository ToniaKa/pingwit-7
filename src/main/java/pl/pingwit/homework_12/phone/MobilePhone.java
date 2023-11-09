package pl.pingwit.homework_12.phone;

public class MobilePhone extends AbstractPhone {
    private boolean isMessage;
    private boolean isCamera;
    private PhoneTypes type;

    public MobilePhone(String model, Integer yearOfRelease, boolean isMessage, boolean isCamera, PhoneTypes type) {
        super(model, yearOfRelease);
        this.isMessage = isMessage;
        this.isCamera = isCamera;
        this.type = type;
    }

    @Override
    public boolean makeCall() {
        return super.makeCall();
    }

    @Override
    public boolean recieveCall() {
        return super.recieveCall();
    }
}
