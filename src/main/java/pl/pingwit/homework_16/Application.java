package pl.pingwit.homework_16;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {
      /*  CustomerDetails customerDetails=new CustomerDetails("Anna","Belova","toff@.mail.ru","2548548", LocalDate.of(2023,11,10),1);
        EmailValidator emailValidator=new EmailValidator();
        //emailValidator.validate(customerDetails);


        CustomerDetails newCustomerDetails=new CustomerDetails("Andrey","Belov","toff@mail.ru","254o8548", LocalDate.of(2023,11,10),2);
        OnlyDigitsValidator onlyDigitsValidator=new OnlyDigitsValidator();
        //onlyDigitsValidator.phoneValidate(newCustomerDetails);*/


        CustomerDetails customerDetails1=new CustomerDetails(null,null,null,null,null,null);
        DefaultValueProcessor defaultValueProcessor=new DefaultValueProcessor();
        defaultValueProcessor.process(customerDetails1);
        System.out.println(customerDetails1);
    }
}
