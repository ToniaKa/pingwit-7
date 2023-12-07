package pl.pingwit.homework_17;

import pl.pingwit.homework_11.veterinaryClinic.*;

import java.math.BigDecimal;
import java.util.Arrays;

public class GenericMain {
    public static void main(String[] args) {
        /*Task 4
        Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте в классе метод,
        который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())*/

        GenericClass<?> someClass = new GenericClass<>(3.12);
        someClass.getType();

        /*Task 5
        Напишите generic класс, который может хранить и возвращать массив объектов-наследников класса Pet из занятия 12.*/

        GenericPet<Pet> genericPet = new GenericPet<>(new Pet[]{new Dog(1212121212121212L, "Rex", new Owner("Anna", "Ivanova", "+375896584", "jj@gmail.com"), 12.1, new BigDecimal("2.2")),
                new Cat(1313131313131313L, "Semen", new Owner("Ivan", "Petrov", "+54785964", "petrov@mail.ru"), "Mainkun", 32.5),
                new Hamster(1414141414141414L, "Homa", new Owner("Kim", "Kirov", "+457854969", "rrr12@gmail.com"), 2.2, 2.5),
                new Parrot(151515151515151551L, "Kesha", new Owner("Alla", "Ivanovich", "+187985869", "alla_12@yandex.by"), "red", 2.1)});

        Pet[] pets = genericPet.getPets();
        System.out.println(Arrays.toString(pets));
    }
}

