package pl.pingwit.homework_7.person;

public class PersonStaticText { //task 3
    public static void main(String[] args) {
        Person first = new Person("Egor", 45);
        Person.setText("Hello world!");
        System.out.println(first);
        System.out.println(Person.getText());

        Person second = new Person("Viktoriya", 41);
        System.out.println(second);
        System.out.println(Person.getText());

        Person third = new Person("Ivan", 22);
        System.out.println(third);
        System.out.println(Person.getText());
    }
}
