package pl.pingwit.homework_14;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {
    EmailValidator emailValidator = new EmailValidator();

    @Test
    void shouldThrowPingwitException_whenCheckedEmailValidator() {
        CustomerDetails customerDetailsWithEmail = new CustomerDetails("test", "test", "fff.@.gmail.com", "test", LocalDate.of(2012, 12, 12), 7);

        assertThrows(PingwitException.class,
                ()->emailValidator.emailValidate(customerDetailsWithEmail));
    }
}