package pl.pingwit.homework_10.Palindrom;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayPalindromeCheckerTest {
    ArrayPalindromeChecker arrayPalindromeChecker = new ArrayPalindromeChecker();

    @ParameterizedTest
    @ValueSource(strings = {"1221", "abba", "!@@!", "кук"})
    void shouldCheckStringOfDigitsSymbolsCyrillic(String word) {
        boolean actual = arrayPalindromeChecker.isPalindrom(word);
        assertThat(actual).isTrue();
    }
}