package pl.pingwit.homework_8;

public class ClientDataProcessor {
    public Person[] processor(Person[] people) {
        Person[] clients = {new Person("Ivan", "Ivanov", 1984, Gender.MALE, FamilyStatus.SINGLE),
                new Person("Mariya", "Petrova", 1994, Gender.FEMALE, FamilyStatus.SINGLE),
                new Person("Egor", "Rysov", 2008, Gender.MALE, FamilyStatus.SINGLE),
                new Person("Elena", "Kruglova", 1989, Gender.FEMALE, FamilyStatus.MARRIED),
                new Person("Kristina", "Kruglova", 1989, Gender.FEMALE, FamilyStatus.SINGLE)};


        for (Person person : people) {
            if (person.getYearOfBirth() < 2005 & person.getFamilyStatus().equals(FamilyStatus.SINGLE) & person.getGender().equals(Gender.MALE)) {
                System.out.println("Уважаемый " + person.getName() + " желаете ли познакомится с девушкой?");
            } else if (person.getYearOfBirth() < 2005 & person.getFamilyStatus().equals(FamilyStatus.SINGLE) & person.getGender().equals(Gender.FEMALE)) {
                System.out.println("Уважаемая " + person.getName() + " мы поможем вам найти мужчину мечты!");


            }
        }
        return clients;
    }
}