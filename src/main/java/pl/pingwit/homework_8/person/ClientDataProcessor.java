package pl.pingwit.homework_8.person;

public class ClientDataProcessor {
    public void process(Person[] people) {  // для метода больше подходят глагольные имена, в данном случае 'process'
        // массив clients в этом метод никак не задействован, но возвращается из метода.  получается, сейчас мы получим массив
        // из Марии Петровой, Ивана Иванова и тд, вне зависимости от того, какие данные мы ввели.
        // предлагаю сделать этот метод void и убрать массив clients

        for (Person person : people) {
            // проверка person.getYearOfBirth() < 2005 & person.getFamilyStatus().equals(FamilyStatus.SINGLE) идентична для обоих гендеров, поэтому ее можно вынести во внешний if
            if (person.getYearOfBirth() < 2005 & person.getFamilyStatus().equals(FamilyStatus.SINGLE)) {
                if (Gender.MALE.equals(person.getGender())) {
                    System.out.println("Уважаемый " + person.getName() + " желаете ли познакомится с девушкой?");
                } else if (Gender.FEMALE.equals(person.getGender())) {
                    System.out.println("Уважаемая " + person.getName() + " мы поможем вам найти мужчину мечты!");
                }
            }
        }
    }
}