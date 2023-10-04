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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    // добавь плиз в этот класс геттеры и сеттеры, хоть в твоей программе они и не вызываются
    // во всем пакете homework_7 плиз сделай форматирование
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
