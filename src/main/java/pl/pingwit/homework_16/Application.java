package pl.pingwit.homework_16;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        String path = "src/main/java/pl/pingwit/homework_16/motorcycle.ping";
        Motorcycle motorcycle = new Motorcycle("HONDA", "CBR-125", 1.25, "used");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(motorcycle);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String path2 = "src/main/java/pl/pingwit/homework_16/motorcycle.ping";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path2))) {
            Motorcycle moto = (Motorcycle) ois.readObject();
            System.out.println(moto);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // в этом файле нужно отформатировать код.также, вынесли плиз работу с АТМ в отделный класс
    }
}


