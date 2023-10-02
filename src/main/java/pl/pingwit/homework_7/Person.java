package pl.pingwit.homework_7;
public class Person {  //task 1
    private String name;
    private Integer age;
    private static String text = "Hello from static";
    public static String getText() {
        return text;
    }
    public static void setText(String text) {
        Person.text = text;
    }
    {
        System.out.println("Создан новый экземпляр класса");
    }
    public Person() {
    }
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
