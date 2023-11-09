package pl.pingwit.homework_12.printer;

public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println(printer.turnOn());

        System.out.println(printer.print("Идет печать!"));
    }
}
