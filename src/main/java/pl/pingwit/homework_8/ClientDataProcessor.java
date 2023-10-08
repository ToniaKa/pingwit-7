package pl.pingwit.homework_8;

public class ClientDataProcessor {
    public Person[] processor(Person[] people) {  // для метода больше подходят глагольные имена, в данном случае 'process'
        // массив clients в этом метод никак не задействован, но возвращается из метода.  получается, сейчас мы получим массив
        // из Марии Петровой, Ивана Иванова и тд, вне зависимости от того, какие данные мы ввели.
        // предлагаю сделать этот метод void и убрать массив clients
        Person[] clients = {new Person("Ivan", "Ivanov", 1984, Gender.MALE, FamilyStatus.SINGLE),
                new Person("Mariya", "Petrova", 1994, Gender.FEMALE, FamilyStatus.SINGLE),
                new Person("Egor", "Rysov", 2008, Gender.MALE, FamilyStatus.SINGLE),
                new Person("Elena", "Kruglova", 1989, Gender.FEMALE, FamilyStatus.MARRIED),
                new Person("Kristina", "Kruglova", 1989, Gender.FEMALE, FamilyStatus.SINGLE)};


        for (Person person : people) {
            // проверка person.getYearOfBirth() < 2005 & person.getFamilyStatus().equals(FamilyStatus.SINGLE) идентична для обоих гендеров, поэтому ее можно вынести во внешний if
           /* if (person.getYearOfBirth() < 2005 & person.getFamilyStatus().equals(FamilyStatus.SINGLE)) {
                if (Gender.MALE.equals(person.getGender())) {
                    System.out.println("Уважаемый " + person.getName() + " желаете ли познакомится с девушкой?");
                } else if (Gender.FEMALE.equals(person.getGender())) {
                    System.out.println("Уважаемая " + person.getName() + " мы поможем вам найти мужчину мечты!");
                }
            }*/
            if (person.getYearOfBirth() < 2005 & person.getFamilyStatus().equals(FamilyStatus.SINGLE) & person.getGender().equals(Gender.MALE)) {
                System.out.println("Уважаемый " + person.getName() + " желаете ли познакомится с девушкой?");
            } else if (person.getYearOfBirth() < 2005 & person.getFamilyStatus().equals(FamilyStatus.SINGLE) & person.getGender().equals(Gender.FEMALE)) {
                System.out.println("Уважаемая " + person.getName() + " мы поможем вам найти мужчину мечты!");
            }
        }
        return clients;
    }
}