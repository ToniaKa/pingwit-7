package pl.pingwit.homework_6;

public class ParkingSystem {
    public static void main(String[] args) {
        // из всех имен переменных плиз убери подчеркивание: carOwner1, carOwner2 ....
        OwnerInformation carOwner1 = new OwnerInformation("Ivan", "Petrov", "294567898", "petrov_1@gmail.com");
        OwnerInformation carOwner2 = new OwnerInformation("Tonya", "Kazlouskaya", "295591528", "toshechka_91@gmail.com");
        OwnerInformation carOwner3 = new OwnerInformation("Vladimir", "Puzyrin", "335214963", "vlad@mail.ru");
        OwnerInformation carOwner4 = new OwnerInformation("Ekaterina", "Rysina", "442587936", "ek-rys@mail.ru");
        OwnerInformation carOwner5 = new OwnerInformation("Egor", "Andreev", "295614879", "andreev@inbox.ru");

        CarInformation car_1 = new CarInformation();
        car_1.setCarNumber("1212PP-7");
        car_1.setInformation(carOwner1);

        CarInformation car_2 = new CarInformation();
        car_2.setCarNumber("1245PM-5");
        car_2.setInformation(carOwner2);

        CarInformation car_3 = new CarInformation();
        car_3.setCarNumber("4585MM-4");
        car_3.setInformation(carOwner3);

        CarInformation car_4 = new CarInformation();
        car_4.setCarNumber("6595EE-1");
        car_4.setInformation(carOwner4);

        CarInformation car_5 = new CarInformation();
        car_5.setCarNumber("6312BB-2");
        car_5.setInformation(carOwner5);
        // я добавил пустые строки для лучшей читабельности. они отделяют логические части кода

        // все работает, но я имел в виду чуть другой вариант
        CarInformation[] cars = {car_1, car_2, car_3, car_4, car_5};
        for (CarInformation car : cars) {
            System.out.println(car);
        }
    }
}
