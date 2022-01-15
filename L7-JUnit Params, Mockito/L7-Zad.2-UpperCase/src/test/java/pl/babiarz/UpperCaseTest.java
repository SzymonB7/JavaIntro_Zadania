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
        //When
        String upperCaseText = UpperCase.convertToUpperCase(text);
        //Then
        Assertions.assertEquals("TEST", upperCaseText);
    }
    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowInvalidArgumentException (String text){
        assertThrows(InvelidArgumentException.class, () -> UpperCase.convertToUpperCase(text));
    }
}