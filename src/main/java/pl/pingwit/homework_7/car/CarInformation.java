package pl.pingwit.homework_7.car;

public class CarInformation {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "XC90", 5);
        Car car2 = new Car("Audi", "A6", 4);
        Car car3 = new Car("Audi", "Q3", 5);
        Car car4 = new Car("Hyndai", "SANTA FE", 5);
        Car car5 = new Car("Kia", "Rio", 3);

        Car[] cars = {car1, car2, car3, car4, car5};
        for (Car car : cars) {  // переменную в данном случае надо называть в единственном числе. данный код можно будет прочитать так: "для каждого объекта типа Car car из массива cars сделай такие-то действия"
            System.out.println(car);
        }
        for (Car car : cars) {
            // здесь только один case - в таких случаях принято использовать if(): он проще и в чтении и в написании. Idea согласна со мной в этом плане;)
            if (car.getBrand().equals("Audi")) {
                System.out.println(car);
                for (int j = 1; j <= car.getNumberOfDoors(); j++) {
                    System.out.println("Дверь " + j + " открыта");
                }
            }
        }
    }
}




