package pl.pingwit.homework_14;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OnlyDigitsValidatorTest {
    OnlyDigitsValidator onlyDigitsValidator = new OnlyDigitsValidator();

    @Test
    void shouldThrowPingwitException_whenCheckedOnlyDigitInPhone() throws IllegalAccessException {
        CustomerDetails customerDetailsWithOnlyDigitPhone = new CustomerDetails("test", "test", "test", "125tt84465", LocalDate.of(2012, 12, 12), 7);
        //CustomerDetails expected = new CustomerDetails("test", "test", "test", "12584465", LocalDate.of(2012, 12, 12), 7);
        // этот тест проверяет, будет ли брошен эксепшен. поэтому, CustomerDetails expected в данному случае не нужен
        // сейчас этот тест падает, ниже приведу, как выглядят проверки на бросание ошибок

        assertThrows(PingwitException.class,
                () -> onlyDigitsValidator.Validate(customerDetailsWithOnlyDigitPhone));

        // далее также можно проверить сообщение, которое содержится в эксепшене
        // assertThat(customerDetailsWithOnlyDigitPhone).isEqualTo(expected);
    }
}