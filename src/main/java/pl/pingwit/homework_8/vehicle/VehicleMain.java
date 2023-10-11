package pl.pingwit.homework_8.vehicle;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("1245NT-25", VehicleType.CAR, 4, 1690);
        Vehicle vehicle2 = new Vehicle("4785TR-3", VehicleType.TRUCK, 2, 3500);
        Vehicle vehicle3 = new Vehicle("3341MM-77", VehicleType.TRUCK, 6, 3550);
        Vehicle vehicle4 = new Vehicle("6665BB-7", VehicleType.CAR, 2, 1990);
        Vehicle vehicle5 = new Vehicle("874544-2", VehicleType.CAR, 3, 2200);

        Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3, vehicle4, vehicle5};

        CashRegister.countCash(vehicles);

        FerryInspector ferryInspector = new FerryInspector();
        boolean checkPassed = ferryInspector.isLoadOk(vehicles);
        System.out.println("Проверка допуска парома к рейсу:" + checkPassed);// метод вернет boolean, и потом на основании этого boolean значения
        // выводи здесь в консоль сообщение о допуске либо недопуске парома к движению
    }
}




