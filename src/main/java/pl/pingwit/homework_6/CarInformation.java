package pl.pingwit.homework_6;
public class CarInformation {
    private String carNumber;  // поля именуем с маленькой буквы: carNumber. right click -> refactor -> rename
    private OwnerInformation information; // см строку 3

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public CarInformation() {
    }
    public CarInformation(String carNumber, OwnerInformation information) {
        this.carNumber = carNumber;
        this.information = information;
    }
    public OwnerInformation getInformation() {
        return information;
    }

    public void setInformation(OwnerInformation information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "CarInformation{" +
                "CarNumber='" + carNumber + '\'' +
                ", Information=" + information +
                '}';
    }
}
