package pl.pingwit.homework_7;
public class CarInformation {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "XC90", 5);
        Car car2 = new Car("Audi", "A6", 4);
        Car car3 = new Car("Audi", "Q3", 5);
        Car car4 = new Car("Hyndai", "SANTA FE", 5);
        Car car5 = new Car("Kia", "Rio", 3);

        Car[] cars = {car1, car2, car3, car4, car5};
        for (Car allCars : cars) {
            System.out.println(allCars);
        }
        for (int i = 0; i < cars.length; i++) {
            switch (cars[i].getBrand()) {
                case "Audi":
                    System.out.println(cars[i]);
                    for (int j = 1; j <= cars[i].getNumberOfDoors(); j++) {
                        System.out.println("Дверь " + j + " открыта");
                    }
                    break;
            }
        }
    }
}




