package pl.pingwit.homework_14;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {

        CustomerDetails nullableCustomerDetails = new CustomerDetails(null, null, null, null, null, null);
        DefaultValueProcessor defaultValueProcessor = new DefaultValueProcessor();
        defaultValueProcessor.process(nullableCustomerDetails);
        System.out.println(nullableCustomerDetails);

        CustomerDetails customerDetails = new CustomerDetails("Anna", "Belova", "toff.@mail.ru", "2548548", LocalDate.of(2023, 11, 10), 1);
        EmailValidator emailValidator = new EmailValidator();
        emailValidator.emailValidate(customerDetails);
        System.out.println(customerDetails);

        CustomerDetails newCustomerDetails = new CustomerDetails("Andrey", "Belov", "toff@mail.ru", "254o8548", LocalDate.of(2023, 11, 10), 2);
        OnlyDigitsValidator onlyDigitsValidator = new OnlyDigitsValidator();
        onlyDigitsValidator.Validate(newCustomerDetails);
    }
}
