package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersTest {
    @ParameterizedTest
    @ValueSource (ints = {0, 2, 8, 28, 150, 3000})
    void shouldVerifyThatNumberIsEven(int number) {
        Assertions.assertTrue(Numbers.isEven(number));
    }
    @ParameterizedTest
    @ValueSource (ints = {1, 7, 13, 21, 333, 1289})
    void shouldVerifyThatNumberIsNotEven(int number){
        Assertions.assertFalse(Numbers.isEven(number));
    }
    @ParameterizedTest
    @CsvSource(value = {"12:3", "245:11", "1549:19", "8322:15"}, delimiter = ':')
    void shouldAddDigitsInNumber (int input, int expected){
        int number = Numbers.addDigits(input);
        Assertions.assertEquals(expected, number);
    }
}