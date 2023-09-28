package pl.pingwit.homework_6;
public class CarInformation {
    private String CarNumber;
    private OwnerInformation Information;
    public String getCarNumber() {
        return CarNumber;
    }
    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }
    public CarInformation() {

    }
    public CarInformation(String carNumber, OwnerInformation information) {
        CarNumber = carNumber;
        Information = information;
    }
    public OwnerInformation getInformation() {
        return Information;
    }
    public void setInformation(OwnerInformation information) {
        Information = information;
    }
    @Override
    public String toString() {
        return "CarInformation{" +
                "CarNumber='" + CarNumber + '\'' +
                ", Information=" + Information +
                '}';
    }
}