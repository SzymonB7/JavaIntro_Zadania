package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

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

}