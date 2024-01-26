package pl.pingwit.homework_22;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        GravelHeap gravelHeap1 = new SynchronizedGravelHeap();
        Truck truck1 = new Truck(gravelHeap1);
        Truck truck2 = new Truck(gravelHeap1);
        Truck truck3 = new Truck(gravelHeap1);
        Truck truck4 = new Truck(gravelHeap1);

        truck1.start();
        truck2.start();
        truck3.start();
        truck4.start();

        truck1.join();
        truck2.join();
        truck3.join();
        truck4.join();

        System.out.println(gravelHeap1.amount());
    }
}
