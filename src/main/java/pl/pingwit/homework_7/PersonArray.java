package pl.pingwit.homework_7;
import java.util.Arrays;
public class PersonArray { // task 2
    public static void main(String[] args) {
        Person name = new Person();
        Person ownerInformation = new Person("Ivan", 35);

        Person[] array = {name, ownerInformation};
        System.out.println(Arrays.toString(array));
    }
}
