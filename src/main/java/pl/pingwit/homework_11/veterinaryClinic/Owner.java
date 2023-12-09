package pl.pingwit.homework_11.veterinaryClinic;

public record Owner(String name, String surname, String phoneNumber, String email) {

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

