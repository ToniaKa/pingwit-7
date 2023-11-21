package pl.pingwit.homework_16;

import java.time.LocalDate;

public class CustomerDetails {
        @DefaultValue
        String name;
        @DefaultValue
        String surname;
        @DefaultValue
        @Email
        String email;
        @DefaultValue
        @OnlyDigits
        String phone;
        @DefaultValue
        LocalDate registrationDate;
        @DefaultValue
        Integer priorityLevel;

        public CustomerDetails(String name, String surname, String email, String phone, LocalDate registrationDate, Integer priorityLevel) {
                this.name = name;
                this.surname = surname;
                this.email = email;
                this.phone = phone;
                this.registrationDate = registrationDate;
                this.priorityLevel = priorityLevel;
        }

        @Override
        public String toString() {
                return "CustomerDetails{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", email='" + email + '\'' +
                        ", phone='" + phone + '\'' +
                        ", registrationDate=" + registrationDate +
                        ", priorityLevel=" + priorityLevel +
                        '}';
        }
}
