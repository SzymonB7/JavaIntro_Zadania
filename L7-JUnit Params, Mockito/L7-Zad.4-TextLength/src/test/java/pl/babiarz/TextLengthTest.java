package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextLengthTest {
    @ParameterizedTest
    @MethodSource ("provideStringsForGetTextLength")
    void shouldReturnTextLength(String text, int expected){
        int textLength = TextLength.getTextLength(text);
        Assertions.assertEquals(expected, textLength);
    }

    private static Stream<Arguments> provideStringsForGetTextLength() {
        return Stream.of (
                Arguments.of("Bułka", 5),
                Arguments.of("Akordeon", 8),
                Arguments.of("Prestydygitator", 15),
                Arguments.of("Nic", 3)
        );
    }
}