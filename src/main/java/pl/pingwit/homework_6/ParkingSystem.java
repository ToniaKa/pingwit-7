package pl.pingwit.homework_6;

public class ParkingSystem {
    public static void main(String[] args) {
        // из всех имен переменных плиз убери подчеркивание: carOwner1, carOwner2 ....
        OwnerInformation ownerCar_1 = new OwnerInformation("Ivan", "Petrov", "294567898", "petrov_1@gmail.com");
        OwnerInformation ownerCar_2 = new OwnerInformation("Tonya", "Kazlouskaya", "295591528", "toshechka_91@gmail.com");
        OwnerInformation ownerCar_3 = new OwnerInformation("Vladimir", "Puzyrin", "335214963", "vlad@mail.ru");
        OwnerInformation ownerCar_4 = new OwnerInformation("Ekaterina", "Rysina", "442587936", "ek-rys@mail.ru");
        OwnerInformation ownerCar_5 = new OwnerInformation("Egor", "Andreev", "295614879", "andreev@inbox.ru");

        CarInformation car_1 = new CarInformation();
        car_1.setCarNumber("1212PP-7");
        car_1.setInformation(ownerCar_1);

        CarInformation car_2 = new CarInformation();
        car_2.setCarNumber("1245PM-5");
        car_2.setInformation(ownerCar_2);

        CarInformation car_3 = new CarInformation();
        car_3.setCarNumber("4585MM-4");
        car_3.setInformation(ownerCar_3);

        CarInformation car_4 = new CarInformation();
        car_4.setCarNumber("6595EE-1");
        car_4.setInformation(ownerCar_4);

        CarInformation car_5 = new CarInformation();
        car_5.setCarNumber("6312BB-2");
        car_5.setInformation(ownerCar_5);
        // я добавил пустые строки для лучшей читабельности. они отделяют логические части кода

        String[] carArray = {String.valueOf(car_1), String.valueOf(car_2), String.valueOf(car_3), String.valueOf(car_4), String.valueOf(car_5)};
        for (String s : carArray) {
            System.out.println(s);
        }

        // все работает, но я имел в виду чуть другой вариант
        CarInformation[] cars = {car_1, car_2, car_3, car_4, car_5};
        for (CarInformation car : cars) {
            System.out.println(car);
        }
    }
}
