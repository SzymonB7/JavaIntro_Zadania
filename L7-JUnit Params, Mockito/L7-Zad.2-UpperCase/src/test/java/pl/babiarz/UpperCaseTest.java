package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {

    @ParameterizedTest
    @ValueSource (strings = {"test", "TesT", "tEsT", "tESt"})
    void shouldConvertTextToUpperCase (String text){
        //given
        //when
        String upperCaseText = UpperCase.convertToUpperCase(text);
        //then
        Assertions.assertEquals("TEST", upperCaseText);
    }
    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowInvalidArgumentException (String text){
        assertThrows(InvalidArgumentException.class, () -> UpperCase.convertToUpperCase(text));
    }
}