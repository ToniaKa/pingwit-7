package pl.pingwit.homework_11.veterinaryClinic;

import pl.pingwit.homework_11.veterinaryClinic.*;

import java.math.BigDecimal;

public class PetMain {
    public static void main(String[] args) {
        Owner catOwner = new Owner("Ivan", "Petrov", "+375448521526", "ivan@mail.ru");
        Owner dogOwner = new Owner("Vera", "Sedyl", "+375335698524", "vera@gmail.com");
        Owner parrotOwner = new Owner("Kirill", "Ovchinnikov", "+375142587896", "riki@gmail.com");
        Owner hamsterOwner = new Owner("Olga", "Egorova", "+375251254588", "egorova@inbox.com");

        Cat cat = new Cat(123456789L, "Zuchka", catOwner, "Sphinx", 38.4);
        Dog dog = new Dog(12345678945L, "Rex", dogOwner, 15.6, new BigDecimal("12.1"));
        Parrot parrot = new Parrot(12345678923L, "Kesha", parrotOwner, "red", 4.2);
        Hamster hamster = new Hamster(12345678933L, "Homa", hamsterOwner, 3.3, 1.7);
        
        Pet[] pets = {cat, dog, parrot, hamster};
        for (Pet pet : pets) {
            System.out.println(pet.toInformation());
        }
    }
}
