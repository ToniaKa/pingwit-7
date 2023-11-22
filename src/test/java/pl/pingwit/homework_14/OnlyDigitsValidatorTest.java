package pl.pingwit.homework_14;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class OnlyDigitsValidatorTest {
    OnlyDigitsValidator onlyDigitsValidator=new OnlyDigitsValidator();
    @Test
    void shouldThrowPingwitException_whenCheckedOnlyDigitInPhone() throws IllegalAccessException {

        CustomerDetails customerDetailsWithOnlyDigitPhone = new CustomerDetails("test", "test", "test", "125tt84465", LocalDate.of(2012, 12, 12), 7);
        CustomerDetails expected = new CustomerDetails("test", "test", "test", "12584465", LocalDate.of(2012, 12, 12), 7);

        onlyDigitsValidator.phoneValidate(customerDetailsWithOnlyDigitPhone);
        assertThat(customerDetailsWithOnlyDigitPhone).isEqualTo(expected);


    }
}