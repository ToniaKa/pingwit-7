package pl.pingwit.homework_14;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class DefaultValueProcessorTest {

    DefaultValueProcessor defaultValueProcessor = new DefaultValueProcessor();

    @Test
    void shouldSetDefaultValue_whenStringNull() throws IllegalAccessException {
        CustomerDetails customerDetailsWithStringNull = new CustomerDetails(null, null, null, null, LocalDate.now(), 7);
        // достаточно expected
        CustomerDetails expectedString = new CustomerDetails("defaultValue", "defaultValue", "defaultValue", "defaultValue", LocalDate.now(), 7);

        defaultValueProcessor.process(customerDetailsWithStringNull);
        assertThat(customerDetailsWithStringNull).isEqualTo(expectedString);
    }

    @Test
    void shouldSet0_whenIntegerNull() throws IllegalAccessException {
        CustomerDetails customerDetailsWithIntegerNull = new CustomerDetails("test", "test", "test", "test", LocalDate.now(), null);
        CustomerDetails expectedInteger = new CustomerDetails("test", "test", "test", "test", LocalDate.now(), 0);

        defaultValueProcessor.process(customerDetailsWithIntegerNull);
        assertThat(customerDetailsWithIntegerNull).isEqualTo(expectedInteger);
    }

    @Test
    void shouldSetNow_whenLocalDateIsNull() throws IllegalAccessException {
        CustomerDetails customerDetailsWithLocalDateNull = new CustomerDetails("test", "test", "test", "test", null, 7);
        CustomerDetails expected = new CustomerDetails("test", "test", "test", "test", LocalDate.now(), 7);

        defaultValueProcessor.process(customerDetailsWithLocalDateNull);
        assertThat(customerDetailsWithLocalDateNull).isEqualTo(expected);
    }
}